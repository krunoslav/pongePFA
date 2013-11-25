package hr.ponge.pfa.axis.base;


/** 
 *  RequestMetaData bean class
 */
@java.lang.SuppressWarnings(value = {"unchecked" ,"unused"})
public class RequestMetaData implements hr.ponge.pfa.service.base.RequestMetaData , org.apache.axis2.databinding.ADBBean {
    /** 
     * field for RequestId
     */
    protected java.lang.String localRequestId;
    
    /** 
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getRequestId() {
        return localRequestId;
    }
    
    /** 
     * Auto generated setter method
     * @param param RequestId
     */
    public void setRequestId(java.lang.String param) {
        this.localRequestId = param;
    }
    
    /** 
     * field for Username
     */
    protected java.lang.String localUsername;
    
    /** 
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getUsername() {
        return localUsername;
    }
    
    /** 
     * Auto generated setter method
     * @param param Username
     */
    public void setUsername(java.lang.String param) {
        this.localUsername = param;
    }
    
    /** 
     * field for Password
     */
    protected java.lang.String localPassword;
    
    /** 
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getPassword() {
        return localPassword;
    }
    
    /** 
     * Auto generated setter method
     * @param param Password
     */
    public void setPassword(java.lang.String param) {
        this.localPassword = param;
    }
    
    /** 
     * field for ClientVersion
     */
    protected java.lang.String localClientVersion;
    
    /** 
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getClientVersion() {
        return localClientVersion;
    }
    
    /** 
     * Auto generated setter method
     * @param param ClientVersion
     */
    public void setClientVersion(java.lang.String param) {
        this.localClientVersion = param;
    }
    
    /** 
     * field for Operation
     */
    protected java.lang.String localOperation;
    
