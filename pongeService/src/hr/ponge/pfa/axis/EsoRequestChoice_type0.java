package hr.ponge.pfa.axis;


/** 
 *  EsoRequestChoice_type0 bean class
 */
@java.lang.SuppressWarnings(value = {"unchecked" ,"unused"})
public class EsoRequestChoice_type0 implements org.apache.axis2.databinding.ADBBean {
    /** 
     *  There can be only one choice and the last one wins
     */
    private void clearAllSettingTrackers() {
        localCreateUserTracker = false;
        localReadUserTracker = false;
        localUpdateUserTracker = false;
        localDeleteUserTracker = false;
        localCreateTenantTracker = false;
        localReadTenantTracker = false;
        localUpdateTenantTracker = false;
        localDeleteTenantTracker = false;
    }
    
    /** 
     * field for CreateUser
     */
    protected hr.ponge.pfa.axis.env.operations.CreateUserReq localCreateUser;
    
    protected boolean localCreateUserTracker = false;
    
    public boolean isCreateUserSpecified() {
        return localCreateUserTracker;
    }
    
    /** 
     * Auto generated getter method
     * @return hr.ponge.pfa.axis.env.operations.CreateUserReq
     */
    public hr.ponge.pfa.axis.env.operations.CreateUserReq getCreateUser() {
        return localCreateUser;
    }
    
    /** 
     * Auto generated setter method
     * @param param CreateUser
     */
    public void setCreateUser(hr.ponge.pfa.axis.env.operations.CreateUserReq param) {
        clearAllSettingTrackers();
        localCreateUserTracker = param != null;
        this.localCreateUser = param;
    }
    
    /** 
     * field for ReadUser
     */
    protected hr.ponge.pfa.axis.env.operations.ReadUserReq localReadUser;
    
    protected boolean localReadUserTracker = false;
    
    public boolean isReadUserSpecified() {
        return localReadUserTracker;
    }
    
    /** 
     * Auto generated getter method
     * @return hr.ponge.pfa.axis.env.operations.ReadUserReq
     */
    public hr.ponge.pfa.axis.env.operations.ReadUserReq getReadUser() {
        return localReadUser;
    }
    
    /** 
     * Auto generated setter method
     * @param param ReadUser
     */
    public void setReadUser(hr.ponge.pfa.axis.env.operations.ReadUserReq param) {
        clearAllSettingTrackers();
        localReadUserTracker = param != null;
        this.localReadUser = param;
    }
    
    /** 
     * field for UpdateUser
     */
    protected hr.ponge.pfa.axis.env.operations.UpdateUserReq localUpdateUser;
    
    protected boolean localUpdateUserTracker = false;
    
    public boolean isUpdateUserSpecified() {
        return localUpdateUserTracker;
    }
    
    /** 
     * Auto generated getter method
     * @return hr.ponge.pfa.axis.env.operations.UpdateUserReq
     */
    public hr.ponge.pfa.axis.env.operations.UpdateUserReq getUpdateUser() {
        return localUpdateUser;
    }
    
    /** 
     * Auto generated setter method
     * @param param UpdateUser
     */
    public void setUpdateUser(hr.ponge.pfa.axis.env.operations.UpdateUserReq param) {
        clearAllSettingTrackers();
        localUpdateUserTracker = param != null;
        this.localUpdateUser = param;
    }
    
    /** 
     * field for DeleteUser
     */
    protected hr.ponge.pfa.axis.env.operations.DeleteUserReq localDeleteUser;
    
    protected boolean localDeleteUserTracker = false;
    
    public boolean isDeleteUserSpecified() {
        return localDeleteUserTracker;
    }
    
    /** 
     * Auto generated getter method
     * @return hr.ponge.pfa.axis.env.operations.DeleteUserReq
     */
    public hr.ponge.pfa.axis.env.operations.DeleteUserReq getDeleteUser() {
        return localDeleteUser;
    }
    
    /** 
     * Auto generated setter method
     * @param param DeleteUser
     */
    public void setDeleteUser(hr.ponge.pfa.axis.env.operations.DeleteUserReq param) {
        clearAllSettingTrackers();
        localDeleteUserTracker = param != null;
        this.localDeleteUser = param;
    }
    
    /** 
     * field for CreateTenant
     */
    protected hr.ponge.pfa.axis.env.operations.CreateTenantReq localCreateTenant;
    
    protected boolean localCreateTenantTracker = false;
    
    public boolean isCreateTenantSpecified() {
        return localCreateTenantTracker;
    }
    
    /** 
     * Auto generated getter method
     * @return hr.ponge.pfa.axis.env.operations.CreateTenantReq
     */
    public hr.ponge.pfa.axis.env.operations.CreateTenantReq getCreateTenant() {
        return localCreateTenant;
    }
    
    /** 
     * Auto generated setter method
     * @param param CreateTenant
     */
    public void setCreateTenant(hr.ponge.pfa.axis.env.operations.CreateTenantReq param) {
        clearAllSettingTrackers();
        localCreateTenantTracker = param != null;
        this.localCreateTenant = param;
    }
    
