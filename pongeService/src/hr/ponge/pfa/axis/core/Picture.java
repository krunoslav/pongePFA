package hr.ponge.pfa.axis.core;


/** 
 *  Picture bean class
 */
@java.lang.SuppressWarnings(value = {"unchecked" ,"unused"})
public class Picture implements hr.ponge.pfa.service.core.picture.PictureDTO , org.apache.axis2.databinding.ADBBean {
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
     * field for UserId
     */
    protected long localUserId;
    
    protected boolean localUserIdTracker = false;
    
    public boolean isUserIdSpecified() {
        return localUserIdTracker;
    }
    
    /** 
     * Auto generated getter method
     * @return long
     */
    public long getUserId() {
        return localUserId;
    }
    
    /** 
     * Auto generated setter method
     * @param param UserId
     */
    public void setUserId(long param) {
        localUserIdTracker = param != (java.lang.Long.MIN_VALUE);
        this.localUserId = param;
    }
    
    /** 
     * field for Username
     */
    protected java.lang.String localUsername;
    
    protected boolean localUsernameTracker = false;
    
    public boolean isUsernameSpecified() {
        return localUsernameTracker;
    }
    
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
        localUsernameTracker = param != null;
        this.localUsername = param;
    }
    
    /** 
     * field for PicByteSize
     */
    protected long localPicByteSize;
    
    protected boolean localPicByteSizeTracker = false;
    
    public boolean isPicByteSizeSpecified() {
        return localPicByteSizeTracker;
    }
    
    /** 
     * Auto generated getter method
     * @return long
     */
    public long getPicByteSize() {
        return localPicByteSize;
    }
    
    /** 
     * Auto generated setter method
     * @param param PicByteSize
     */
    public void setPicByteSize(long param) {
        localPicByteSizeTracker = param != (java.lang.Long.MIN_VALUE);
        this.localPicByteSize = param;
    }
    
    /** 
     * field for Xsize
     */
    protected long localXsize;
    
    protected boolean localXsizeTracker = false;
    
    public boolean isXsizeSpecified() {
        return localXsizeTracker;
    }
    
    /** 
     * Auto generated getter method
     * @return long
     */
    public long getXsize() {
        return localXsize;
    }
    
    /** 
     * Auto generated setter method
     * @param param Xsize
     */
    public void setXsize(long param) {
        localXsizeTracker = param != (java.lang.Long.MIN_VALUE);
        this.localXsize = param;
    }
    
    /** 
     * field for Ysize
     */
    protected long localYsize;
    
    protected boolean localYsizeTracker = false;
    
    public boolean isYsizeSpecified() {
        return localYsizeTracker;
    }
    
    /** 
     * Auto generated getter method
     * @return long
     */
    public long getYsize() {
        return localYsize;
    }
    
    /** 
     * Auto generated setter method
     * @param param Ysize
     */
    public void setYsize(long param) {
        localYsizeTracker = param != (java.lang.Long.MIN_VALUE);
        this.localYsize = param;
    }
    
    /** 
     * field for Picture
     */
    protected javax.activation.DataHandler localPicture;
    
    protected boolean localPictureTracker = false;
    
    public boolean isPictureSpecified() {
        return localPictureTracker;
    }
    
    /** 
     * Auto generated getter method
     * @return javax.activation.DataHandler
     */
    public javax.activation.DataHandler getPicture() {
        return localPicture;
    }
    
    /** 
     * Auto generated setter method
     * @param param Picture
     */
    public void setPicture(javax.activation.DataHandler param) {
        localPictureTracker = param != null;
        this.localPicture = param;
    }
    
    /** 
     * field for Md5Code
     */
    protected java.lang.String localMd5Code;
    
    protected boolean localMd5CodeTracker = false;
    
    public boolean isMd5CodeSpecified() {
        return localMd5CodeTracker;
    }
    
    /** 
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getMd5Code() {
        return localMd5Code;
    }
    
    /** 
     * Auto generated setter method
     * @param param Md5Code
     */
    public void setMd5Code(java.lang.String param) {
        localMd5CodeTracker = param != null;
        this.localMd5Code = param;
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
                writeAttribute("xsi" ,"http://www.w3.org/2001/XMLSchema-instance" ,"type" ,(namespacePrefix + ":Picture") ,xmlWriter);
            } else {
                writeAttribute("xsi" ,"http://www.w3.org/2001/XMLSchema-instance" ,"type" ,"Picture" ,xmlWriter);
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
        if (localUserIdTracker) {
            namespace = "http://ponge.hr/pfa/axis/core";
            writeStartElement(null ,namespace ,"userId" ,xmlWriter);
            if ((localUserId) == (java.lang.Long.MIN_VALUE)) {
                throw new org.apache.axis2.databinding.ADBException("userId cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserId));
            }
            xmlWriter.writeEndElement();
        } 
        if (localUsernameTracker) {
            namespace = "http://ponge.hr/pfa/axis/core";
            writeStartElement(null ,namespace ,"username" ,xmlWriter);
            if ((localUsername) == null) {
                throw new org.apache.axis2.databinding.ADBException("username cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localUsername);
            }
            xmlWriter.writeEndElement();
        } 
        if (localPicByteSizeTracker) {
            namespace = "http://ponge.hr/pfa/axis/core";
            writeStartElement(null ,namespace ,"picByteSize" ,xmlWriter);
            if ((localPicByteSize) == (java.lang.Long.MIN_VALUE)) {
                throw new org.apache.axis2.databinding.ADBException("picByteSize cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPicByteSize));
            }
            xmlWriter.writeEndElement();
        } 
        if (localXsizeTracker) {
            namespace = "http://ponge.hr/pfa/axis/core";
            writeStartElement(null ,namespace ,"xsize" ,xmlWriter);
            if ((localXsize) == (java.lang.Long.MIN_VALUE)) {
                throw new org.apache.axis2.databinding.ADBException("xsize cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localXsize));
            }
            xmlWriter.writeEndElement();
        } 
        if (localYsizeTracker) {
            namespace = "http://ponge.hr/pfa/axis/core";
            writeStartElement(null ,namespace ,"ysize" ,xmlWriter);
            if ((localYsize) == (java.lang.Long.MIN_VALUE)) {
                throw new org.apache.axis2.databinding.ADBException("ysize cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localYsize));
            }
            xmlWriter.writeEndElement();
        } 
        if (localPictureTracker) {
            namespace = "http://ponge.hr/pfa/axis/core";
            writeStartElement(null ,namespace ,"picture" ,xmlWriter);
            if ((localPicture) != null) {
                try {
                    org.apache.axiom.util.stax.XMLStreamWriterUtils.writeDataHandler(xmlWriter ,localPicture ,null ,true);
                } catch (java.io.IOException ex) {
                    throw new javax.xml.stream.XMLStreamException("Unable to read data handler for picture" , ex);
                }
            } else {
            }
            xmlWriter.writeEndElement();
        } 
        if (localMd5CodeTracker) {
            namespace = "http://ponge.hr/pfa/axis/core";
            writeStartElement(null ,namespace ,"md5Code" ,xmlWriter);
            if ((localMd5Code) == null) {
                throw new org.apache.axis2.databinding.ADBException("md5Code cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localMd5Code);
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
                prefix = hr.ponge.pfa.axis.core.Picture.generatePrefix(namespace);
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
                prefix = hr.ponge.pfa.axis.core.Picture.generatePrefix(namespaceURI);
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
                        prefix = hr.ponge.pfa.axis.core.Picture.generatePrefix(namespaceURI);
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
            prefix = hr.ponge.pfa.axis.core.Picture.generatePrefix(namespace);
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
        if (localUserIdTracker) {
            elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/core" , "userId"));
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserId));
        } 
        if (localUsernameTracker) {
            elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/core" , "username"));
            if ((localUsername) != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUsername));
            } else {
                throw new org.apache.axis2.databinding.ADBException("username cannot be null!!");
            }
        } 
        if (localPicByteSizeTracker) {
            elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/core" , "picByteSize"));
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPicByteSize));
        } 
        if (localXsizeTracker) {
            elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/core" , "xsize"));
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localXsize));
        } 
        if (localYsizeTracker) {
            elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/core" , "ysize"));
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localYsize));
        } 
        if (localPictureTracker) {
            elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/core" , "picture"));
            elementList.add(localPicture);
        } 
        if (localMd5CodeTracker) {
            elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/core" , "md5Code"));
            if ((localMd5Code) != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMd5Code));
            } else {
                throw new org.apache.axis2.databinding.ADBException("md5Code cannot be null!!");
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
        public static hr.ponge.pfa.axis.core.Picture parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            hr.ponge.pfa.axis.core.Picture object = new hr.ponge.pfa.axis.core.Picture();
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
                        if (!("Picture".equals(type))) {
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return ((hr.ponge.pfa.axis.core.Picture)(hr.ponge.pfa.axis.ExtensionMapper.getTypeObject(nsUri ,type ,reader)));
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
                if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/core" , "userId").equals(reader.getName()))) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance" ,"nil");
                    if (("true".equals(nillableValue)) || ("1".equals(nillableValue))) {
                        throw new org.apache.axis2.databinding.ADBException(("The element: " + ("userId" + "  cannot be null")));
                    } 
                    java.lang.String content = reader.getElementText();
                    object.setUserId(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                    reader.next();
                } else {
                    object.setUserId(java.lang.Long.MIN_VALUE);
                }
                while ((!(reader.isStartElement())) && (!(reader.isEndElement())))
                    reader.next();
                if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/core" , "username").equals(reader.getName()))) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance" ,"nil");
                    if (("true".equals(nillableValue)) || ("1".equals(nillableValue))) {
                        throw new org.apache.axis2.databinding.ADBException(("The element: " + ("username" + "  cannot be null")));
                    } 
                    java.lang.String content = reader.getElementText();
                    object.setUsername(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                    reader.next();
                } else {
                }
                while ((!(reader.isStartElement())) && (!(reader.isEndElement())))
                    reader.next();
                if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/core" , "picByteSize").equals(reader.getName()))) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance" ,"nil");
                    if (("true".equals(nillableValue)) || ("1".equals(nillableValue))) {
                        throw new org.apache.axis2.databinding.ADBException(("The element: " + ("picByteSize" + "  cannot be null")));
                    } 
                    java.lang.String content = reader.getElementText();
                    object.setPicByteSize(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                    reader.next();
                } else {
                    object.setPicByteSize(java.lang.Long.MIN_VALUE);
                }
                while ((!(reader.isStartElement())) && (!(reader.isEndElement())))
                    reader.next();
                if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/core" , "xsize").equals(reader.getName()))) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance" ,"nil");
                    if (("true".equals(nillableValue)) || ("1".equals(nillableValue))) {
                        throw new org.apache.axis2.databinding.ADBException(("The element: " + ("xsize" + "  cannot be null")));
                    } 
                    java.lang.String content = reader.getElementText();
                    object.setXsize(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                    reader.next();
                } else {
                    object.setXsize(java.lang.Long.MIN_VALUE);
                }
                while ((!(reader.isStartElement())) && (!(reader.isEndElement())))
                    reader.next();
                if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/core" , "ysize").equals(reader.getName()))) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance" ,"nil");
                    if (("true".equals(nillableValue)) || ("1".equals(nillableValue))) {
                        throw new org.apache.axis2.databinding.ADBException(("The element: " + ("ysize" + "  cannot be null")));
                    } 
                    java.lang.String content = reader.getElementText();
                    object.setYsize(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                    reader.next();
                } else {
                    object.setYsize(java.lang.Long.MIN_VALUE);
                }
                while ((!(reader.isStartElement())) && (!(reader.isEndElement())))
                    reader.next();
                if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/core" , "picture").equals(reader.getName()))) {
                    object.setPicture(org.apache.axiom.util.stax.XMLStreamReaderUtils.getDataHandlerFromElement(reader));
                    reader.next();
                } else {
                }
                while ((!(reader.isStartElement())) && (!(reader.isEndElement())))
                    reader.next();
                if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis/core" , "md5Code").equals(reader.getName()))) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance" ,"nil");
                    if (("true".equals(nillableValue)) || ("1".equals(nillableValue))) {
                        throw new org.apache.axis2.databinding.ADBException(("The element: " + ("md5Code" + "  cannot be null")));
                    } 
                    java.lang.String content = reader.getElementText();
                    object.setMd5Code(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
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

