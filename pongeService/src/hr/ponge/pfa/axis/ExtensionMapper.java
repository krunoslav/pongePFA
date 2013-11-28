package hr.ponge.pfa.axis;


/** 
 *  ExtensionMapper class
 */
@java.lang.SuppressWarnings(value = {"unchecked" ,"unused"})
public class ExtensionMapper {
    public static java.lang.Object getTypeObject(java.lang.String namespaceURI, java.lang.String typeName, javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
        if (("http://ponge.hr/pfa/axis/env/operations".equals(namespaceURI)) && ("DeleteUserResp".equals(typeName))) {
            return hr.ponge.pfa.axis.env.operations.DeleteUserResp.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/env".equals(namespaceURI)) && ("Tenant".equals(typeName))) {
            return hr.ponge.pfa.axis.env.Tenant.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/core/operations".equals(namespaceURI)) && ("ReadDocumentTmplResp".equals(typeName))) {
            return hr.ponge.pfa.axis.core.operations.ReadDocumentTmplResp.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/base".equals(namespaceURI)) && ("RequestMetaData".equals(typeName))) {
            return hr.ponge.pfa.axis.base.RequestMetaData.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/core/operations".equals(namespaceURI)) && ("ReadPictureReq".equals(typeName))) {
            return hr.ponge.pfa.axis.core.operations.ReadPictureReq.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/env/operations".equals(namespaceURI)) && ("CreateTenantReq".equals(typeName))) {
            return hr.ponge.pfa.axis.env.operations.CreateTenantReq.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/core/operations".equals(namespaceURI)) && ("UpdatePictureTmplReq".equals(typeName))) {
            return hr.ponge.pfa.axis.core.operations.UpdatePictureTmplReq.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/core/operations".equals(namespaceURI)) && ("ReadDocumentReq".equals(typeName))) {
            return hr.ponge.pfa.axis.core.operations.ReadDocumentReq.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/env/operations".equals(namespaceURI)) && ("UpdateUserResp".equals(typeName))) {
            return hr.ponge.pfa.axis.env.operations.UpdateUserResp.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/env/operations".equals(namespaceURI)) && ("DeleteTenantReq".equals(typeName))) {
            return hr.ponge.pfa.axis.env.operations.DeleteTenantReq.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/env/operations".equals(namespaceURI)) && ("ReadUserReq".equals(typeName))) {
            return hr.ponge.pfa.axis.env.operations.ReadUserReq.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/env/operations".equals(namespaceURI)) && ("ReadTenantReq".equals(typeName))) {
            return hr.ponge.pfa.axis.env.operations.ReadTenantReq.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/core/operations".equals(namespaceURI)) && ("UpdatePictureResp".equals(typeName))) {
            return hr.ponge.pfa.axis.core.operations.UpdatePictureResp.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/core".equals(namespaceURI)) && ("PictureTemplate".equals(typeName))) {
            return hr.ponge.pfa.axis.core.PictureTemplate.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/core/operations".equals(namespaceURI)) && ("ReadDocumentTmplReq".equals(typeName))) {
            return hr.ponge.pfa.axis.core.operations.ReadDocumentTmplReq.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/env/operations".equals(namespaceURI)) && ("CreateUserResp".equals(typeName))) {
            return hr.ponge.pfa.axis.env.operations.CreateUserResp.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/env/operations".equals(namespaceURI)) && ("ReadUserResp".equals(typeName))) {
            return hr.ponge.pfa.axis.env.operations.ReadUserResp.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/core/operations".equals(namespaceURI)) && ("DeleteDocumentTmplReq".equals(typeName))) {
            return hr.ponge.pfa.axis.core.operations.DeleteDocumentTmplReq.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/core/operations".equals(namespaceURI)) && ("CreatePictureTmplResp".equals(typeName))) {
            return hr.ponge.pfa.axis.core.operations.CreatePictureTmplResp.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/core/operations".equals(namespaceURI)) && ("UpdateDocumentTmplResp".equals(typeName))) {
            return hr.ponge.pfa.axis.core.operations.UpdateDocumentTmplResp.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/core/operations".equals(namespaceURI)) && ("DeleteDocumentReq".equals(typeName))) {
            return hr.ponge.pfa.axis.core.operations.DeleteDocumentReq.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/core/operations".equals(namespaceURI)) && ("DeleteDocumentResp".equals(typeName))) {
            return hr.ponge.pfa.axis.core.operations.DeleteDocumentResp.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/env/operations".equals(namespaceURI)) && ("DeleteTenantResp".equals(typeName))) {
            return hr.ponge.pfa.axis.env.operations.DeleteTenantResp.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/core/operations".equals(namespaceURI)) && ("DeletePictureTmplResp".equals(typeName))) {
            return hr.ponge.pfa.axis.core.operations.DeletePictureTmplResp.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/base".equals(namespaceURI)) && ("ReadOutLimits".equals(typeName))) {
            return hr.ponge.pfa.axis.base.ReadOutLimits.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/env/operations".equals(namespaceURI)) && ("ReadTenantResp".equals(typeName))) {
            return hr.ponge.pfa.axis.env.operations.ReadTenantResp.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/env/operations".equals(namespaceURI)) && ("UpdateTenantReq".equals(typeName))) {
            return hr.ponge.pfa.axis.env.operations.UpdateTenantReq.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis".equals(namespaceURI)) && ("EsoResponse".equals(typeName))) {
            return hr.ponge.pfa.axis.EsoResponse.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/core".equals(namespaceURI)) && ("Document".equals(typeName))) {
            return hr.ponge.pfa.axis.core.Document.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/core".equals(namespaceURI)) && ("Picture".equals(typeName))) {
            return hr.ponge.pfa.axis.core.Picture.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis".equals(namespaceURI)) && ("EsoRequest".equals(typeName))) {
            return hr.ponge.pfa.axis.EsoRequest.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/core/operations".equals(namespaceURI)) && ("CreateDocumentTmplResp".equals(typeName))) {
            return hr.ponge.pfa.axis.core.operations.CreateDocumentTmplResp.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/core/operations".equals(namespaceURI)) && ("DeletePictureTmplReq".equals(typeName))) {
            return hr.ponge.pfa.axis.core.operations.DeletePictureTmplReq.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/core/operations".equals(namespaceURI)) && ("UpdateDocumentResp".equals(typeName))) {
            return hr.ponge.pfa.axis.core.operations.UpdateDocumentResp.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/core/operations".equals(namespaceURI)) && ("DeleteDocumentTmplResp".equals(typeName))) {
            return hr.ponge.pfa.axis.core.operations.DeleteDocumentTmplResp.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/core/operations".equals(namespaceURI)) && ("CreatePictureResp".equals(typeName))) {
            return hr.ponge.pfa.axis.core.operations.CreatePictureResp.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/core/operations".equals(namespaceURI)) && ("UpdatePictureTmplResp".equals(typeName))) {
            return hr.ponge.pfa.axis.core.operations.UpdatePictureTmplResp.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/core/operations".equals(namespaceURI)) && ("ReadPictureTmplResp".equals(typeName))) {
            return hr.ponge.pfa.axis.core.operations.ReadPictureTmplResp.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/core/operations".equals(namespaceURI)) && ("UpdatePictureReq".equals(typeName))) {
            return hr.ponge.pfa.axis.core.operations.UpdatePictureReq.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/core".equals(namespaceURI)) && ("DocumentTemplate".equals(typeName))) {
            return hr.ponge.pfa.axis.core.DocumentTemplate.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/core/operations".equals(namespaceURI)) && ("CreatePictureTmplReq".equals(typeName))) {
            return hr.ponge.pfa.axis.core.operations.CreatePictureTmplReq.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/env/operations".equals(namespaceURI)) && ("CreateUserReq".equals(typeName))) {
            return hr.ponge.pfa.axis.env.operations.CreateUserReq.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/core/operations".equals(namespaceURI)) && ("CreateDocumentTmplReq".equals(typeName))) {
            return hr.ponge.pfa.axis.core.operations.CreateDocumentTmplReq.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/core/operations".equals(namespaceURI)) && ("ReadPictureTmplReq".equals(typeName))) {
            return hr.ponge.pfa.axis.core.operations.ReadPictureTmplReq.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/core/operations".equals(namespaceURI)) && ("ReadPictureResp".equals(typeName))) {
            return hr.ponge.pfa.axis.core.operations.ReadPictureResp.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/core/operations".equals(namespaceURI)) && ("ReadDocumentResp".equals(typeName))) {
            return hr.ponge.pfa.axis.core.operations.ReadDocumentResp.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/core/operations".equals(namespaceURI)) && ("DeletePictureReq".equals(typeName))) {
            return hr.ponge.pfa.axis.core.operations.DeletePictureReq.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/env".equals(namespaceURI)) && ("User".equals(typeName))) {
            return hr.ponge.pfa.axis.env.User.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/core/operations".equals(namespaceURI)) && ("UpdateDocumentTmplReq".equals(typeName))) {
            return hr.ponge.pfa.axis.core.operations.UpdateDocumentTmplReq.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/env/operations".equals(namespaceURI)) && ("DeleteUserReq".equals(typeName))) {
            return hr.ponge.pfa.axis.env.operations.DeleteUserReq.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/base".equals(namespaceURI)) && ("ResponseMetaData".equals(typeName))) {
            return hr.ponge.pfa.axis.base.ResponseMetaData.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/core/operations".equals(namespaceURI)) && ("DeletePictureResp".equals(typeName))) {
            return hr.ponge.pfa.axis.core.operations.DeletePictureResp.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/env/operations".equals(namespaceURI)) && ("CreateTenantResp".equals(typeName))) {
            return hr.ponge.pfa.axis.env.operations.CreateTenantResp.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/base".equals(namespaceURI)) && ("ErrorType".equals(typeName))) {
            return hr.ponge.pfa.axis.base.ErrorType.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/core/operations".equals(namespaceURI)) && ("CreateDocumentResp".equals(typeName))) {
            return hr.ponge.pfa.axis.core.operations.CreateDocumentResp.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/core/operations".equals(namespaceURI)) && ("CreatePictureReq".equals(typeName))) {
            return hr.ponge.pfa.axis.core.operations.CreatePictureReq.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/env/operations".equals(namespaceURI)) && ("UpdateUserReq".equals(typeName))) {
            return hr.ponge.pfa.axis.env.operations.UpdateUserReq.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/core/operations".equals(namespaceURI)) && ("CreateDocumentReq".equals(typeName))) {
            return hr.ponge.pfa.axis.core.operations.CreateDocumentReq.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/core/operations".equals(namespaceURI)) && ("UpdateDocumentReq".equals(typeName))) {
            return hr.ponge.pfa.axis.core.operations.UpdateDocumentReq.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/env/operations".equals(namespaceURI)) && ("UpdateTenantResp".equals(typeName))) {
            return hr.ponge.pfa.axis.env.operations.UpdateTenantResp.Factory.parse(reader);
        } 
        throw new org.apache.axis2.databinding.ADBException(((("Unsupported type " + namespaceURI) + " ") + typeName));
    }
    
}

