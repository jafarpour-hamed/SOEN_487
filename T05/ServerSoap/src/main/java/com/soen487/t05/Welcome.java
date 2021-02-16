package com.soen487.t05;
import javax.activation.DataHandler;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.soap.SOAPException;
import java.io.IOException;
@WebService(targetNamespace="http://www.soen487.com/t05")
public interface Welcome {
    @WebMethod(operationName = "getWelcomeMsg")
    public String getWelcomeMsg(@WebParam(name="name")  String name)  throws MissingName;

    @WebMethod(operationName = "addPerson")
    public void addPerson(@WebParam(name="id") int id, @WebParam(name="name") String name, @WebParam(name="age") int age) throws MissingName;

    @WebMethod(operationName = "getPersonArray")
    public Person[] getPersonArray();

    @WebMethod(operationName = "uploadImage")
    public void uploadImage(@WebParam(name = "file") byte[] file) throws IOException;

    @WebMethod(operationName = "uploadImage2")
    public void uploadImage2(DataHandler file) throws IOException;

    @WebMethod(operationName = "downloadImage")
    public DataHandler downloadImage() throws SOAPException, IOException;

}

