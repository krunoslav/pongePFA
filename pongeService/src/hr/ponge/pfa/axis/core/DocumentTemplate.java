package hr.ponge.pfa.axis.core;


/** 
 *  DocumentTemplate bean class
 */
@java.lang.SuppressWarnings(value = {"unchecked" ,"unused"})
public class DocumentTemplate implements org.apache.axis2.databinding.ADBBean {
    /** 
     * field for Id
     */
    protected long localId;
    
    protected boolean localIdTracker = false;
    
    public boolean isIdSpecified() {
        return localIdTracker;
    }
    
    /** 
     * Auto generated getter method
     * @return long
     */
    public long getId() {
        return localId;
    }
    
    /** 
     * Auto generated setter method
     * @param param Id
     */
    public void setId(long param) {
        localIdTracker = param != (java.lang.Long.MIN_VALUE);
        this.localId = param;
    }
    
    /** 
     * field for Description
     */
    protected java.lang.String localDescription;
    
    protected boolean localDescriptionTracker = false;
    
    public boolean isDescriptionSpecified() {
        return localDescriptionTracker;
    }
    
    /** 
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDescription() {
        return localDescription;
    }
    
    /** 
     * Auto generated setter method
     * @param param Description
     */
    public void setDescription(java.lang.String param) {
        localDescriptionTracker = param != null;
        this.localDescription = param;
    }
    
    /** 
     * field for DocumentForm
     */
    protected javax.activation.DataHandler localDocumentForm;
    
    protected boolean localDocumentFormTracker = false;
    
    public boolean isDocumentFormSpecified() {
        return localDocumentFormTracker;
    }
    
    /** 
     * Auto generated getter method
     * @return javax.activation.DataHandler
     */
    public javax.activation.DataHandler getDocumentForm() {
        return localDocumentForm;
    }
    
    /** 
     * Auto generated setter method
     * @param param DocumentForm
     */
    public void setDocumentForm(javax.activation.DataHandler param) {
        localDocumentFormTracker = param != null;
        this.localDocumentForm = param;
    }
    
    /** 
     * field for TenantId
     */
    protected long localTenantId;
    
    protected boolean localTenantIdTracker = false;
    
    public boolean isTenantIdSpecified() {
        return localTenantIdTracker;
    }
    
    /** 
     * Auto generated getter method
     * @return long
     */
    public long getTenantId() {
        return localTenantId;
    }
    
    /** 
     * Auto generated setter method
     * @param param TenantId
     */
    public void setTenantId(long param) {
        localTenantIdTracker = param != (java.lang.Long.MIN_VALUE);
        this.localTenantId = param;
    }
    
    /** 
     * field for TenantName
     */
    protected java.lang.String localTenantName;
    
    protected boolean localTenantNameTracker = false;
    
    public boolean isTenantNameSpecified() {
        return localTenantNameTracker;
    }
    