    /** 
     * field for ReadTenant
     */
    protected hr.ponge.pfa.axis.env.operations.ReadTenantReq localReadTenant;
    
    protected boolean localReadTenantTracker = false;
    
    public boolean isReadTenantSpecified() {
        return localReadTenantTracker;
    }
    
    /** 
     * Auto generated getter method
     * @return hr.ponge.pfa.axis.env.operations.ReadTenantReq
     */
    public hr.ponge.pfa.axis.env.operations.ReadTenantReq getReadTenant() {
        return localReadTenant;
    }
    
    /** 
     * Auto generated setter method
     * @param param ReadTenant
     */
    public void setReadTenant(hr.ponge.pfa.axis.env.operations.ReadTenantReq param) {
        clearAllSettingTrackers();
        localReadTenantTracker = param != null;
        this.localReadTenant = param;
    }
    
    /** 
     * field for UpdateTenant
     */
    protected hr.ponge.pfa.axis.env.operations.UpdateTenantReq localUpdateTenant;
    
    protected boolean localUpdateTenantTracker = false;
    
    public boolean isUpdateTenantSpecified() {
        return localUpdateTenantTracker;
    }
    
    /** 
     * Auto generated getter method
     * @return hr.ponge.pfa.axis.env.operations.UpdateTenantReq
     */
    public hr.ponge.pfa.axis.env.operations.UpdateTenantReq getUpdateTenant() {
        return localUpdateTenant;
    }
    
    /** 
     * Auto generated setter method
     * @param param UpdateTenant
     */
    public void setUpdateTenant(hr.ponge.pfa.axis.env.operations.UpdateTenantReq param) {
        clearAllSettingTrackers();
        localUpdateTenantTracker = param != null;
        this.localUpdateTenant = param;
    }
    
    /** 
     * field for DeleteTenant
     */
    protected hr.ponge.pfa.axis.env.operations.DeleteTenantReq localDeleteTenant;
    
    protected boolean localDeleteTenantTracker = false;
    
    public boolean isDeleteTenantSpecified() {
        return localDeleteTenantTracker;
    }
    
    /** 
     * Auto generated getter method
     * @return hr.ponge.pfa.axis.env.operations.DeleteTenantReq
     */
    public hr.ponge.pfa.axis.env.operations.DeleteTenantReq getDeleteTenant() {
        return localDeleteTenant;
    }
    
