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
        if (("http://ponge.hr/pfa/axis/base".equals(namespaceURI)) && ("RequestMetaData".equals(typeName))) {
            return hr.ponge.pfa.axis.base.RequestMetaData.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/env/operations".equals(namespaceURI)) && ("CreateTenantReq".equals(typeName))) {
            return hr.ponge.pfa.axis.env.operations.CreateTenantReq.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/env/operations".equals(namespaceURI)) && ("CreateUserReq".equals(typeName))) {
            return hr.ponge.pfa.axis.env.operations.CreateUserReq.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/env/operations".equals(namespaceURI)) && ("UpdateUserResp".equals(typeName))) {
            return hr.ponge.pfa.axis.env.operations.UpdateUserResp.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/env/operations".equals(namespaceURI)) && ("DeleteTenantReq".equals(typeName))) {
            return hr.ponge.pfa.axis.env.operations.DeleteTenantReq.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/env/operations".equals(namespaceURI)) && ("ReadTenantReq".equals(typeName))) {
            return hr.ponge.pfa.axis.env.operations.ReadTenantReq.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/env/operations".equals(namespaceURI)) && ("ReadUserReq".equals(typeName))) {
            return hr.ponge.pfa.axis.env.operations.ReadUserReq.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/env".equals(namespaceURI)) && ("User".equals(typeName))) {
            return hr.ponge.pfa.axis.env.User.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/env/operations".equals(namespaceURI)) && ("CreateUserResp".equals(typeName))) {
            return hr.ponge.pfa.axis.env.operations.CreateUserResp.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/env/operations".equals(namespaceURI)) && ("ReadUserResp".equals(typeName))) {
            return hr.ponge.pfa.axis.env.operations.ReadUserResp.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/env/operations".equals(namespaceURI)) && ("DeleteUserReq".equals(typeName))) {
            return hr.ponge.pfa.axis.env.operations.DeleteUserReq.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/base".equals(namespaceURI)) && ("ResponseMetaData".equals(typeName))) {
            return hr.ponge.pfa.axis.base.ResponseMetaData.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/env/operations".equals(namespaceURI)) && ("CreateTenantResp".equals(typeName))) {
            return hr.ponge.pfa.axis.env.operations.CreateTenantResp.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/base".equals(namespaceURI)) && ("ErrorType".equals(typeName))) {
            return hr.ponge.pfa.axis.base.ErrorType.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/env/operations".equals(namespaceURI)) && ("DeleteTenantResp".equals(typeName))) {
            return hr.ponge.pfa.axis.env.operations.DeleteTenantResp.Factory.parse(reader);
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
        if (("http://ponge.hr/pfa/axis/env/operations".equals(namespaceURI)) && ("UpdateUserReq".equals(typeName))) {
            return hr.ponge.pfa.axis.env.operations.UpdateUserReq.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis".equals(namespaceURI)) && ("EsoResponse".equals(typeName))) {
            return hr.ponge.pfa.axis.EsoResponse.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis/env/operations".equals(namespaceURI)) && ("UpdateTenantResp".equals(typeName))) {
            return hr.ponge.pfa.axis.env.operations.UpdateTenantResp.Factory.parse(reader);
        } 
        if (("http://ponge.hr/pfa/axis".equals(namespaceURI)) && ("EsoRequest".equals(typeName))) {
            return hr.ponge.pfa.axis.EsoRequest.Factory.parse(reader);
        } 
        throw new org.apache.axis2.databinding.ADBException(((("Unsupported type " + namespaceURI) + " ") + typeName));
    }
    
}

