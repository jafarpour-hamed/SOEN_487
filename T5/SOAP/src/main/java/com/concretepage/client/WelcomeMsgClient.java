package com.concretepage.client;
import com.concretepage.endpoint.Welcome;
import com.concretepage.endpoint.WelcomeImplService;
public class WelcomeMsgClient {
    public static void main(String[] args) {
        WelcomeImplService welService = new WelcomeImplService();
        Welcome welcome = welService.getWelcomeImplPort();
        System.out.println(welcome.getWelcomeMsg("Everyone!"));
    }
}




