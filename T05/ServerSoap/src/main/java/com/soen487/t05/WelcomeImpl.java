package com.soen487.t05;

import com.sun.istack.internal.ByteArrayDataSource;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.jws.WebService;
import java.io.*;
import java.util.concurrent.CopyOnWriteArrayList;

@WebService(name="Welcome",endpointInterface = "com.soen487.t05.Welcome")
public class WelcomeImpl implements Welcome {
    private byte[] receiveFile =new byte[0];//To avoid Null pointer Exception
    private CopyOnWriteArrayList<Person> personArrayList = new CopyOnWriteArrayList<>();
    private String mime="image/jpeg";

    @Override
    public String getWelcomeMsg(String name) throws MissingName{
        if (name == null || name.isEmpty()) {
            throw new MissingName();
        }
        return "Welcome " + name;
    }
    @Override
    public void addPerson(int id, String name, int age) throws MissingName {
        if (name == null || name.isEmpty()) {
            throw new MissingName();
        }
        personArrayList.add(new Person(id,name,age));
    }
    @Override
    public Person[] getPersonArray() {
        return personArrayList.toArray(new Person[0]);
    }
    @Override
    public void uploadImage(byte[] file, String mime) throws IOException {
        receiveFile=file;
        this.mime=mime;
    }
    @Override
    public void uploadImage2(DataHandler file) throws IOException {
        mime = file.getContentType();
        ByteArrayOutputStream data = new ByteArrayOutputStream();
        InputStream input = file.getInputStream();
        byte[] b = new byte[4096];
        int bytesRead = 0;
        while ((bytesRead = input.read(b)) != -1) {
            data.write(b, 0, bytesRead);
        }

        receiveFile=data.toByteArray();
    }
    @Override
    public DataHandler downloadImage(){
        DataSource dataSource=new ByteArrayDataSource(receiveFile, mime);
        DataHandler data= new DataHandler(dataSource);
        return data;
    }
}


