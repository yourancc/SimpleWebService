/**
 * SimpleWebServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.yourancc.service;

public class SimpleWebServiceServiceLocator extends org.apache.axis.client.Service implements cn.yourancc.service.SimpleWebServiceService {

    public SimpleWebServiceServiceLocator() {
    }


    public SimpleWebServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SimpleWebServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SimpleWebServicePort
    private java.lang.String SimpleWebServicePort_address = "http://127.0.0.1:8080/Service/ServiceHello";

    public java.lang.String getSimpleWebServicePortAddress() {
        return SimpleWebServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SimpleWebServicePortWSDDServiceName = "SimpleWebServicePort";

    public java.lang.String getSimpleWebServicePortWSDDServiceName() {
        return SimpleWebServicePortWSDDServiceName;
    }

    public void setSimpleWebServicePortWSDDServiceName(java.lang.String name) {
        SimpleWebServicePortWSDDServiceName = name;
    }

    public cn.yourancc.service.SimpleWebService getSimpleWebServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SimpleWebServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSimpleWebServicePort(endpoint);
    }

    public cn.yourancc.service.SimpleWebService getSimpleWebServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cn.yourancc.service.SimpleWebServicePortBindingStub _stub = new cn.yourancc.service.SimpleWebServicePortBindingStub(portAddress, this);
            _stub.setPortName(getSimpleWebServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSimpleWebServicePortEndpointAddress(java.lang.String address) {
        SimpleWebServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cn.yourancc.service.SimpleWebService.class.isAssignableFrom(serviceEndpointInterface)) {
                cn.yourancc.service.SimpleWebServicePortBindingStub _stub = new cn.yourancc.service.SimpleWebServicePortBindingStub(new java.net.URL(SimpleWebServicePort_address), this);
                _stub.setPortName(getSimpleWebServicePortWSDDServiceName());
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
        if ("SimpleWebServicePort".equals(inputPortName)) {
            return getSimpleWebServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.yourancc.cn/", "SimpleWebServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.yourancc.cn/", "SimpleWebServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SimpleWebServicePort".equals(portName)) {
            setSimpleWebServicePortEndpointAddress(address);
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
