package com.concretepage.client;

import com.sun.xml.internal.messaging.saaj.soap.impl.BodyElementImpl;
import com.concretepage.service.*;
import javax.activation.DataHandler;
import javax.xml.soap.*;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import javax.xml.namespace.QName;
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

        SOAPElement soapElement = soapBody.addChildElement("getSoapMessage", "end");
        SOAPElement person=soapElement.addChildElement("person");


        QName ID = new QName("id");
        person.addAttribute(ID, "1");
        QName Name = new QName("Name");
        person.addAttribute(Name, "Tom");
        person.addTextNode("XXXX");
//        person.addAttribute(QName.valueOf("id"),"1");
//        person.addAttribute(QName.valueOf("Name"),"John");
//
//        SOAPElement soapElement1 = soapBody.addChildElement("persons2", "end");
//        SOAPElement person1=soapElement1.addChildElement("person");
//        person1.addTextNode("Text Node");

//        person1.addAttribute(QName.valueOf("id"),"2");
//        person1.addAttribute(QName.valueOf("Name"),"Nic");
        soapMessage.saveChanges();

        URL url = new URL("file:///C:/Users/jafar/Desktop/test.txt");
        DataHandler dataHandler = new DataHandler(url);
        AttachmentPart att = soapMessage.createAttachmentPart(dataHandler);
        att.setContentId("cid:1234");
        soapMessage.addAttachmentPart(att);

        soapMessage.saveChanges();
        System.out.println("----------SOAP Request------------");
        soapMessage.writeTo(System.out);
        System.out.print("\n\n\n"+"Accessing an AttachmentPart Object"+"\n");

        java.util.Iterator iterator = soapMessage.getAttachments();
        while (iterator.hasNext()) {
            AttachmentPart attachment = (AttachmentPart)iterator.next();
            String id = attachment.getContentId();
            String type = attachment.getContentType();
            System.out.print("Attachment " + id + " has content type " + type);
            if (type.equals("text/plain")) {
                Object content = attachment.getContent();
                System.out.println("Attachment contains:\n" + content);
            }
        }
        System.out.print("\n\n\n"+"Getting Person Information"+"\n");

        System.out.println("ID: "+person.getAttributeValue(QName.valueOf("id")));
        System.out.println("Name: "+person.getAttributeValue(QName.valueOf("Name"))+"\n");
        //System.out.println("ID: "+person1.getAttributeValue(QName.valueOf("id")));
        //System.out.println("Name: "+person1.getAttributeValue(QName.valueOf("Name"))+"\n");


//        Iterator iterator1 = person.getAllAttributesAsQNames();
//        while (iterator1.hasNext()){
//            QName attributeName = (QName) iterator1.next();
//            System.out.println("Attribute name is " + attributeName.toString());
//            System.out.println("Attribute value is " + person.getAttributeValue(attributeName));
//        }
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
