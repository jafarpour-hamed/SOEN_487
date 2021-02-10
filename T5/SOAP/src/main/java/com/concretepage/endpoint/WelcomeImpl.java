package com.concretepage.endpoint;
import javax.jws.WebService;
import java.io.*;
@WebService(endpointInterface = "com.concretepage.endpoint.Welcome")
public class WelcomeImpl implements Welcome {
    @Override
    public String getWelcomeMsg(String name){
        return "Welcome "+name;

    }

}




