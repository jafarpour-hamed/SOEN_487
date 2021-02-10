package com.concretepage.client;

import javax.xml.soap.*;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import java.io.IOException;
/**
 * Hello world!
 */
public class HelloService
{
    private static SOAPMessage createSoapRequest() throws Exception {

        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();
        SOAPPart soapPart = soapMessage.getSOAPPart();
        SOAPEnvelope soapEnvelope = soapPart.getEnvelope();
        soapEnvelope.addNamespaceDeclaration("end", "http://endpoint.concretepage.com/");
        SOAPBody soapBody = soapEnvelope.getBody();
        SOAPElement soapElement = soapBody.addChildElement("getWelcomeMsg", "end");
        SOAPElement element1 = soapElement.addChildElement("arg0");
        element1.addTextNode("EveryOne");
        soapMessage.saveChanges();
        System.out.println("----------SOAP Request------------");
        soapMessage.writeTo(System.out);
        return soapMessage;
    }
    private static void createSoapResponse(SOAPMessage soapResponse) throws Exception  {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        Source sourceContent = soapResponse.getSOAPPart().getContent();
        System.out.println("\n----------SOAP Response-----------");
        StreamResult result = new StreamResult(System.out);
        transformer.transform(sourceContent, result);
    }
    public static void main(String args[]){
        try{
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();
            String url = "http://localhost:8080/WebServiceDemo/Welcome?wsdl";
            SOAPMessage soapRequest = createSoapRequest();
            //hit soapRequest to the server to get response
            SOAPMessage soapResponse = soapConnection.call(soapRequest, url);
            createSoapResponse(soapResponse);
            soapConnection.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}