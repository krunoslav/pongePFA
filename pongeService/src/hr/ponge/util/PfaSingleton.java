package hr.ponge.util;

import hr.ponge.pfa.PfaException;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.log4j.Logger;

public class PfaSingleton {
	
	private static final Logger log = Logger.getLogger(PfaSingleton.class);

	private HashMap<String, String> bindReverseProperties = new HashMap<String, String>();
	private HashMap<String, String> bindProperties = new HashMap<String, String>();

	private HashMap<String, String> operationMap = new HashMap<String, String>();
	private HashMap<String, String> properties = new HashMap<String, String>();
	private static PfaSingleton factory = new PfaSingleton();

	private PfaSingleton() {
		loadProperties();
	}

	@SuppressWarnings("unchecked")
	private void loadProperties() {

		try {
			PropertiesConfiguration conf = new PropertiesConfiguration(
					"binding.properties");

			Iterator<String> it = conf.getKeys();
			while (it.hasNext()) {
				String key = it.next();
				String value = (String) conf.getProperty(key);
				bindReverseProperties.put(value, key);
				bindProperties.put(key, value);

			}

			conf = new PropertiesConfiguration("operation_mapper.properties");

			it = conf.getKeys();
			while (it.hasNext()) {
				String key = it.next();
				String value = (String) conf.getProperty(key);
				operationMap.put(key, value);

			}

			conf = new PropertiesConfiguration("pfa.properties");

			it = conf.getKeys();
			while (it.hasNext()) {
				String key = it.next();
				String value = (String) conf.getProperty(key);
				properties.put(key, value);

			}

		} catch (ConfigurationException e) {
			throw new RuntimeException(e);
		}
	}

	public String getBindProperty(String key) {
		return bindProperties.get(key);
	}

	public String getBindReversProperty(String key) {
		return bindReverseProperties.get(key);
	}

	public static PfaSingleton getReference() {
		return factory;
	}

	public <T> T createObject(Class<T> intf) {
		log.debug("CREATE OBJECT INTF:"+intf.getName());
		String axisObj = getBindReversProperty(intf.getName());
		log.debug("RESOLVED AXIS OBJECT:"+axisObj);
		try {
			Class<?> c = Class.forName(axisObj);
			T instance = (T) c.newInstance();
			return instance;
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		} catch (InstantiationException e) {
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}

	}

	public String getOperationMap(String key) {
		return operationMap.get(key);
	}

	public String getProperty(String key) {
		return properties.get(key);
	}

	public Method resloveMethod(String operationName) throws PfaException {
		log.debug("OPERATION NAME:"+operationName);
		String call = operationMap.get(operationName);
		if (call == null) {
			throw new PfaException(PfaException.METHOD_NOT_MAPPED,
					"methodNotMapped");
		}
		String[] tmp = call.split("#");
		if (tmp.length != 2) {
			throw new PfaException(PfaException.METHOD_NOT_MAPPED,
					"methodNotProperlyMapped");
		}
		Class<?> operationClass = null;
		try {
			operationClass = Class.forName(tmp[0]);
		} catch (ClassNotFoundException e) {
			throw new PfaException(PfaException.METHOD_NOT_MAPPED,
					"mappedMethodClassNotFound", e);
		}
		Method operationMethod = null;
		Method[] methods = operationClass.getMethods();
		for (Method m : methods) {
			if (m.getName().equals(tmp[1])
					&& m.getAnnotation(BusinessLogicMethod.class) != null) {
				operationMethod = m;
			}
		}

		if (operationMethod == null) {
			List<String> params = new ArrayList<String>();
			params.add(tmp[0]);
			params.add(tmp[1]);

			throw new PfaException(PfaException.METHOD_NOT_MAPPED,
					"mappedMethodNotFoundInClass", params);
		}

		return operationMethod;
	}
}
