package hr.ponge.pfa.axisLocalService;


public class PfaServiceStartupListener implements org.apache.axis2.engine.ServiceLifeCycle {
    @java.lang.Override
    public void shutDown(org.apache.axis2.context.ConfigurationContext arg0, org.apache.axis2.description.AxisService arg1) {
        hr.ponge.util.HibernateUtil.shutdown();
    }
    
    @java.lang.Override
    public void startUp(org.apache.axis2.context.ConfigurationContext arg0, org.apache.axis2.description.AxisService arg1) {
        hr.ponge.util.HibernateUtil.buildSessionFactory();
    }
    
}

