package com.whoami.demo01;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();

        Proxy proxy = new Proxy(host);
        proxy.seeHost();
        proxy.hetong();
        proxy.fare();
        proxy.rent();
    }
}
