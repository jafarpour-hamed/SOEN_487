
package com.concretepage.endpoint;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.concretepage.endpoint package. 
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

    private final static QName _GetWelcomeMsg_QNAME = new QName("http://endpoint.concretepage.com/", "getWelcomeMsg");
    private final static QName _GetWelcomeMsgResponse_QNAME = new QName("http://endpoint.concretepage.com/", "getWelcomeMsgResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.concretepage.endpoint
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWelcomeMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.concretepage.com/", name = "getWelcomeMsg")
    public JAXBElement<GetWelcomeMsg> createGetWelcomeMsg(GetWelcomeMsg value) {
        return new JAXBElement<GetWelcomeMsg>(_GetWelcomeMsg_QNAME, GetWelcomeMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWelcomeMsgResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.concretepage.com/", name = "getWelcomeMsgResponse")
    public JAXBElement<GetWelcomeMsgResponse> createGetWelcomeMsgResponse(GetWelcomeMsgResponse value) {
        return new JAXBElement<GetWelcomeMsgResponse>(_GetWelcomeMsgResponse_QNAME, GetWelcomeMsgResponse.class, null, value);
    }

}
