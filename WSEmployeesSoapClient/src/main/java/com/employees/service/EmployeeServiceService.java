
package com.employees.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "EmployeeServiceService", targetNamespace = "http://service.employees.com/", wsdlLocation = "file:/C:/Users/simon/AppData/Local/Temp/tempdir13428018224689439046.tmp/wsemployee_1.wsdl")
public class EmployeeServiceService
    extends Service
{

    private final static URL EMPLOYEESERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException EMPLOYEESERVICESERVICE_EXCEPTION;
    private final static QName EMPLOYEESERVICESERVICE_QNAME = new QName("http://service.employees.com/", "EmployeeServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/simon/AppData/Local/Temp/tempdir13428018224689439046.tmp/wsemployee_1.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EMPLOYEESERVICESERVICE_WSDL_LOCATION = url;
        EMPLOYEESERVICESERVICE_EXCEPTION = e;
    }

    public EmployeeServiceService() {
        super(__getWsdlLocation(), EMPLOYEESERVICESERVICE_QNAME);
    }

    public EmployeeServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), EMPLOYEESERVICESERVICE_QNAME, features);
    }

    public EmployeeServiceService(URL wsdlLocation) {
        super(wsdlLocation, EMPLOYEESERVICESERVICE_QNAME);
    }

    public EmployeeServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EMPLOYEESERVICESERVICE_QNAME, features);
    }

    public EmployeeServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EmployeeServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EmployeeService
     */
    @WebEndpoint(name = "EmployeeServicePort")
    public EmployeeService getEmployeeServicePort() {
        return super.getPort(new QName("http://service.employees.com/", "EmployeeServicePort"), EmployeeService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EmployeeService
     */
    @WebEndpoint(name = "EmployeeServicePort")
    public EmployeeService getEmployeeServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.employees.com/", "EmployeeServicePort"), EmployeeService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EMPLOYEESERVICESERVICE_EXCEPTION!= null) {
            throw EMPLOYEESERVICESERVICE_EXCEPTION;
        }
        return EMPLOYEESERVICESERVICE_WSDL_LOCATION;
    }

}