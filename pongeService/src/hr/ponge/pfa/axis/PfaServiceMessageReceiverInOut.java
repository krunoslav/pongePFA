package hr.ponge.pfa.axis;


/** 
 *  PfaServiceMessageReceiverInOut message receiver
 */
public class PfaServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver {
    public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext) throws org.apache.axis2.AxisFault {
        try {
            java.lang.Object obj = getTheImplementationObject(msgContext);
            hr.ponge.pfa.axis.PfaServiceSkeletonInterface skel = ((hr.ponge.pfa.axis.PfaServiceSkeletonInterface)(obj));
            org.apache.axiom.soap.SOAPEnvelope envelope = null;
            org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
            if (op == null) {
                throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
            } 
            java.lang.String methodName;
            if (((op.getName()) != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)) {
                if ("entityOperations".equals(methodName)) {
                    hr.ponge.pfa.axis.EntityOperationsResponse entityOperationsResponse3 = null;
                    hr.ponge.pfa.axis.EntityOperations wrappedParam = ((hr.ponge.pfa.axis.EntityOperations)(fromOM(msgContext.getEnvelope().getBody().getFirstElement() ,hr.ponge.pfa.axis.EntityOperations.class ,getEnvelopeNamespaces(msgContext.getEnvelope()))));
                    entityOperationsResponse3 = skel.entityOperations(wrappedParam);
                    envelope = toEnvelope(getSOAPFactory(msgContext) ,entityOperationsResponse3 ,false ,new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "entityOperations"));
                } else {
                    throw new java.lang.RuntimeException("method not found");
                }
                newMsgContext.setEnvelope(envelope);
            } 
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }
    
    private org.apache.axiom.om.OMElement toOM(hr.ponge.pfa.axis.EntityOperations param, boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(hr.ponge.pfa.axis.EntityOperations.MY_QNAME ,org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }
    
    private org.apache.axiom.om.OMElement toOM(hr.ponge.pfa.axis.EntityOperationsResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(hr.ponge.pfa.axis.EntityOperationsResponse.MY_QNAME ,org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }
    
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, hr.ponge.pfa.axis.EntityOperationsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(hr.ponge.pfa.axis.EntityOperationsResponse.MY_QNAME ,factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }
    
    private hr.ponge.pfa.axis.EntityOperationsResponse wrapentityOperations() {
        hr.ponge.pfa.axis.EntityOperationsResponse wrappedElement = new hr.ponge.pfa.axis.EntityOperationsResponse();
        return wrappedElement;
    }
    
    /** 
     *  get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }
    
    private java.lang.Object fromOM(org.apache.axiom.om.OMElement param, java.lang.Class type, java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault {
        try {
            if (hr.ponge.pfa.axis.EntityOperations.class.equals(type)) {
                return hr.ponge.pfa.axis.EntityOperations.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            } 
            if (hr.ponge.pfa.axis.EntityOperationsResponse.class.equals(type)) {
                return hr.ponge.pfa.axis.EntityOperationsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            } 
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
        return null;
    }
    
    /** 
     *  A utility method that copies the namepaces from the SOAPEnvelope
     */
    private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env) {
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = ((org.apache.axiom.om.OMNamespace)(namespaceIterator.next()));
            returnMap.put(ns.getPrefix() ,ns.getNamespaceURI());
        }
        return returnMap;
    }
    
    private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        java.lang.Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage() , cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }
        return f;
    }
    
}

