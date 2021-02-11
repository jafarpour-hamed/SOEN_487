package com.concretepage.service;

import javax.jws.WebService;
import javax.xml.soap.SOAPMessage;

@WebService(endpointInterface = "com.concretepage.service.Welcome")
public class WelcomeImpl implements Welcome {
    @Override
    public SoapMessage getSoapMessage(SoapMessage arg0) {
        return null;
    }

    @Override
    public String getWelcomeMsg(String name){
        return "Welcome "+name;

    }

    @Override
    public SOAPMessage getSoapMessage(SOAPMessage soapMessage) {
        return soapMessage;
    }


}




