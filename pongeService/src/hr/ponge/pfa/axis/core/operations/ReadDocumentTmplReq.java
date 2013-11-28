package hr.ponge.pfa.axis.core.operations;


/** 
 *  ReadDocumentTmplReq bean class
 */
@java.lang.SuppressWarnings(value = {"unchecked" ,"unused"})
public class ReadDocumentTmplReq implements org.apache.axis2.databinding.ADBBean {
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
     * field for Limits
     */
    protected hr.ponge.pfa.axis.base.ReadOutLimits localLimits;
    
    protected boolean localLimitsTracker = false;
    
    public boolean isLimitsSpecified() {
        return localLimitsTracker;
    }
    
    /** 
     * Auto generated getter method
     * @return hr.ponge.pfa.axis.base.ReadOutLimits
     */
    public hr.ponge.pfa.axis.base.ReadOutLimits getLimits() {
        return localLimits;
    }
    
    /** 
     * Auto generated setter method
     * @param param Limits
     */
    public void setLimits(hr.ponge.pfa.axis.base.ReadOutLimits param) {
        localLimitsTracker = param != null;
        this.localLimits = param;
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
                writeAttribute("xsi" ,"http://www.w3.org/2001/XMLSchema-instance" ,"type" ,(namespacePrefix + ":ReadDocumentTmplReq") ,xmlWriter);
            } else {
                writeAttribute("xsi" ,"http://www.w3.org/2001/XMLSchema-instance" ,"type" ,"ReadDocumentTmplReq" ,xmlWriter);
            }
        } 
        if (localIdTracker) {
            namespace = "http://ponge.hr/pfa/axis/core/operations";
            writeStartElement(null ,namespace ,"id" ,xmlWriter);
            if ((localId) == (java.lang.Long.MIN_VALUE)) {
                throw new org.apache.axis2.databinding.ADBException("id cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localId));
            }
            xmlWriter.writeEndElement();
        } 
        if (localDescriptionTracker) {
            namespace = "http://ponge.hr/pfa/axis/core/operations";
            writeStartElement(null ,namespace ,"description" ,xmlWriter);
            if ((localDescription) == null) {
                throw new org.apache.axis2.databinding.ADBException("description cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localDescription);
            }
            xmlWriter.writeEndElement();
        } 
        if (localTenantIdTracker) {
            namespace = "http://ponge.hr/pfa/axis/core/operations";
            writeStartElement(null ,namespace ,"tenantId" ,xmlWriter);
            if ((localTenantId) == (java.lang.Long.MIN_VALUE)) {
                throw new org.apache.axis2.databinding.ADBException("tenantId cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTenantId));
            }
            xmlWriter.writeEndElement();
        } 
        if (localLimitsTracker) {
            if ((localLimits) == null) {
                throw new org.apache.axis2.databinding.ADBException("limits cannot be null!!");
            } 
            localLimits.serialize(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/core/operations" , "limits") ,xmlWriter);
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
                prefix = hr.ponge.pfa.axis.core.operations.ReadDocumentTmplReq.generatePrefix(namespace);
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
                prefix = hr.ponge.pfa.axis.core.operations.ReadDocumentTmplReq.generatePrefix(namespaceURI);
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
                        prefix = hr.ponge.pfa.axis.core.operations.ReadDocumentTmplReq.generatePrefix(namespaceURI);
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
            prefix = hr.ponge.pfa.axis.core.operations.ReadDocumentTmplReq.generatePrefix(namespace);
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
            elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/core/operations" , "id"));
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localId));
        } 
        if (localDescriptionTracker) {
            elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/core/operations" , "description"));
            if ((localDescription) != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDescription));
            } else {
                throw new org.apache.axis2.databinding.ADBException("description cannot be null!!");
            }
        } 
        if (localTenantIdTracker) {
            elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/core/operations" , "tenantId"));
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTenantId));
        } 
        if (localLimitsTracker) {
            elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/core/operations" , "limits"));
            if ((localLimits) == null) {
                throw new org.apache.axis2.databinding.ADBException("limits cannot be null!!");
            } 
            elementList.add(localLimits);
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
        public static hr.ponge.pfa.axis.core.operations.ReadDocumentTmplReq parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            hr.ponge.pfa.axis.core.operations.ReadDocumentTmplReq object = new hr.ponge.pfa.axis.core.operations.ReadDocumentTmplReq();
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
                        if (!("ReadDocumentTmplReq".equals(type))) {
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return ((hr.ponge.pfa.axis.core.operations.ReadDocumentTmplReq)(hr.ponge.pfa.axis.ExtensionMapper.getTypeObject(nsUri ,type ,reader)));
                        } 
                    } 
                } 
                java.util.Vector handledAttributes = new java.util.Vector();
                reader.next();
                while ((!(reader.isStartElement())) && (!(reader.isEndElement())))
                    reader.next();
                if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/core/operations" , "id").equals(reader.getName()))) {
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
                if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/core/operations" , "description").equals(reader.getName()))) {
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
                if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/core/operations" , "tenantId").equals(reader.getName()))) {
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
                if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/core/operations" , "limits").equals(reader.getName()))) {
                    object.setLimits(hr.ponge.pfa.axis.base.ReadOutLimits.Factory.parse(reader));
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