    /** 
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTenantName() {
        return localTenantName;
    }
    
    /** 
     * Auto generated setter method
     * @param param TenantName
     */
    public void setTenantName(java.lang.String param) {
        localTenantNameTracker = param != null;
        this.localTenantName = param;
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
            java.lang.String namespacePrefix = registerPrefix(xmlWriter ,"http://ponge.hr/pfa/axis/core");
            if ((namespacePrefix != null) && ((namespacePrefix.trim().length()) > 0)) {
                writeAttribute("xsi" ,"http://www.w3.org/2001/XMLSchema-instance" ,"type" ,(namespacePrefix + ":DocumentTemplate") ,xmlWriter);
            } else {
                writeAttribute("xsi" ,"http://www.w3.org/2001/XMLSchema-instance" ,"type" ,"DocumentTemplate" ,xmlWriter);
            }
        } 
        if (localIdTracker) {
            namespace = "http://ponge.hr/pfa/axis/core";
            writeStartElement(null ,namespace ,"id" ,xmlWriter);
            if ((localId) == (java.lang.Long.MIN_VALUE)) {
                throw new org.apache.axis2.databinding.ADBException("id cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localId));
            }
            xmlWriter.writeEndElement();
        } 
        if (localDescriptionTracker) {
            namespace = "http://ponge.hr/pfa/axis/core";
            writeStartElement(null ,namespace ,"description" ,xmlWriter);
            if ((localDescription) == null) {
                throw new org.apache.axis2.databinding.ADBException("description cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localDescription);
            }
            xmlWriter.writeEndElement();
        } 
        if (localDocumentFormTracker) {
            namespace = "http://ponge.hr/pfa/axis/core";
            writeStartElement(null ,namespace ,"documentForm" ,xmlWriter);
            if ((localDocumentForm) != null) {
                try {
                    org.apache.axiom.util.stax.XMLStreamWriterUtils.writeDataHandler(xmlWriter ,localDocumentForm ,null ,true);
                } catch (java.io.IOException ex) {
                    throw new javax.xml.stream.XMLStreamException("Unable to read data handler for documentForm" , ex);
                }
            } else {
            }
            xmlWriter.writeEndElement();
        } 
        if (localTenantIdTracker) {
            namespace = "http://ponge.hr/pfa/axis/core";
            writeStartElement(null ,namespace ,"tenantId" ,xmlWriter);
            if ((localTenantId) == (java.lang.Long.MIN_VALUE)) {
                throw new org.apache.axis2.databinding.ADBException("tenantId cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTenantId));
            }
            xmlWriter.writeEndElement();
        } 
        if (localTenantNameTracker) {
            namespace = "http://ponge.hr/pfa/axis/core";
            writeStartElement(null ,namespace ,"tenantName" ,xmlWriter);
            if ((localTenantName) == null) {
                throw new org.apache.axis2.databinding.ADBException("tenantName cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localTenantName);
            }
            xmlWriter.writeEndElement();
        } 
        xmlWriter.writeEndElement();
    }
    
    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://ponge.hr/pfa/axis/core")) {
            return "ns4";
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
                prefix = hr.ponge.pfa.axis.core.DocumentTemplate.generatePrefix(namespace);
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
                prefix = hr.ponge.pfa.axis.core.DocumentTemplate.generatePrefix(namespaceURI);
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
                        prefix = hr.ponge.pfa.axis.core.DocumentTemplate.generatePrefix(namespaceURI);
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
            prefix = hr.ponge.pfa.axis.core.DocumentTemplate.generatePrefix(namespace);
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
        if (localIdTracker) {
            elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/core" , "id"));
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localId));
        } 
        if (localDescriptionTracker) {
            elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/core" , "description"));
            if ((localDescription) != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDescription));
            } else {
                throw new org.apache.axis2.databinding.ADBException("description cannot be null!!");
            }
        } 
        if (localDocumentFormTracker) {
            elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/core" , "documentForm"));
            elementList.add(localDocumentForm);
        } 
        if (localTenantIdTracker) {
            elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/core" , "tenantId"));
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTenantId));
        } 
        if (localTenantNameTracker) {
            elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/core" , "tenantName"));
            if ((localTenantName) != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTenantName));
            } else {
                throw new org.apache.axis2.databinding.ADBException("tenantName cannot be null!!");
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
        public static hr.ponge.pfa.axis.core.DocumentTemplate parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            hr.ponge.pfa.axis.core.DocumentTemplate object = new hr.ponge.pfa.axis.core.DocumentTemplate();
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
                        if (!("DocumentTemplate".equals(type))) {
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return ((hr.ponge.pfa.axis.core.DocumentTemplate)(hr.ponge.pfa.axis.ExtensionMapper.getTypeObject(nsUri ,type ,reader)));
                        } 
                    } 
                } 
                java.util.Vector handledAttributes = new java.util.Vector();
                reader.next();
                while ((!(reader.isStartElement())) && (!(reader.isEndElement())))
                    reader.next();
                if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/core" , "id").equals(reader.getName()))) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance" ,"nil");
                    if (("true".equals(nillableValue)) || ("1".equals(nillableValue))) {
                        throw new org.apache.axis2.databinding.ADBException(("The element: " + ("id" + "  cannot be null")));
                    } 
                    java.lang.String content = reader.getElementText();
                    object.setId(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                    reader.next();
                } else {
                    object.setId(java.lang.Long.MIN_VALUE);
                }
                while ((!(reader.isStartElement())) && (!(reader.isEndElement())))
                    reader.next();
                if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/core" , "description").equals(reader.getName()))) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance" ,"nil");
                    if (("true".equals(nillableValue)) || ("1".equals(nillableValue))) {
                        throw new org.apache.axis2.databinding.ADBException(("The element: " + ("description" + "  cannot be null")));
                    } 
                    java.lang.String content = reader.getElementText();
                    object.setDescription(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                    reader.next();
                } else {
                }
                while ((!(reader.isStartElement())) && (!(reader.isEndElement())))
                    reader.next();
                if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/core" , "documentForm").equals(reader.getName()))) {
                    object.setDocumentForm(org.apache.axiom.util.stax.XMLStreamReaderUtils.getDataHandlerFromElement(reader));
                    reader.next();
                } else {
                }
                while ((!(reader.isStartElement())) && (!(reader.isEndElement())))
                    reader.next();
                if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/core" , "tenantId").equals(reader.getName()))) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance" ,"nil");
                    if (("true".equals(nillableValue)) || ("1".equals(nillableValue))) {
                        throw new org.apache.axis2.databinding.ADBException(("The element: " + ("tenantId" + "  cannot be null")));
                    } 
                    java.lang.String content = reader.getElementText();
                    object.setTenantId(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                    reader.next();
                } else {
                    object.setTenantId(java.lang.Long.MIN_VALUE);
                }
                while ((!(reader.isStartElement())) && (!(reader.isEndElement())))
                    reader.next();
                if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/core" , "tenantName").equals(reader.getName()))) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance" ,"nil");
                    if (("true".equals(nillableValue)) || ("1".equals(nillableValue))) {
                        throw new org.apache.axis2.databinding.ADBException(("The element: " + ("tenantName" + "  cannot be null")));
                    } 
                    java.lang.String content = reader.getElementText();
                    object.setTenantName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                    reader.next();
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
    
}

