/**
 * SportsTypesServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hari.interviewprep.webserviceexample2;

public class SportsTypesServiceLocator extends org.apache.axis.client.Service implements com.hari.interviewprep.webserviceexample2.SportsTypesService {

    public SportsTypesServiceLocator() {
    }


    public SportsTypesServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SportsTypesServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SportsTypes
    private java.lang.String SportsTypes_address = "http://localhost:8080/SimpleWebServiceProject/services/SportsTypes";

    public java.lang.String getSportsTypesAddress() {
        return SportsTypes_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SportsTypesWSDDServiceName = "SportsTypes";

    public java.lang.String getSportsTypesWSDDServiceName() {
        return SportsTypesWSDDServiceName;
    }

    public void setSportsTypesWSDDServiceName(java.lang.String name) {
        SportsTypesWSDDServiceName = name;
    }

    public com.hari.interviewprep.webserviceexample2.SportsTypes getSportsTypes() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SportsTypes_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSportsTypes(endpoint);
    }

    public com.hari.interviewprep.webserviceexample2.SportsTypes getSportsTypes(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.hari.interviewprep.webserviceexample2.SportsTypesSoapBindingStub _stub = new com.hari.interviewprep.webserviceexample2.SportsTypesSoapBindingStub(portAddress, this);
            _stub.setPortName(getSportsTypesWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSportsTypesEndpointAddress(java.lang.String address) {
        SportsTypes_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.hari.interviewprep.webserviceexample2.SportsTypes.class.isAssignableFrom(serviceEndpointInterface)) {
                com.hari.interviewprep.webserviceexample2.SportsTypesSoapBindingStub _stub = new com.hari.interviewprep.webserviceexample2.SportsTypesSoapBindingStub(new java.net.URL(SportsTypes_address), this);
                _stub.setPortName(getSportsTypesWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SportsTypes".equals(inputPortName)) {
            return getSportsTypes();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webserviceexample2.interviewprep.hari.com", "SportsTypesService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webserviceexample2.interviewprep.hari.com", "SportsTypes"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SportsTypes".equals(portName)) {
            setSportsTypesEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
