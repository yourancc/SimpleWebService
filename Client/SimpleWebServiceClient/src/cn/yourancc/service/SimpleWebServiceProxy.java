package cn.yourancc.service;

public class SimpleWebServiceProxy implements cn.yourancc.service.SimpleWebService {
  private String _endpoint = null;
  private cn.yourancc.service.SimpleWebService simpleWebService = null;
  
  public SimpleWebServiceProxy() {
    _initSimpleWebServiceProxy();
  }
  
  public SimpleWebServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initSimpleWebServiceProxy();
  }
  
  private void _initSimpleWebServiceProxy() {
    try {
      simpleWebService = (new cn.yourancc.service.SimpleWebServiceServiceLocator()).getSimpleWebServicePort();
      if (simpleWebService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)simpleWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)simpleWebService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (simpleWebService != null)
      ((javax.xml.rpc.Stub)simpleWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cn.yourancc.service.SimpleWebService getSimpleWebService() {
    if (simpleWebService == null)
      _initSimpleWebServiceProxy();
    return simpleWebService;
  }
  
  public java.lang.String getValue(java.lang.String arg0) throws java.rmi.RemoteException{
    if (simpleWebService == null)
      _initSimpleWebServiceProxy();
    return simpleWebService.getValue(arg0);
  }
  
  
}