    /** 
     * Auto generated setter method
     * @param param DeleteTenant
     */
    public void setDeleteTenant(hr.ponge.pfa.axis.env.operations.DeleteTenantReq param) {
        clearAllSettingTrackers();
        localDeleteTenantTracker = param != null;
        this.localDeleteTenant = param;
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
        if (serializeType) {
            java.lang.String namespacePrefix = registerPrefix(xmlWriter ,"http://ponge.hr/pfa/axis");
            if ((namespacePrefix != null) && ((namespacePrefix.trim().length()) > 0)) {
                writeAttribute("xsi" ,"http://www.w3.org/2001/XMLSchema-instance" ,"type" ,(namespacePrefix + ":EsoRequestChoice_type0") ,xmlWriter);
            } else {
                writeAttribute("xsi" ,"http://www.w3.org/2001/XMLSchema-instance" ,"type" ,"EsoRequestChoice_type0" ,xmlWriter);
            }
        } 
        if (localCreateUserTracker) {
            if ((localCreateUser) == null) {
                throw new org.apache.axis2.databinding.ADBException("createUser cannot be null!!");
            } 
            localCreateUser.serialize(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "createUser") ,xmlWriter);
        } 
        if (localReadUserTracker) {
            if ((localReadUser) == null) {
                throw new org.apache.axis2.databinding.ADBException("readUser cannot be null!!");
            } 
            localReadUser.serialize(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "readUser") ,xmlWriter);
        } 
        if (localUpdateUserTracker) {
            if ((localUpdateUser) == null) {
                throw new org.apache.axis2.databinding.ADBException("updateUser cannot be null!!");
            } 
            localUpdateUser.serialize(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "updateUser") ,xmlWriter);
        } 
        if (localDeleteUserTracker) {
            if ((localDeleteUser) == null) {
                throw new org.apache.axis2.databinding.ADBException("deleteUser cannot be null!!");
            } 
            localDeleteUser.serialize(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "deleteUser") ,xmlWriter);
        } 
        if (localCreateTenantTracker) {
            if ((localCreateTenant) == null) {
                throw new org.apache.axis2.databinding.ADBException("createTenant cannot be null!!");
            } 
            localCreateTenant.serialize(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "createTenant") ,xmlWriter);
        } 
        if (localReadTenantTracker) {
            if ((localReadTenant) == null) {
                throw new org.apache.axis2.databinding.ADBException("readTenant cannot be null!!");
            } 
            localReadTenant.serialize(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "readTenant") ,xmlWriter);
        } 
        if (localUpdateTenantTracker) {
            if ((localUpdateTenant) == null) {
                throw new org.apache.axis2.databinding.ADBException("updateTenant cannot be null!!");
            } 
            localUpdateTenant.serialize(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "updateTenant") ,xmlWriter);
        } 
        if (localDeleteTenantTracker) {
            if ((localDeleteTenant) == null) {
                throw new org.apache.axis2.databinding.ADBException("deleteTenant cannot be null!!");
            } 
            localDeleteTenant.serialize(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "deleteTenant") ,xmlWriter);
        } 
    }
    
    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://ponge.hr/pfa/axis")) {
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
                prefix = hr.ponge.pfa.axis.EsoRequestChoice_type0.generatePrefix(namespace);
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
                prefix = hr.ponge.pfa.axis.EsoRequestChoice_type0.generatePrefix(namespaceURI);
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
                        prefix = hr.ponge.pfa.axis.EsoRequestChoice_type0.generatePrefix(namespaceURI);
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
            prefix = hr.ponge.pfa.axis.EsoRequestChoice_type0.generatePrefix(namespace);
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
        if (localCreateUserTracker) {
            elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "createUser"));
            if ((localCreateUser) == null) {
                throw new org.apache.axis2.databinding.ADBException("createUser cannot be null!!");
            } 
            elementList.add(localCreateUser);
        } 
        if (localReadUserTracker) {
            elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "readUser"));
            if ((localReadUser) == null) {
                throw new org.apache.axis2.databinding.ADBException("readUser cannot be null!!");
            } 
            elementList.add(localReadUser);
        } 
        if (localUpdateUserTracker) {
            elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "updateUser"));
            if ((localUpdateUser) == null) {
                throw new org.apache.axis2.databinding.ADBException("updateUser cannot be null!!");
            } 
            elementList.add(localUpdateUser);
        } 
        if (localDeleteUserTracker) {
            elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "deleteUser"));
            if ((localDeleteUser) == null) {
                throw new org.apache.axis2.databinding.ADBException("deleteUser cannot be null!!");
            } 
            elementList.add(localDeleteUser);
        } 
        if (localCreateTenantTracker) {
            elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "createTenant"));
            if ((localCreateTenant) == null) {
                throw new org.apache.axis2.databinding.ADBException("createTenant cannot be null!!");
            } 
            elementList.add(localCreateTenant);
        } 
        if (localReadTenantTracker) {
            elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "readTenant"));
            if ((localReadTenant) == null) {
                throw new org.apache.axis2.databinding.ADBException("readTenant cannot be null!!");
            } 
            elementList.add(localReadTenant);
        } 
        if (localUpdateTenantTracker) {
            elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "updateTenant"));
            if ((localUpdateTenant) == null) {
                throw new org.apache.axis2.databinding.ADBException("updateTenant cannot be null!!");
            } 
            elementList.add(localUpdateTenant);
        } 
        if (localDeleteTenantTracker) {
            elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "deleteTenant"));
            if ((localDeleteTenant) == null) {
                throw new org.apache.axis2.databinding.ADBException("deleteTenant cannot be null!!");
            } 
            elementList.add(localDeleteTenant);
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
        public static hr.ponge.pfa.axis.EsoRequestChoice_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            hr.ponge.pfa.axis.EsoRequestChoice_type0 object = new hr.ponge.pfa.axis.EsoRequestChoice_type0();
            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";
            try {
                while ((!(reader.isStartElement())) && (!(reader.isEndElement())))
                    reader.next();
                java.util.Vector handledAttributes = new java.util.Vector();
                if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "createUser").equals(reader.getName()))) {
                    object.setCreateUser(hr.ponge.pfa.axis.env.operations.CreateUserReq.Factory.parse(reader));
                    reader.next();
                } else if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "readUser").equals(reader.getName()))) {
                    object.setReadUser(hr.ponge.pfa.axis.env.operations.ReadUserReq.Factory.parse(reader));
                    reader.next();
                } else if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "updateUser").equals(reader.getName()))) {
                    object.setUpdateUser(hr.ponge.pfa.axis.env.operations.UpdateUserReq.Factory.parse(reader));
                    reader.next();
                } else if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "deleteUser").equals(reader.getName()))) {
                    object.setDeleteUser(hr.ponge.pfa.axis.env.operations.DeleteUserReq.Factory.parse(reader));
                    reader.next();
                } else if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "createTenant").equals(reader.getName()))) {
                    object.setCreateTenant(hr.ponge.pfa.axis.env.operations.CreateTenantReq.Factory.parse(reader));
                    reader.next();
                } else if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "readTenant").equals(reader.getName()))) {
                    object.setReadTenant(hr.ponge.pfa.axis.env.operations.ReadTenantReq.Factory.parse(reader));
                    reader.next();
                } else if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "updateTenant").equals(reader.getName()))) {
                    object.setUpdateTenant(hr.ponge.pfa.axis.env.operations.UpdateTenantReq.Factory.parse(reader));
                    reader.next();
                } else if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "deleteTenant").equals(reader.getName()))) {
                    object.setDeleteTenant(hr.ponge.pfa.axis.env.operations.DeleteTenantReq.Factory.parse(reader));
                    reader.next();
                } 
            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }
            return object;
        }
        
    }
    
}

