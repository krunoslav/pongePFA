package hr.ponge.pfa.axis.core.operations;


/** 
 *  UpdatePictureResp bean class
 */
@java.lang.SuppressWarnings(value = {"unchecked" ,"unused"})
public class UpdatePictureResp implements hr.ponge.pfa.service.core.picture.UpdatePictureRespDTO , org.apache.axis2.databinding.ADBBean {
    /** 
     * field for Picture
     */
    protected hr.ponge.pfa.axis.core.Picture localPicture;
    
    protected boolean localPictureTracker = false;
    
    public boolean isPictureSpecified() {
        return localPictureTracker;
    }
    
    /** 
     * Auto generated getter method
     * @return hr.ponge.pfa.axis.core.Picture
     */
    public hr.ponge.pfa.axis.core.Picture getPicture() {
        return localPicture;
    }
    
    /** 
     * Auto generated setter method
     * @param param Picture
     */
    public void setPicture(hr.ponge.pfa.axis.core.Picture param) {
        localPictureTracker = param != null;
        this.localPicture = param;
    }
    
    /** 
     * field for Errors
     * This was an Array!
     */
    protected hr.ponge.pfa.axis.base.ErrorType[] localErrors;
    
    protected boolean localErrorsTracker = false;
    
    public boolean isErrorsSpecified() {
        return localErrorsTracker;
    }
    
    /** 
     * Auto generated getter method
     * @return hr.ponge.pfa.axis.base.ErrorType[]
     */
    public hr.ponge.pfa.axis.base.ErrorType[] getErrors() {
        return localErrors;
    }
    
    /** 
     * validate the array for Errors
     */
    protected void validateErrors(hr.ponge.pfa.axis.base.ErrorType[] param) {
    }
    
    /** 
     * Auto generated setter method
     * @param param Errors
     */
    public void setErrors(hr.ponge.pfa.axis.base.ErrorType[] param) {
        validateErrors(param);
        localErrorsTracker = param != null;
        this.localErrors = param;
    }
    
