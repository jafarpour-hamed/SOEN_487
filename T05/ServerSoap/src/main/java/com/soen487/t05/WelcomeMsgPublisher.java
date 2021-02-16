package com.soen487.t05;

import javax.xml.ws.Endpoint;

public class WelcomeMsgPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8088/WebServiceDemo/Welcome", new WelcomeImpl());
        System.out.println("Server is running");
    }
}
