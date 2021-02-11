package com.concretepage;
import javax.xml.ws.Endpoint;
import com.concretepage.service.WelcomeImpl;
public class WelcomeMsgPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/WebServiceDemo/Welcome", new WelcomeImpl());
    }
}