    /** 
     * Auto generated add method for the array for convenience
     * @param param hr.ponge.pfa.axis.base.ErrorType
     */
    public void addErrors(hr.ponge.pfa.axis.base.ErrorType param) {
        if ((localErrors) == null) {
            localErrors = new hr.ponge.pfa.axis.base.ErrorType[]{  };
        } 
        localErrorsTracker = true;
        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localErrors);
        list.add(param);
        this.localErrors = ((hr.ponge.pfa.axis.base.ErrorType[])(list.toArray(new hr.ponge.pfa.axis.base.ErrorType[list.size()])));
    }
    
    /** 
     *
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {
        org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this , parentQName);
        return factory.createOMElement(dataSource ,parentQName);
    }
    
    public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
        serialize(parentQName ,xmlWriter ,false);
    }
    
    public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
        java.lang.String prefix = null;
        java.lang.String namespace = null;
        prefix = parentQName.getPrefix();
        namespace = parentQName.getNamespaceURI();
        writeStartElement(prefix ,namespace ,parentQName.getLocalPart() ,xmlWriter);
        if (serializeType) {
            java.lang.String namespacePrefix = registerPrefix(xmlWriter ,"http://ponge.hr/pfa/axis/core/operations");
            if ((namespacePrefix != null) && ((namespacePrefix.trim().length()) > 0)) {
                writeAttribute("xsi" ,"http://www.w3.org/2001/XMLSchema-instance" ,"type" ,(namespacePrefix + ":UpdatePictureResp") ,xmlWriter);
            } else {
                writeAttribute("xsi" ,"http://www.w3.org/2001/XMLSchema-instance" ,"type" ,"UpdatePictureResp" ,xmlWriter);
            }
        } 
        if (localPictureTracker) {
            if ((localPicture) == null) {
                throw new org.apache.axis2.databinding.ADBException("picture cannot be null!!");
            } 
            localPicture.serialize(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/core/operations" , "picture") ,xmlWriter);
        } 
        if (localErrorsTracker) {
            if ((localErrors) != null) {
                for (int i = 0 ; i < (localErrors.length) ; i++) {
                    if ((localErrors[i]) != null) {
                        localErrors[i].serialize(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/core/operations" , "errors") ,xmlWriter);
                    } else {
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException("errors cannot be null!!");
            }
        } 
        xmlWriter.writeEndElement();
    }
    
    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://ponge.hr/pfa/axis/core/operations")) {
            return "ns5";
        } 
        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }
    
    /** 
     * Utility method to write an element start tag.
     */
    private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
        if (writerPrefix != null) {
            xmlWriter.writeStartElement(namespace ,localPart);
        } else {
            if ((namespace.length()) == 0) {
                prefix = "";
            } else if (prefix == null) {
                prefix = hr.ponge.pfa.axis.core.operations.UpdatePictureResp.generatePrefix(namespace);
            } 
            xmlWriter.writeStartElement(prefix ,localPart ,namespace);
            xmlWriter.writeNamespace(prefix ,namespace);
            xmlWriter.setPrefix(prefix ,namespace);
        }
    }
    
    /** 
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName, java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
        if ((xmlWriter.getPrefix(namespace)) == null) {
            xmlWriter.writeNamespace(prefix ,namespace);
            xmlWriter.setPrefix(prefix ,namespace);
        } 
        xmlWriter.writeAttribute(namespace ,attName ,attValue);
    }
    
    /** 
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName ,attValue);
        } else {
            registerPrefix(xmlWriter ,namespace);
            xmlWriter.writeAttribute(namespace ,attName ,attValue);
        }
    }
    
    /** 
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName, javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter ,attributeNamespace);
        } 
        java.lang.String attributeValue;
        if ((attributePrefix.trim().length()) > 0) {
            attributeValue = (attributePrefix + ":") + (qname.getLocalPart());
        } else {
            attributeValue = qname.getLocalPart();
        }
        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName ,attributeValue);
        } else {
            registerPrefix(xmlWriter ,namespace);
            xmlWriter.writeAttribute(namespace ,attName ,attributeValue);
        }
    }
    
    /** 
     *  method to handle Qnames
     */
    private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
        java.lang.String namespaceURI = qname.getNamespaceURI();
        if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
            if (prefix == null) {
                prefix = hr.ponge.pfa.axis.core.operations.UpdatePictureResp.generatePrefix(namespaceURI);
                xmlWriter.writeNamespace(prefix ,namespaceURI);
                xmlWriter.setPrefix(prefix ,namespaceURI);
            } 
            if ((prefix.trim().length()) > 0) {
                xmlWriter.writeCharacters(((prefix + ":") + (org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname))));
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }
    }
    
    private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
        if (qnames != null) {
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;
            for (int i = 0 ; i < (qnames.length) ; i++) {
                if (i > 0) {
                    stringToWrite.append(" ");
                } 
                namespaceURI = qnames[i].getNamespaceURI();
                if (namespaceURI != null) {
                    prefix = xmlWriter.getPrefix(namespaceURI);
                    if ((prefix == null) || ((prefix.length()) == 0)) {
                        prefix = hr.ponge.pfa.axis.core.operations.UpdatePictureResp.generatePrefix(namespaceURI);
                        xmlWriter.writeNamespace(prefix ,namespaceURI);
                        xmlWriter.setPrefix(prefix ,namespaceURI);
                    } 
                    if ((prefix.trim().length()) > 0) {
                        stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            }
            xmlWriter.writeCharacters(stringToWrite.toString());
        } 
    }
    
    /** 
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
        java.lang.String prefix = xmlWriter.getPrefix(namespace);
        if (prefix == null) {
            prefix = hr.ponge.pfa.axis.core.operations.UpdatePictureResp.generatePrefix(namespace);
            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
            while (true) {
                java.lang.String uri = nsContext.getNamespaceURI(prefix);
                if ((uri == null) || ((uri.length()) == 0)) {
                    break;
                } 
                prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }
            xmlWriter.writeNamespace(prefix ,namespace);
            xmlWriter.setPrefix(prefix ,namespace);
        } 
        return prefix;
    }
    
    /** 
     * databinding method to get an XML representation of this object
     */
    public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {
        java.util.ArrayList elementList = new java.util.ArrayList();
        java.util.ArrayList attribList = new java.util.ArrayList();
        if (localPictureTracker) {
            elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/core/operations" , "picture"));
            if ((localPicture) == null) {
                throw new org.apache.axis2.databinding.ADBException("picture cannot be null!!");
            } 
            elementList.add(localPicture);
        } 
        if (localErrorsTracker) {
            if ((localErrors) != null) {
                for (int i = 0 ; i < (localErrors.length) ; i++) {
                    if ((localErrors[i]) != null) {
                        elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/core/operations" , "errors"));
                        elementList.add(localErrors[i]);
                    } else {
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException("errors cannot be null!!");
            }
        } 
        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName , elementList.toArray() , attribList.toArray());
    }
    
    /** 
     *  Factory class that keeps the parse method
     */
    public static class Factory {
        /** 
         * static method to create the object
         * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
         *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
         * Postcondition: If this object is an element, the reader is positioned at its end element
         *                If this object is a complex type, the reader is positioned at the end element of its outer element
         */
        public static hr.ponge.pfa.axis.core.operations.UpdatePictureResp parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            hr.ponge.pfa.axis.core.operations.UpdatePictureResp object = new hr.ponge.pfa.axis.core.operations.UpdatePictureResp();
            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";
            try {
                while ((!(reader.isStartElement())) && (!(reader.isEndElement())))
                    reader.next();
                if ((reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance" ,"type")) != null) {
                    java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance" ,"type");
                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;
                        if ((fullTypeName.indexOf(":")) > (-1)) {
                            nsPrefix = fullTypeName.substring(0 ,fullTypeName.indexOf(":"));
                        } 
                        nsPrefix = nsPrefix == null ? "" : nsPrefix;
                        java.lang.String type = fullTypeName.substring(((fullTypeName.indexOf(":")) + 1));
                        if (!("UpdatePictureResp".equals(type))) {
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return ((hr.ponge.pfa.axis.core.operations.UpdatePictureResp)(hr.ponge.pfa.axis.ExtensionMapper.getTypeObject(nsUri ,type ,reader)));
                        } 
                    } 
                } 
                java.util.Vector handledAttributes = new java.util.Vector();
                reader.next();
                java.util.ArrayList list2 = new java.util.ArrayList();
                while ((!(reader.isStartElement())) && (!(reader.isEndElement())))
                    reader.next();
                if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/core/operations" , "picture").equals(reader.getName()))) {
                    object.setPicture(hr.ponge.pfa.axis.core.Picture.Factory.parse(reader));
                    reader.next();
                } else {
                }
                while ((!(reader.isStartElement())) && (!(reader.isEndElement())))
                    reader.next();
                if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/core/operations" , "errors").equals(reader.getName()))) {
                    list2.add(hr.ponge.pfa.axis.base.ErrorType.Factory.parse(reader));
                    boolean loopDone2 = false;
                    while (!loopDone2) {
                        while (!(reader.isEndElement()))
                            reader.next();
                        reader.next();
                        while ((!(reader.isStartElement())) && (!(reader.isEndElement())))
                            reader.next();
                        if (reader.isEndElement()) {
                            loopDone2 = true;
                        } else {
                            if (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/core/operations" , "errors").equals(reader.getName())) {
                                list2.add(hr.ponge.pfa.axis.base.ErrorType.Factory.parse(reader));
                            } else {
                                loopDone2 = true;
                            }
                        }
                    }
                    object.setErrors(((hr.ponge.pfa.axis.base.ErrorType[])(org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(hr.ponge.pfa.axis.base.ErrorType.class ,list2))));
                } else {
                }
                while ((!(reader.isStartElement())) && (!(reader.isEndElement())))
                    reader.next();
                if (reader.isStartElement())
                    throw new org.apache.axis2.databinding.ADBException(("Unexpected subelement " + (reader.getName())));
                
            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }
            return object;
        }
        
    }
    
    public void addErrors_(hr.ponge.pfa.service.base.ErrorType arg) {
        addErrors((hr.ponge.pfa.axis.base.ErrorType)arg);
    }
    
    public void setErrors_(hr.ponge.pfa.service.base.ErrorType[] arg) {
        hr.ponge.pfa.axis.base.ErrorType[] er = new hr.ponge.pfa.axis.base.ErrorType[arg.length];
 for(int i=0;i<arg.length;i++){ 
     er[i]=(hr.ponge.pfa.axis.base.ErrorType) arg[i]; 
 }
setErrors(er);
    }
    
    public hr.ponge.pfa.service.base.ErrorType[] getErrors_() {
        return getErrors();
    }
    
    public void setPicture_(hr.ponge.pfa.service.core.picture.PictureDTO arg) {
        setPicture((hr.ponge.pfa.axis.core.Picture)arg);
    }
    
    public hr.ponge.pfa.service.core.picture.PictureDTO getPicture_() {
        return getPicture();
    }
    
}

