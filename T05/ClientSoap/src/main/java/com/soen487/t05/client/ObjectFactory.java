
package com.soen487.t05.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.soen487.t05.client package. 
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

    private final static QName _GetPersonArrayResponse_QNAME = new QName("http://www.soen487.com/t05", "getPersonArrayResponse");
    private final static QName _GetWelcomeMsgResponse_QNAME = new QName("http://www.soen487.com/t05", "getWelcomeMsgResponse");
    private final static QName _Person_QNAME = new QName("http://www.soen487.com/t05", "person");
    private final static QName _SOAPException_QNAME = new QName("http://www.soen487.com/t05", "SOAPException");
    private final static QName _DownloadImageResponse_QNAME = new QName("http://www.soen487.com/t05", "downloadImageResponse");
    private final static QName _MissingName_QNAME = new QName("http://www.soen487.com/t05", "MissingName");
    private final static QName _GetWelcomeMsg_QNAME = new QName("http://www.soen487.com/t05", "getWelcomeMsg");
    private final static QName _UploadImageV2Response_QNAME = new QName("http://www.soen487.com/t05", "uploadImageV2Response");
    private final static QName _UploadImageResponse_QNAME = new QName("http://www.soen487.com/t05", "uploadImageResponse");
    private final static QName _DownloadImage_QNAME = new QName("http://www.soen487.com/t05", "downloadImage");
    private final static QName _GetPersonArray_QNAME = new QName("http://www.soen487.com/t05", "getPersonArray");
    private final static QName _UploadImage_QNAME = new QName("http://www.soen487.com/t05", "uploadImage");
    private final static QName _AddPersonResponse_QNAME = new QName("http://www.soen487.com/t05", "addPersonResponse");
    private final static QName _AddPerson_QNAME = new QName("http://www.soen487.com/t05", "addPerson");
    private final static QName _UploadImageV2_QNAME = new QName("http://www.soen487.com/t05", "uploadImageV2");
    private final static QName _IOException_QNAME = new QName("http://www.soen487.com/t05", "IOException");
    private final static QName _UploadImageFile_QNAME = new QName("", "file");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.soen487.t05.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddPersonResponse }
     * 
     */
    public AddPersonResponse createAddPersonResponse() {
        return new AddPersonResponse();
    }

    /**
     * Create an instance of {@link UploadImageV2 }
     * 
     */
    public UploadImageV2 createUploadImageV2() {
        return new UploadImageV2();
    }

    /**
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link AddPerson }
     * 
     */
    public AddPerson createAddPerson() {
        return new AddPerson();
    }

    /**
     * Create an instance of {@link MissingName }
     * 
     */
    public MissingName createMissingName() {
        return new MissingName();
    }

    /**
     * Create an instance of {@link GetWelcomeMsg }
     * 
     */
    public GetWelcomeMsg createGetWelcomeMsg() {
        return new GetWelcomeMsg();
    }

    /**
     * Create an instance of {@link UploadImageV2Response }
     * 
     */
    public UploadImageV2Response createUploadImageV2Response() {
        return new UploadImageV2Response();
    }

    /**
     * Create an instance of {@link GetPersonArrayResponse }
     * 
     */
    public GetPersonArrayResponse createGetPersonArrayResponse() {
        return new GetPersonArrayResponse();
    }

    /**
     * Create an instance of {@link GetWelcomeMsgResponse }
     * 
     */
    public GetWelcomeMsgResponse createGetWelcomeMsgResponse() {
        return new GetWelcomeMsgResponse();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link SOAPException }
     * 
     */
    public SOAPException createSOAPException() {
        return new SOAPException();
    }

    /**
     * Create an instance of {@link DownloadImageResponse }
     * 
     */
    public DownloadImageResponse createDownloadImageResponse() {
        return new DownloadImageResponse();
    }

    /**
     * Create an instance of {@link UploadImage }
     * 
     */
    public UploadImage createUploadImage() {
        return new UploadImage();
    }

    /**
     * Create an instance of {@link UploadImageResponse }
     * 
     */
    public UploadImageResponse createUploadImageResponse() {
        return new UploadImageResponse();
    }

    /**
     * Create an instance of {@link DownloadImage }
     * 
     */
    public DownloadImage createDownloadImage() {
        return new DownloadImage();
    }

    /**
     * Create an instance of {@link GetPersonArray }
     * 
     */
    public GetPersonArray createGetPersonArray() {
        return new GetPersonArray();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonArrayResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.soen487.com/t05", name = "getPersonArrayResponse")
    public JAXBElement<GetPersonArrayResponse> createGetPersonArrayResponse(GetPersonArrayResponse value) {
        return new JAXBElement<GetPersonArrayResponse>(_GetPersonArrayResponse_QNAME, GetPersonArrayResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWelcomeMsgResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.soen487.com/t05", name = "getWelcomeMsgResponse")
    public JAXBElement<GetWelcomeMsgResponse> createGetWelcomeMsgResponse(GetWelcomeMsgResponse value) {
        return new JAXBElement<GetWelcomeMsgResponse>(_GetWelcomeMsgResponse_QNAME, GetWelcomeMsgResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.soen487.com/t05", name = "person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SOAPException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.soen487.com/t05", name = "SOAPException")
    public JAXBElement<SOAPException> createSOAPException(SOAPException value) {
        return new JAXBElement<SOAPException>(_SOAPException_QNAME, SOAPException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadImageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.soen487.com/t05", name = "downloadImageResponse")
    public JAXBElement<DownloadImageResponse> createDownloadImageResponse(DownloadImageResponse value) {
        return new JAXBElement<DownloadImageResponse>(_DownloadImageResponse_QNAME, DownloadImageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MissingName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.soen487.com/t05", name = "MissingName")
    public JAXBElement<MissingName> createMissingName(MissingName value) {
        return new JAXBElement<MissingName>(_MissingName_QNAME, MissingName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWelcomeMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.soen487.com/t05", name = "getWelcomeMsg")
    public JAXBElement<GetWelcomeMsg> createGetWelcomeMsg(GetWelcomeMsg value) {
        return new JAXBElement<GetWelcomeMsg>(_GetWelcomeMsg_QNAME, GetWelcomeMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadImageV2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.soen487.com/t05", name = "uploadImageV2Response")
    public JAXBElement<UploadImageV2Response> createUploadImageV2Response(UploadImageV2Response value) {
        return new JAXBElement<UploadImageV2Response>(_UploadImageV2Response_QNAME, UploadImageV2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadImageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.soen487.com/t05", name = "uploadImageResponse")
    public JAXBElement<UploadImageResponse> createUploadImageResponse(UploadImageResponse value) {
        return new JAXBElement<UploadImageResponse>(_UploadImageResponse_QNAME, UploadImageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadImage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.soen487.com/t05", name = "downloadImage")
    public JAXBElement<DownloadImage> createDownloadImage(DownloadImage value) {
        return new JAXBElement<DownloadImage>(_DownloadImage_QNAME, DownloadImage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.soen487.com/t05", name = "getPersonArray")
    public JAXBElement<GetPersonArray> createGetPersonArray(GetPersonArray value) {
        return new JAXBElement<GetPersonArray>(_GetPersonArray_QNAME, GetPersonArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadImage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.soen487.com/t05", name = "uploadImage")
    public JAXBElement<UploadImage> createUploadImage(UploadImage value) {
        return new JAXBElement<UploadImage>(_UploadImage_QNAME, UploadImage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.soen487.com/t05", name = "addPersonResponse")
    public JAXBElement<AddPersonResponse> createAddPersonResponse(AddPersonResponse value) {
        return new JAXBElement<AddPersonResponse>(_AddPersonResponse_QNAME, AddPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.soen487.com/t05", name = "addPerson")
    public JAXBElement<AddPerson> createAddPerson(AddPerson value) {
        return new JAXBElement<AddPerson>(_AddPerson_QNAME, AddPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadImageV2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.soen487.com/t05", name = "uploadImageV2")
    public JAXBElement<UploadImageV2> createUploadImageV2(UploadImageV2 value) {
        return new JAXBElement<UploadImageV2>(_UploadImageV2_QNAME, UploadImageV2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.soen487.com/t05", name = "IOException")
    public JAXBElement<IOException> createIOException(IOException value) {
        return new JAXBElement<IOException>(_IOException_QNAME, IOException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "file", scope = UploadImage.class)
    public JAXBElement<byte[]> createUploadImageFile(byte[] value) {
        return new JAXBElement<byte[]>(_UploadImageFile_QNAME, byte[].class, UploadImage.class, ((byte[]) value));
    }

}
