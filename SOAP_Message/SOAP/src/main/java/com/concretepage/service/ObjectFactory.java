
package com.concretepage.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.concretepage.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetSoapMessage_QNAME = new QName("http://service.concretepage.com/", "getSoapMessage");
    private final static QName _GetWelcomeMsgResponse_QNAME = new QName("http://service.concretepage.com/", "getWelcomeMsgResponse");
    private final static QName _GetSoapMessageResponse_QNAME = new QName("http://service.concretepage.com/", "getSoapMessageResponse");
    private final static QName _GetWelcomeMsg_QNAME = new QName("http://service.concretepage.com/", "getWelcomeMsg");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.concretepage.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSoapMessageResponse }
     * 
     */
    public GetSoapMessageResponse createGetSoapMessageResponse() {
        return new GetSoapMessageResponse();
    }

    /**
     * Create an instance of {@link GetWelcomeMsg }
     * 
     */
    public GetWelcomeMsg createGetWelcomeMsg() {
        return new GetWelcomeMsg();
    }

    /**
     * Create an instance of {@link GetWelcomeMsgResponse }
     * 
     */
    public GetWelcomeMsgResponse createGetWelcomeMsgResponse() {
        return new GetWelcomeMsgResponse();
    }

    /**
     * Create an instance of {@link GetSoapMessage }
     * 
     */
    public GetSoapMessage createGetSoapMessage() {
        return new GetSoapMessage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSoapMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.concretepage.com/", name = "getSoapMessage")
    public JAXBElement<GetSoapMessage> createGetSoapMessage(GetSoapMessage value) {
        return new JAXBElement<GetSoapMessage>(_GetSoapMessage_QNAME, GetSoapMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWelcomeMsgResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.concretepage.com/", name = "getWelcomeMsgResponse")
    public JAXBElement<GetWelcomeMsgResponse> createGetWelcomeMsgResponse(GetWelcomeMsgResponse value) {
        return new JAXBElement<GetWelcomeMsgResponse>(_GetWelcomeMsgResponse_QNAME, GetWelcomeMsgResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSoapMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.concretepage.com/", name = "getSoapMessageResponse")
    public JAXBElement<GetSoapMessageResponse> createGetSoapMessageResponse(GetSoapMessageResponse value) {
        return new JAXBElement<GetSoapMessageResponse>(_GetSoapMessageResponse_QNAME, GetSoapMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWelcomeMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.concretepage.com/", name = "getWelcomeMsg")
    public JAXBElement<GetWelcomeMsg> createGetWelcomeMsg(GetWelcomeMsg value) {
        return new JAXBElement<GetWelcomeMsg>(_GetWelcomeMsg_QNAME, GetWelcomeMsg.class, null, value);
    }

}
