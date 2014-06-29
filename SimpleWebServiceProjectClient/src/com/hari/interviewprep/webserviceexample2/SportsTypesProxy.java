package com.hari.interviewprep.webserviceexample2;

public class SportsTypesProxy implements com.hari.interviewprep.webserviceexample2.SportsTypes {
  private String _endpoint = null;
  private com.hari.interviewprep.webserviceexample2.SportsTypes sportsTypes = null;
  
  public SportsTypesProxy() {
    _initSportsTypesProxy();
  }
  
  public SportsTypesProxy(String endpoint) {
    _endpoint = endpoint;
    _initSportsTypesProxy();
  }
  
  private void _initSportsTypesProxy() {
    try {
      sportsTypes = (new com.hari.interviewprep.webserviceexample2.SportsTypesServiceLocator()).getSportsTypes();
      if (sportsTypes != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sportsTypes)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sportsTypes)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sportsTypes != null)
      ((javax.xml.rpc.Stub)sportsTypes)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.hari.interviewprep.webserviceexample2.SportsTypes getSportsTypes() {
    if (sportsTypes == null)
      _initSportsTypesProxy();
    return sportsTypes;
  }
  
  public java.lang.Object[] getSportsType(java.lang.String category) throws java.rmi.RemoteException{
    if (sportsTypes == null)
      _initSportsTypesProxy();
    return sportsTypes.getSportsType(category);
  }
  
  
}