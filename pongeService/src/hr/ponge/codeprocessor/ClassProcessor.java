package hr.ponge.codeprocessor;

import hr.ponge.util.ProxyMethod;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

import spoon.processing.AbstractProcessor;
import spoon.processing.Severity;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtCodeSnippetStatement;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtParameter;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.factory.CodeFactory;
import spoon.reflect.factory.InterfaceFactory;
import spoon.reflect.factory.MethodFactory;
import spoon.reflect.reference.CtTypeReference;

public class ClassProcessor extends AbstractProcessor<CtClass<?>> {
	
	public static final int METHOD_TYPE_GETTER=1;
	public static final int METHOD_TYPE_SETTER=2;
	public static final int METHOD_TYPE_IS_SPECIFIED=3;

	@Override
	public boolean isToBeProcessed(CtClass<?> element) {

		Set<CtTypeReference<?>> intf = element.getSuperInterfaces();
		for (CtTypeReference<?> r : intf) {
			if (r.getQualifiedName().equals(
					"org.apache.axis2.databinding.ADBBean")) {
				return true;
			}

		}

		return false;
	}

	private static PropertiesConfiguration conf;

	private static HashMap<String, String> reverseProperties = new HashMap<String, String>();

	public static PropertiesConfiguration getProperties() {
		if (conf != null) {
			return conf;
		}
		try {
			conf = new PropertiesConfiguration("binding.properties");
		} catch (ConfigurationException e) {
			throw new RuntimeException(e);
		}
		Iterator<String> it = conf.getKeys();
		while (it.hasNext()) {
			String key = it.next();
			String value = (String) conf.getProperty(key);
			reverseProperties.put(value, key);

		}

		return conf;
	}

	public void process(CtClass<?> element) {
		// getFactory().getEnvironment().report(this, Severity.MESSAGE, element,
		// "WORKING ON CLASS " + element.getQualifiedName());

		String intfClass = (String) getProperties().getProperty(
				element.getQualifiedName());

		if (intfClass == null) {
			getFactory().getEnvironment().report(this, Severity.WARNING,
					element,
					"NO INTERFACE CLASS for " + element.getQualifiedName());
			return;
		}

		Class<?> c = null;
		try {
			c = Class.forName(intfClass);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
		InterfaceFactory intf = getFactory().Interface();
		@SuppressWarnings("unchecked")
		CtTypeReference<?> pfaIntf = (CtTypeReference<?>) intf
				.createReference(c);

		element.getSuperInterfaces().add(pfaIntf);

		for (Method m : c.getMethods()) {

			if (m.getAnnotation(ProxyMethod.class) == null) {
				continue;
			}
			// getFactory().getEnvironment().report(this, Severity.MESSAGE,
			// element,
			// "WORKING ON METHOD " + m.getName());
			Class pfaObject = null;
			int methodType = 0;
			if (m.getName().startsWith("get")) {
				Class<?> rt = m.getReturnType();
				pfaObject = rt;
				methodType=METHOD_TYPE_GETTER;
			} else if (m.getName().startsWith("set")
					|| m.getName().startsWith("add")) {
				Class<?>[] prms = m.getParameterTypes();
				pfaObject = prms[0];
				methodType=METHOD_TYPE_SETTER;
			} else if (m.getName().startsWith("is")) {
				Class<?> rt = m.getReturnType();
				pfaObject = rt;
				methodType=METHOD_TYPE_IS_SPECIFIED;
			} else {
				throw new RuntimeException(
						"PROXY METHOD NOT GETTER OR SETTER. CLASS:"
								+ c.getName() + "  METHOD:" + m.getName());
			}

			// getFactory().getEnvironment().report(this, Severity.MESSAGE,
			// element,
			// "PFA OBJECT "+pfaObject+" ON METHOD "+m.getName());
			CtTypeReference<?> ctPfaObject = (CtTypeReference<?>) intf
					.createReference(pfaObject);

			MethodFactory mFac = element.getFactory().Method();
			CodeFactory codeFac = element.getFactory().Code();

			Set<ModifierKind> mod = new LinkedHashSet<ModifierKind>();
			mod.add(ModifierKind.PUBLIC);
			if (methodType==METHOD_TYPE_GETTER) {

				List<CtParameter<?>> params = new ArrayList<CtParameter<?>>();

				CtMethod<Object> newMethod = (CtMethod<Object>) mFac.create(
						element, mod, ctPfaObject, m.getName(), params, null);
				CtBlock<Object> block = newMethod.getFactory().Core()
						.createBlock();

				CtCodeSnippetStatement snippet = newMethod.getFactory().Core()
						.createCodeSnippetStatement();

				// this snippet contains an if check
				snippet.setValue("return "
						+ m.getAnnotation(ProxyMethod.class).origMethod()
						+ "()");

				block.insertEnd(snippet);

				newMethod.setBody(block);

			} else if(methodType==METHOD_TYPE_SETTER) {
				CtParameter<?> param = mFac.createParameter(null, ctPfaObject,
						"arg");

				List<CtParameter<?>> params = new ArrayList<CtParameter<?>>();
				params.add(param);
				CtBlock<Object> block = element.getFactory().Core()
						.createBlock();
				CtTypeReference<Object> voidType = element.getFactory().Type()
						.createReference("void");
				CtMethod<?> newMethod = mFac.create(element, mod, voidType,
						m.getName(), params, null, block);

				CtCodeSnippetStatement snippet = newMethod.getFactory().Core()
						.createCodeSnippetStatement();
				String axisObj = null;
				// this is an array
				if (pfaObject.getName().startsWith("[L")) {
					String key = pfaObject.getName().substring(2,
							pfaObject.getName().length() - 1);
					axisObj = reverseProperties.get(key);
					//axisObj = axisObj + "[]";
					
					//hr.ponge.pfa.axis.base.ErrorType[] er= new hr.ponge.pfa.axis.base.ErrorType[arg.length];
					String code=axisObj + "[] er = new "+axisObj+"[arg.length];\n";
					code=code+" for(int i=0;i<arg.length;i++){ \n";
					code=code+"     er[i]=("+axisObj+") arg[i]; \n";
					code=code+" }\n";
					code=code+m.getAnnotation(ProxyMethod.class)
							.origMethod() + "(er)";
					snippet.setValue(code );
					

				} else {
					axisObj = reverseProperties.get(pfaObject.getName());
					// this snippet contains an if check
					snippet.setValue(m.getAnnotation(ProxyMethod.class)
							.origMethod() + "((" + axisObj + ")arg)");
				}

				getFactory().getEnvironment().report(
						this,
						Severity.MESSAGE,
						element,
						"CLASS IS:" + element.getQualifiedName()
								+ "  PFA OBJECT:" + pfaObject + " ON METHOD:"
								+ m.getName() + "  PFA OBJECT NAME:"
								+ pfaObject.getName());

				

				block.insertEnd(snippet);

				//

			}else if (methodType==METHOD_TYPE_IS_SPECIFIED) {
				List<CtParameter<?>> params = new ArrayList<CtParameter<?>>();

				CtMethod<Object> newMethod = (CtMethod<Object>) mFac.create(
						element, mod, ctPfaObject, m.getName(), params, null);
				CtBlock<Object> block = newMethod.getFactory().Core()
						.createBlock();

				CtCodeSnippetStatement snippet = newMethod.getFactory().Core()
						.createCodeSnippetStatement();

				// this snippet contains an if check
				snippet.setValue("return "
						+ m.getAnnotation(ProxyMethod.class).origMethod()
						+ "()");

				block.insertEnd(snippet);

				newMethod.setBody(block);
				
				
			}

		}

	}

}