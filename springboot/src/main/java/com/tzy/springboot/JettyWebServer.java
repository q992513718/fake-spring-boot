package com.tzy.springboot;

public class JettyWebServer implements WebServer{
    @Override
    public void start() {
        System.out.println("start jetty...");
    }
}