    /** 
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getOperation() {
        return localOperation;
    }
    
    /** 
     * Auto generated setter method
     * @param param Operation
     */
    public void setOperation(java.lang.String param) {
        this.localOperation = param;
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
            java.lang.String namespacePrefix = registerPrefix(xmlWriter ,"http://ponge.hr/pfa/axis/base");
            if ((namespacePrefix != null) && ((namespacePrefix.trim().length()) > 0)) {
                writeAttribute("xsi" ,"http://www.w3.org/2001/XMLSchema-instance" ,"type" ,(namespacePrefix + ":RequestMetaData") ,xmlWriter);
            } else {
                writeAttribute("xsi" ,"http://www.w3.org/2001/XMLSchema-instance" ,"type" ,"RequestMetaData" ,xmlWriter);
            }
        } 
        namespace = "http://ponge.hr/pfa/axis/base";
        writeStartElement(null ,namespace ,"requestId" ,xmlWriter);
        if ((localRequestId) == null) {
            throw new org.apache.axis2.databinding.ADBException("requestId cannot be null!!");
        } else {
            xmlWriter.writeCharacters(localRequestId);
        }
        xmlWriter.writeEndElement();
        namespace = "http://ponge.hr/pfa/axis/base";
        writeStartElement(null ,namespace ,"username" ,xmlWriter);
        if ((localUsername) == null) {
            throw new org.apache.axis2.databinding.ADBException("username cannot be null!!");
        } else {
            xmlWriter.writeCharacters(localUsername);
        }
        xmlWriter.writeEndElement();
        namespace = "http://ponge.hr/pfa/axis/base";
        writeStartElement(null ,namespace ,"password" ,xmlWriter);
        if ((localPassword) == null) {
            throw new org.apache.axis2.databinding.ADBException("password cannot be null!!");
        } else {
            xmlWriter.writeCharacters(localPassword);
        }
        xmlWriter.writeEndElement();
        namespace = "http://ponge.hr/pfa/axis/base";
        writeStartElement(null ,namespace ,"clientVersion" ,xmlWriter);
        if ((localClientVersion) == null) {
            throw new org.apache.axis2.databinding.ADBException("clientVersion cannot be null!!");
        } else {
            xmlWriter.writeCharacters(localClientVersion);
        }
        xmlWriter.writeEndElement();
        namespace = "http://ponge.hr/pfa/axis/base";
        writeStartElement(null ,namespace ,"operation" ,xmlWriter);
        if ((localOperation) == null) {
            throw new org.apache.axis2.databinding.ADBException("operation cannot be null!!");
        } else {
            xmlWriter.writeCharacters(localOperation);
        }
        xmlWriter.writeEndElement();
        xmlWriter.writeEndElement();
    }
    
    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://ponge.hr/pfa/axis/base")) {
            return "ns1";
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
                prefix = hr.ponge.pfa.axis.base.RequestMetaData.generatePrefix(namespace);
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
                prefix = hr.ponge.pfa.axis.base.RequestMetaData.generatePrefix(namespaceURI);
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
                        prefix = hr.ponge.pfa.axis.base.RequestMetaData.generatePrefix(namespaceURI);
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
            prefix = hr.ponge.pfa.axis.base.RequestMetaData.generatePrefix(namespace);
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
        elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/base" , "requestId"));
        if ((localRequestId) != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequestId));
        } else {
            throw new org.apache.axis2.databinding.ADBException("requestId cannot be null!!");
        }
        elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/base" , "username"));
        if ((localUsername) != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUsername));
        } else {
            throw new org.apache.axis2.databinding.ADBException("username cannot be null!!");
        }
        elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/base" , "password"));
        if ((localPassword) != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPassword));
        } else {
            throw new org.apache.axis2.databinding.ADBException("password cannot be null!!");
        }
        elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/base" , "clientVersion"));
        if ((localClientVersion) != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClientVersion));
        } else {
            throw new org.apache.axis2.databinding.ADBException("clientVersion cannot be null!!");
        }
        elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/base" , "operation"));
        if ((localOperation) != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOperation));
        } else {
            throw new org.apache.axis2.databinding.ADBException("operation cannot be null!!");
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
        public static hr.ponge.pfa.axis.base.RequestMetaData parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            hr.ponge.pfa.axis.base.RequestMetaData object = new hr.ponge.pfa.axis.base.RequestMetaData();
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
                        if (!("RequestMetaData".equals(type))) {
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return ((hr.ponge.pfa.axis.base.RequestMetaData)(hr.ponge.pfa.axis.ExtensionMapper.getTypeObject(nsUri ,type ,reader)));
                        } 
                    } 
                } 
                java.util.Vector handledAttributes = new java.util.Vector();
                reader.next();
                while ((!(reader.isStartElement())) && (!(reader.isEndElement())))
                    reader.next();
                if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/base" , "requestId").equals(reader.getName()))) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance" ,"nil");
                    if (("true".equals(nillableValue)) || ("1".equals(nillableValue))) {
                        throw new org.apache.axis2.databinding.ADBException(("The element: " + ("requestId" + "  cannot be null")));
                    } 
                    java.lang.String content = reader.getElementText();
                    object.setRequestId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                    reader.next();
                } else {
                    throw new org.apache.axis2.databinding.ADBException(("Unexpected subelement " + (reader.getName())));
                }
                while ((!(reader.isStartElement())) && (!(reader.isEndElement())))
                    reader.next();
                if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/base" , "username").equals(reader.getName()))) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance" ,"nil");
                    if (("true".equals(nillableValue)) || ("1".equals(nillableValue))) {
                        throw new org.apache.axis2.databinding.ADBException(("The element: " + ("username" + "  cannot be null")));
                    } 
                    java.lang.String content = reader.getElementText();
                    object.setUsername(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                    reader.next();
                } else {
                    throw new org.apache.axis2.databinding.ADBException(("Unexpected subelement " + (reader.getName())));
                }
                while ((!(reader.isStartElement())) && (!(reader.isEndElement())))
                    reader.next();
                if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/base" , "password").equals(reader.getName()))) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance" ,"nil");
                    if (("true".equals(nillableValue)) || ("1".equals(nillableValue))) {
                        throw new org.apache.axis2.databinding.ADBException(("The element: " + ("password" + "  cannot be null")));
                    } 
                    java.lang.String content = reader.getElementText();
                    object.setPassword(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                    reader.next();
                } else {
                    throw new org.apache.axis2.databinding.ADBException(("Unexpected subelement " + (reader.getName())));
                }
                while ((!(reader.isStartElement())) && (!(reader.isEndElement())))
                    reader.next();
                if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/base" , "clientVersion").equals(reader.getName()))) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance" ,"nil");
                    if (("true".equals(nillableValue)) || ("1".equals(nillableValue))) {
                        throw new org.apache.axis2.databinding.ADBException(("The element: " + ("clientVersion" + "  cannot be null")));
                    } 
                    java.lang.String content = reader.getElementText();
                    object.setClientVersion(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                    reader.next();
                } else {
                    throw new org.apache.axis2.databinding.ADBException(("Unexpected subelement " + (reader.getName())));
                }
                while ((!(reader.isStartElement())) && (!(reader.isEndElement())))
                    reader.next();
                if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/base" , "operation").equals(reader.getName()))) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance" ,"nil");
                    if (("true".equals(nillableValue)) || ("1".equals(nillableValue))) {
                        throw new org.apache.axis2.databinding.ADBException(("The element: " + ("operation" + "  cannot be null")));
                    } 
                    java.lang.String content = reader.getElementText();
                    object.setOperation(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                    reader.next();
                } else {
                    throw new org.apache.axis2.databinding.ADBException(("Unexpected subelement " + (reader.getName())));
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
    
}

