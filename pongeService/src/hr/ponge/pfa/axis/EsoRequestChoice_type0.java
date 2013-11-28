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
        localCreatePictureTracker = false;
        localReadPictureTracker = false;
        localUpdatePictureTracker = false;
        localDeletePictureTracker = false;
        localCreatePictureTmplTracker = false;
        localReadPictureTmplTracker = false;
        localUpdatePictureTmplTracker = false;
        localDeletePictureTmplTracker = false;
        localCreateDocumentTracker = false;
        localReadDocumentTracker = false;
        localUpdateDocumentTracker = false;
        localDeleteDocumentTracker = false;
        localCreateDocumentTmplTracker = false;
        localReadDocumentTmplTracker = false;
        localUpdateDocumentTmplTracker = false;
        localDeleteDocumentTmplTracker = false;
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
     * field for CreatePicture
     */
    protected hr.ponge.pfa.axis.core.operations.CreatePictureReq localCreatePicture;
    
    protected boolean localCreatePictureTracker = false;
    
    public boolean isCreatePictureSpecified() {
        return localCreatePictureTracker;
    }
    
    /** 
     * Auto generated getter method
     * @return hr.ponge.pfa.axis.core.operations.CreatePictureReq
     */
    public hr.ponge.pfa.axis.core.operations.CreatePictureReq getCreatePicture() {
        return localCreatePicture;
    }
    
    /** 
     * Auto generated setter method
     * @param param CreatePicture
     */
    public void setCreatePicture(hr.ponge.pfa.axis.core.operations.CreatePictureReq param) {
        clearAllSettingTrackers();
        localCreatePictureTracker = param != null;
        this.localCreatePicture = param;
    }
    
    /** 
     * field for ReadPicture
     */
    protected hr.ponge.pfa.axis.core.operations.ReadPictureReq localReadPicture;
    
    protected boolean localReadPictureTracker = false;
    
    public boolean isReadPictureSpecified() {
        return localReadPictureTracker;
    }
    
    /** 
     * Auto generated getter method
     * @return hr.ponge.pfa.axis.core.operations.ReadPictureReq
     */
    public hr.ponge.pfa.axis.core.operations.ReadPictureReq getReadPicture() {
        return localReadPicture;
    }
    
    /** 
     * Auto generated setter method
     * @param param ReadPicture
     */
    public void setReadPicture(hr.ponge.pfa.axis.core.operations.ReadPictureReq param) {
        clearAllSettingTrackers();
        localReadPictureTracker = param != null;
        this.localReadPicture = param;
    }
    
    /** 
     * field for UpdatePicture
     */
    protected hr.ponge.pfa.axis.core.operations.UpdatePictureReq localUpdatePicture;
    
    protected boolean localUpdatePictureTracker = false;
    
    public boolean isUpdatePictureSpecified() {
        return localUpdatePictureTracker;
    }
    
    /** 
     * Auto generated getter method
     * @return hr.ponge.pfa.axis.core.operations.UpdatePictureReq
     */
    public hr.ponge.pfa.axis.core.operations.UpdatePictureReq getUpdatePicture() {
        return localUpdatePicture;
    }
    
    /** 
     * Auto generated setter method
     * @param param UpdatePicture
     */
    public void setUpdatePicture(hr.ponge.pfa.axis.core.operations.UpdatePictureReq param) {
        clearAllSettingTrackers();
        localUpdatePictureTracker = param != null;
        this.localUpdatePicture = param;
    }
    
    /** 
     * field for DeletePicture
     */
    protected hr.ponge.pfa.axis.core.operations.DeletePictureReq localDeletePicture;
    
    protected boolean localDeletePictureTracker = false;
    
    public boolean isDeletePictureSpecified() {
        return localDeletePictureTracker;
    }
    
    /** 
     * Auto generated getter method
     * @return hr.ponge.pfa.axis.core.operations.DeletePictureReq
     */
    public hr.ponge.pfa.axis.core.operations.DeletePictureReq getDeletePicture() {
        return localDeletePicture;
    }
    
    /** 
     * Auto generated setter method
     * @param param DeletePicture
     */
    public void setDeletePicture(hr.ponge.pfa.axis.core.operations.DeletePictureReq param) {
        clearAllSettingTrackers();
        localDeletePictureTracker = param != null;
        this.localDeletePicture = param;
    }
    
    /** 
     * field for CreatePictureTmpl
     */
    protected hr.ponge.pfa.axis.core.operations.CreatePictureTmplReq localCreatePictureTmpl;
    
    protected boolean localCreatePictureTmplTracker = false;
    
    public boolean isCreatePictureTmplSpecified() {
        return localCreatePictureTmplTracker;
    }
    
    /** 
     * Auto generated getter method
     * @return hr.ponge.pfa.axis.core.operations.CreatePictureTmplReq
     */
    public hr.ponge.pfa.axis.core.operations.CreatePictureTmplReq getCreatePictureTmpl() {
        return localCreatePictureTmpl;
    }
    
    /** 
     * Auto generated setter method
     * @param param CreatePictureTmpl
     */
    public void setCreatePictureTmpl(hr.ponge.pfa.axis.core.operations.CreatePictureTmplReq param) {
        clearAllSettingTrackers();
        localCreatePictureTmplTracker = param != null;
        this.localCreatePictureTmpl = param;
    }
    
    /** 
     * field for ReadPictureTmpl
     */
    protected hr.ponge.pfa.axis.core.operations.ReadPictureTmplReq localReadPictureTmpl;
    
    protected boolean localReadPictureTmplTracker = false;
    
    public boolean isReadPictureTmplSpecified() {
        return localReadPictureTmplTracker;
    }
    
    /** 
     * Auto generated getter method
     * @return hr.ponge.pfa.axis.core.operations.ReadPictureTmplReq
     */
    public hr.ponge.pfa.axis.core.operations.ReadPictureTmplReq getReadPictureTmpl() {
        return localReadPictureTmpl;
    }
    
    /** 
     * Auto generated setter method
     * @param param ReadPictureTmpl
     */
    public void setReadPictureTmpl(hr.ponge.pfa.axis.core.operations.ReadPictureTmplReq param) {
        clearAllSettingTrackers();
        localReadPictureTmplTracker = param != null;
        this.localReadPictureTmpl = param;
    }
    
    /** 
     * field for UpdatePictureTmpl
     */
    protected hr.ponge.pfa.axis.core.operations.UpdatePictureTmplReq localUpdatePictureTmpl;
    
    protected boolean localUpdatePictureTmplTracker = false;
    
    public boolean isUpdatePictureTmplSpecified() {
        return localUpdatePictureTmplTracker;
    }
    
    /** 
     * Auto generated getter method
     * @return hr.ponge.pfa.axis.core.operations.UpdatePictureTmplReq
     */
    public hr.ponge.pfa.axis.core.operations.UpdatePictureTmplReq getUpdatePictureTmpl() {
        return localUpdatePictureTmpl;
    }
    
    /** 
     * Auto generated setter method
     * @param param UpdatePictureTmpl
     */
    public void setUpdatePictureTmpl(hr.ponge.pfa.axis.core.operations.UpdatePictureTmplReq param) {
        clearAllSettingTrackers();
        localUpdatePictureTmplTracker = param != null;
        this.localUpdatePictureTmpl = param;
    }
    
    /** 
     * field for DeletePictureTmpl
     */
    protected hr.ponge.pfa.axis.core.operations.DeletePictureTmplReq localDeletePictureTmpl;
    
    protected boolean localDeletePictureTmplTracker = false;
    
    public boolean isDeletePictureTmplSpecified() {
        return localDeletePictureTmplTracker;
    }
    
    /** 
     * Auto generated getter method
     * @return hr.ponge.pfa.axis.core.operations.DeletePictureTmplReq
     */
    public hr.ponge.pfa.axis.core.operations.DeletePictureTmplReq getDeletePictureTmpl() {
        return localDeletePictureTmpl;
    }
    
    /** 
     * Auto generated setter method
     * @param param DeletePictureTmpl
     */
    public void setDeletePictureTmpl(hr.ponge.pfa.axis.core.operations.DeletePictureTmplReq param) {
        clearAllSettingTrackers();
        localDeletePictureTmplTracker = param != null;
        this.localDeletePictureTmpl = param;
    }
    
    /** 
     * field for CreateDocument
     */
    protected hr.ponge.pfa.axis.core.operations.CreateDocumentReq localCreateDocument;
    
    protected boolean localCreateDocumentTracker = false;
    
    public boolean isCreateDocumentSpecified() {
        return localCreateDocumentTracker;
    }
    
    /** 
     * Auto generated getter method
     * @return hr.ponge.pfa.axis.core.operations.CreateDocumentReq
     */
    public hr.ponge.pfa.axis.core.operations.CreateDocumentReq getCreateDocument() {
        return localCreateDocument;
    }
    
    /** 
     * Auto generated setter method
     * @param param CreateDocument
     */
    public void setCreateDocument(hr.ponge.pfa.axis.core.operations.CreateDocumentReq param) {
        clearAllSettingTrackers();
        localCreateDocumentTracker = param != null;
        this.localCreateDocument = param;
    }
    
    /** 
     * field for ReadDocument
     */
    protected hr.ponge.pfa.axis.core.operations.ReadDocumentReq localReadDocument;
    
    protected boolean localReadDocumentTracker = false;
    
    public boolean isReadDocumentSpecified() {
        return localReadDocumentTracker;
    }
    
    /** 
     * Auto generated getter method
     * @return hr.ponge.pfa.axis.core.operations.ReadDocumentReq
     */
    public hr.ponge.pfa.axis.core.operations.ReadDocumentReq getReadDocument() {
        return localReadDocument;
    }
    
    /** 
     * Auto generated setter method
     * @param param ReadDocument
     */
    public void setReadDocument(hr.ponge.pfa.axis.core.operations.ReadDocumentReq param) {
        clearAllSettingTrackers();
        localReadDocumentTracker = param != null;
        this.localReadDocument = param;
    }
    
    /** 
     * field for UpdateDocument
     */
    protected hr.ponge.pfa.axis.core.operations.UpdateDocumentReq localUpdateDocument;
    
    protected boolean localUpdateDocumentTracker = false;
    
    public boolean isUpdateDocumentSpecified() {
        return localUpdateDocumentTracker;
    }
    
    /** 
     * Auto generated getter method
     * @return hr.ponge.pfa.axis.core.operations.UpdateDocumentReq
     */
    public hr.ponge.pfa.axis.core.operations.UpdateDocumentReq getUpdateDocument() {
        return localUpdateDocument;
    }
    
    /** 
     * Auto generated setter method
     * @param param UpdateDocument
     */
    public void setUpdateDocument(hr.ponge.pfa.axis.core.operations.UpdateDocumentReq param) {
        clearAllSettingTrackers();
        localUpdateDocumentTracker = param != null;
        this.localUpdateDocument = param;
    }
    
    /** 
     * field for DeleteDocument
     */
    protected hr.ponge.pfa.axis.core.operations.DeleteDocumentReq localDeleteDocument;
    
    protected boolean localDeleteDocumentTracker = false;
    
    public boolean isDeleteDocumentSpecified() {
        return localDeleteDocumentTracker;
    }
    
    /** 
     * Auto generated getter method
     * @return hr.ponge.pfa.axis.core.operations.DeleteDocumentReq
     */
    public hr.ponge.pfa.axis.core.operations.DeleteDocumentReq getDeleteDocument() {
        return localDeleteDocument;
    }
    
    /** 
     * Auto generated setter method
     * @param param DeleteDocument
     */
    public void setDeleteDocument(hr.ponge.pfa.axis.core.operations.DeleteDocumentReq param) {
        clearAllSettingTrackers();
        localDeleteDocumentTracker = param != null;
        this.localDeleteDocument = param;
    }
    
    /** 
     * field for CreateDocumentTmpl
     */
    protected hr.ponge.pfa.axis.core.operations.CreateDocumentTmplReq localCreateDocumentTmpl;
    
    protected boolean localCreateDocumentTmplTracker = false;
    
    public boolean isCreateDocumentTmplSpecified() {
        return localCreateDocumentTmplTracker;
    }
    
    /** 
     * Auto generated getter method
     * @return hr.ponge.pfa.axis.core.operations.CreateDocumentTmplReq
     */
    public hr.ponge.pfa.axis.core.operations.CreateDocumentTmplReq getCreateDocumentTmpl() {
        return localCreateDocumentTmpl;
    }
    
    /** 
     * Auto generated setter method
     * @param param CreateDocumentTmpl
     */
    public void setCreateDocumentTmpl(hr.ponge.pfa.axis.core.operations.CreateDocumentTmplReq param) {
        clearAllSettingTrackers();
        localCreateDocumentTmplTracker = param != null;
        this.localCreateDocumentTmpl = param;
    }
    
    /** 
     * field for ReadDocumentTmpl
     */
    protected hr.ponge.pfa.axis.core.operations.ReadDocumentTmplReq localReadDocumentTmpl;
    
    protected boolean localReadDocumentTmplTracker = false;
    
    public boolean isReadDocumentTmplSpecified() {
        return localReadDocumentTmplTracker;
    }
    
    /** 
     * Auto generated getter method
     * @return hr.ponge.pfa.axis.core.operations.ReadDocumentTmplReq
     */
    public hr.ponge.pfa.axis.core.operations.ReadDocumentTmplReq getReadDocumentTmpl() {
        return localReadDocumentTmpl;
    }
    
    /** 
     * Auto generated setter method
     * @param param ReadDocumentTmpl
     */
    public void setReadDocumentTmpl(hr.ponge.pfa.axis.core.operations.ReadDocumentTmplReq param) {
        clearAllSettingTrackers();
        localReadDocumentTmplTracker = param != null;
        this.localReadDocumentTmpl = param;
    }
    
    /** 
     * field for UpdateDocumentTmpl
     */
    protected hr.ponge.pfa.axis.core.operations.UpdateDocumentTmplReq localUpdateDocumentTmpl;
    
    protected boolean localUpdateDocumentTmplTracker = false;
    
    public boolean isUpdateDocumentTmplSpecified() {
        return localUpdateDocumentTmplTracker;
    }
    
    /** 
     * Auto generated getter method
     * @return hr.ponge.pfa.axis.core.operations.UpdateDocumentTmplReq
     */
    public hr.ponge.pfa.axis.core.operations.UpdateDocumentTmplReq getUpdateDocumentTmpl() {
        return localUpdateDocumentTmpl;
    }
    
    /** 
     * Auto generated setter method
     * @param param UpdateDocumentTmpl
     */
    public void setUpdateDocumentTmpl(hr.ponge.pfa.axis.core.operations.UpdateDocumentTmplReq param) {
        clearAllSettingTrackers();
        localUpdateDocumentTmplTracker = param != null;
        this.localUpdateDocumentTmpl = param;
    }
    
    /** 
     * field for DeleteDocumentTmpl
     */
    protected hr.ponge.pfa.axis.core.operations.DeleteDocumentTmplReq localDeleteDocumentTmpl;
    
    protected boolean localDeleteDocumentTmplTracker = false;
    
    public boolean isDeleteDocumentTmplSpecified() {
        return localDeleteDocumentTmplTracker;
    }
    
    /** 
     * Auto generated getter method
     * @return hr.ponge.pfa.axis.core.operations.DeleteDocumentTmplReq
     */
    public hr.ponge.pfa.axis.core.operations.DeleteDocumentTmplReq getDeleteDocumentTmpl() {
        return localDeleteDocumentTmpl;
    }
    
    /** 
     * Auto generated setter method
     * @param param DeleteDocumentTmpl
     */
    public void setDeleteDocumentTmpl(hr.ponge.pfa.axis.core.operations.DeleteDocumentTmplReq param) {
        clearAllSettingTrackers();
        localDeleteDocumentTmplTracker = param != null;
        this.localDeleteDocumentTmpl = param;
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
        if (localCreatePictureTracker) {
            if ((localCreatePicture) == null) {
                throw new org.apache.axis2.databinding.ADBException("createPicture cannot be null!!");
            } 
            localCreatePicture.serialize(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "createPicture") ,xmlWriter);
        } 
        if (localReadPictureTracker) {
            if ((localReadPicture) == null) {
                throw new org.apache.axis2.databinding.ADBException("readPicture cannot be null!!");
            } 
            localReadPicture.serialize(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "readPicture") ,xmlWriter);
        } 
        if (localUpdatePictureTracker) {
            if ((localUpdatePicture) == null) {
                throw new org.apache.axis2.databinding.ADBException("updatePicture cannot be null!!");
            } 
            localUpdatePicture.serialize(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "updatePicture") ,xmlWriter);
        } 
        if (localDeletePictureTracker) {
            if ((localDeletePicture) == null) {
                throw new org.apache.axis2.databinding.ADBException("deletePicture cannot be null!!");
            } 
            localDeletePicture.serialize(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "deletePicture") ,xmlWriter);
        } 
        if (localCreatePictureTmplTracker) {
            if ((localCreatePictureTmpl) == null) {
                throw new org.apache.axis2.databinding.ADBException("createPictureTmpl cannot be null!!");
            } 
            localCreatePictureTmpl.serialize(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "createPictureTmpl") ,xmlWriter);
        } 
        if (localReadPictureTmplTracker) {
            if ((localReadPictureTmpl) == null) {
                throw new org.apache.axis2.databinding.ADBException("readPictureTmpl cannot be null!!");
            } 
            localReadPictureTmpl.serialize(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "readPictureTmpl") ,xmlWriter);
        } 
        if (localUpdatePictureTmplTracker) {
            if ((localUpdatePictureTmpl) == null) {
                throw new org.apache.axis2.databinding.ADBException("updatePictureTmpl cannot be null!!");
            } 
            localUpdatePictureTmpl.serialize(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "updatePictureTmpl") ,xmlWriter);
        } 
        if (localDeletePictureTmplTracker) {
            if ((localDeletePictureTmpl) == null) {
                throw new org.apache.axis2.databinding.ADBException("deletePictureTmpl cannot be null!!");
            } 
            localDeletePictureTmpl.serialize(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "deletePictureTmpl") ,xmlWriter);
        } 
        if (localCreateDocumentTracker) {
            if ((localCreateDocument) == null) {
                throw new org.apache.axis2.databinding.ADBException("createDocument cannot be null!!");
            } 
            localCreateDocument.serialize(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "createDocument") ,xmlWriter);
        } 
        if (localReadDocumentTracker) {
            if ((localReadDocument) == null) {
                throw new org.apache.axis2.databinding.ADBException("readDocument cannot be null!!");
            } 
            localReadDocument.serialize(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "readDocument") ,xmlWriter);
        } 
        if (localUpdateDocumentTracker) {
            if ((localUpdateDocument) == null) {
                throw new org.apache.axis2.databinding.ADBException("updateDocument cannot be null!!");
            } 
            localUpdateDocument.serialize(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "updateDocument") ,xmlWriter);
        } 
        if (localDeleteDocumentTracker) {
            if ((localDeleteDocument) == null) {
                throw new org.apache.axis2.databinding.ADBException("deleteDocument cannot be null!!");
            } 
            localDeleteDocument.serialize(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "deleteDocument") ,xmlWriter);
        } 
        if (localCreateDocumentTmplTracker) {
            if ((localCreateDocumentTmpl) == null) {
                throw new org.apache.axis2.databinding.ADBException("createDocumentTmpl cannot be null!!");
            } 
            localCreateDocumentTmpl.serialize(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "createDocumentTmpl") ,xmlWriter);
        } 
        if (localReadDocumentTmplTracker) {
            if ((localReadDocumentTmpl) == null) {
                throw new org.apache.axis2.databinding.ADBException("readDocumentTmpl cannot be null!!");
            } 
            localReadDocumentTmpl.serialize(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "readDocumentTmpl") ,xmlWriter);
        } 
        if (localUpdateDocumentTmplTracker) {
            if ((localUpdateDocumentTmpl) == null) {
                throw new org.apache.axis2.databinding.ADBException("updateDocumentTmpl cannot be null!!");
            } 
            localUpdateDocumentTmpl.serialize(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "updateDocumentTmpl") ,xmlWriter);
        } 
        if (localDeleteDocumentTmplTracker) {
            if ((localDeleteDocumentTmpl) == null) {
                throw new org.apache.axis2.databinding.ADBException("deleteDocumentTmpl cannot be null!!");
            } 
            localDeleteDocumentTmpl.serialize(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "deleteDocumentTmpl") ,xmlWriter);
        } 
    }
    
    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://ponge.hr/pfa/axis")) {
            return "ns6";
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
        if (localCreatePictureTracker) {
            elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "createPicture"));
            if ((localCreatePicture) == null) {
                throw new org.apache.axis2.databinding.ADBException("createPicture cannot be null!!");
            } 
            elementList.add(localCreatePicture);
        } 
        if (localReadPictureTracker) {
            elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "readPicture"));
            if ((localReadPicture) == null) {
                throw new org.apache.axis2.databinding.ADBException("readPicture cannot be null!!");
            } 
            elementList.add(localReadPicture);
        } 
        if (localUpdatePictureTracker) {
            elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "updatePicture"));
            if ((localUpdatePicture) == null) {
                throw new org.apache.axis2.databinding.ADBException("updatePicture cannot be null!!");
            } 
            elementList.add(localUpdatePicture);
        } 
        if (localDeletePictureTracker) {
            elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "deletePicture"));
            if ((localDeletePicture) == null) {
                throw new org.apache.axis2.databinding.ADBException("deletePicture cannot be null!!");
            } 
            elementList.add(localDeletePicture);
        } 
        if (localCreatePictureTmplTracker) {
            elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "createPictureTmpl"));
            if ((localCreatePictureTmpl) == null) {
                throw new org.apache.axis2.databinding.ADBException("createPictureTmpl cannot be null!!");
            } 
            elementList.add(localCreatePictureTmpl);
        } 
        if (localReadPictureTmplTracker) {
            elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "readPictureTmpl"));
            if ((localReadPictureTmpl) == null) {
                throw new org.apache.axis2.databinding.ADBException("readPictureTmpl cannot be null!!");
            } 
            elementList.add(localReadPictureTmpl);
        } 
        if (localUpdatePictureTmplTracker) {
            elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "updatePictureTmpl"));
            if ((localUpdatePictureTmpl) == null) {
                throw new org.apache.axis2.databinding.ADBException("updatePictureTmpl cannot be null!!");
            } 
            elementList.add(localUpdatePictureTmpl);
        } 
        if (localDeletePictureTmplTracker) {
            elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "deletePictureTmpl"));
            if ((localDeletePictureTmpl) == null) {
                throw new org.apache.axis2.databinding.ADBException("deletePictureTmpl cannot be null!!");
            } 
            elementList.add(localDeletePictureTmpl);
        } 
        if (localCreateDocumentTracker) {
            elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "createDocument"));
            if ((localCreateDocument) == null) {
                throw new org.apache.axis2.databinding.ADBException("createDocument cannot be null!!");
            } 
            elementList.add(localCreateDocument);
        } 
        if (localReadDocumentTracker) {
            elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "readDocument"));
            if ((localReadDocument) == null) {
                throw new org.apache.axis2.databinding.ADBException("readDocument cannot be null!!");
            } 
            elementList.add(localReadDocument);
        } 
        if (localUpdateDocumentTracker) {
            elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "updateDocument"));
            if ((localUpdateDocument) == null) {
                throw new org.apache.axis2.databinding.ADBException("updateDocument cannot be null!!");
            } 
            elementList.add(localUpdateDocument);
        } 
        if (localDeleteDocumentTracker) {
            elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "deleteDocument"));
            if ((localDeleteDocument) == null) {
                throw new org.apache.axis2.databinding.ADBException("deleteDocument cannot be null!!");
            } 
            elementList.add(localDeleteDocument);
        } 
        if (localCreateDocumentTmplTracker) {
            elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "createDocumentTmpl"));
            if ((localCreateDocumentTmpl) == null) {
                throw new org.apache.axis2.databinding.ADBException("createDocumentTmpl cannot be null!!");
            } 
            elementList.add(localCreateDocumentTmpl);
        } 
        if (localReadDocumentTmplTracker) {
            elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "readDocumentTmpl"));
            if ((localReadDocumentTmpl) == null) {
                throw new org.apache.axis2.databinding.ADBException("readDocumentTmpl cannot be null!!");
            } 
            elementList.add(localReadDocumentTmpl);
        } 
        if (localUpdateDocumentTmplTracker) {
            elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "updateDocumentTmpl"));
            if ((localUpdateDocumentTmpl) == null) {
                throw new org.apache.axis2.databinding.ADBException("updateDocumentTmpl cannot be null!!");
            } 
            elementList.add(localUpdateDocumentTmpl);
        } 
        if (localDeleteDocumentTmplTracker) {
            elementList.add(new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "deleteDocumentTmpl"));
            if ((localDeleteDocumentTmpl) == null) {
                throw new org.apache.axis2.databinding.ADBException("deleteDocumentTmpl cannot be null!!");
            } 
            elementList.add(localDeleteDocumentTmpl);
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
                } else if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "createPicture").equals(reader.getName()))) {
                    object.setCreatePicture(hr.ponge.pfa.axis.core.operations.CreatePictureReq.Factory.parse(reader));
                    reader.next();
                } else if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "readPicture").equals(reader.getName()))) {
                    object.setReadPicture(hr.ponge.pfa.axis.core.operations.ReadPictureReq.Factory.parse(reader));
                    reader.next();
                } else if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "updatePicture").equals(reader.getName()))) {
                    object.setUpdatePicture(hr.ponge.pfa.axis.core.operations.UpdatePictureReq.Factory.parse(reader));
                    reader.next();
                } else if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "deletePicture").equals(reader.getName()))) {
                    object.setDeletePicture(hr.ponge.pfa.axis.core.operations.DeletePictureReq.Factory.parse(reader));
                    reader.next();
                } else if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "createPictureTmpl").equals(reader.getName()))) {
                    object.setCreatePictureTmpl(hr.ponge.pfa.axis.core.operations.CreatePictureTmplReq.Factory.parse(reader));
                    reader.next();
                } else if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "readPictureTmpl").equals(reader.getName()))) {
                    object.setReadPictureTmpl(hr.ponge.pfa.axis.core.operations.ReadPictureTmplReq.Factory.parse(reader));
                    reader.next();
                } else if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "updatePictureTmpl").equals(reader.getName()))) {
                    object.setUpdatePictureTmpl(hr.ponge.pfa.axis.core.operations.UpdatePictureTmplReq.Factory.parse(reader));
                    reader.next();
                } else if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "deletePictureTmpl").equals(reader.getName()))) {
                    object.setDeletePictureTmpl(hr.ponge.pfa.axis.core.operations.DeletePictureTmplReq.Factory.parse(reader));
                    reader.next();
                } else if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "createDocument").equals(reader.getName()))) {
                    object.setCreateDocument(hr.ponge.pfa.axis.core.operations.CreateDocumentReq.Factory.parse(reader));
                    reader.next();
                } else if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "readDocument").equals(reader.getName()))) {
                    object.setReadDocument(hr.ponge.pfa.axis.core.operations.ReadDocumentReq.Factory.parse(reader));
                    reader.next();
                } else if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "updateDocument").equals(reader.getName()))) {
                    object.setUpdateDocument(hr.ponge.pfa.axis.core.operations.UpdateDocumentReq.Factory.parse(reader));
                    reader.next();
                } else if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "deleteDocument").equals(reader.getName()))) {
                    object.setDeleteDocument(hr.ponge.pfa.axis.core.operations.DeleteDocumentReq.Factory.parse(reader));
                    reader.next();
                } else if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "createDocumentTmpl").equals(reader.getName()))) {
                    object.setCreateDocumentTmpl(hr.ponge.pfa.axis.core.operations.CreateDocumentTmplReq.Factory.parse(reader));
                    reader.next();
                } else if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "readDocumentTmpl").equals(reader.getName()))) {
                    object.setReadDocumentTmpl(hr.ponge.pfa.axis.core.operations.ReadDocumentTmplReq.Factory.parse(reader));
                    reader.next();
                } else if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "updateDocumentTmpl").equals(reader.getName()))) {
                    object.setUpdateDocumentTmpl(hr.ponge.pfa.axis.core.operations.UpdateDocumentTmplReq.Factory.parse(reader));
                    reader.next();
                } else if ((reader.isStartElement()) && (new javax.xml.namespace.QName("http://ponge.hr/pfa/axis" , "deleteDocumentTmpl").equals(reader.getName()))) {
                    object.setDeleteDocumentTmpl(hr.ponge.pfa.axis.core.operations.DeleteDocumentTmplReq.Factory.parse(reader));
                    reader.next();
                } 
            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }
            return object;
        }
        
    }
    
}

