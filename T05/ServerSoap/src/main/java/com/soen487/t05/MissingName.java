package com.soen487.t05;

import javax.xml.ws.WebFault;

@WebFault(name = "MissingName" , targetNamespace="http://www.soen487.com/t05")
public class MissingName extends Exception {
    public MissingName() {
        super("Your name is required.");
    }
}
