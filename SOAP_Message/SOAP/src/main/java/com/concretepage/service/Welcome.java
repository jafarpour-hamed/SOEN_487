
package com.concretepage.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Welcome", targetNamespace = "http://service.concretepage.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Welcome {


    /**
     * 
     * @param arg0
     * @return
     *     returns com.concretepage.service.SoapMessage
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSoapMessage", targetNamespace = "http://service.concretepage.com/", className = "com.concretepage.service.GetSoapMessage")
    @ResponseWrapper(localName = "getSoapMessageResponse", targetNamespace = "http://service.concretepage.com/", className = "com.concretepage.service.GetSoapMessageResponse")
    @Action(input = "http://service.concretepage.com/Welcome/getSoapMessageRequest", output = "http://service.concretepage.com/Welcome/getSoapMessageResponse")
    public SoapMessage getSoapMessage(
        @WebParam(name = "arg0", targetNamespace = "")
        SoapMessage arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getWelcomeMsg", targetNamespace = "http://service.concretepage.com/", className = "com.concretepage.service.GetWelcomeMsg")
    @ResponseWrapper(localName = "getWelcomeMsgResponse", targetNamespace = "http://service.concretepage.com/", className = "com.concretepage.service.GetWelcomeMsgResponse")
    @Action(input = "http://service.concretepage.com/Welcome/getWelcomeMsgRequest", output = "http://service.concretepage.com/Welcome/getWelcomeMsgResponse")
    public String getWelcomeMsg(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    SOAPMessage getSoapMessage(SOAPMessage soapMessage);
}
