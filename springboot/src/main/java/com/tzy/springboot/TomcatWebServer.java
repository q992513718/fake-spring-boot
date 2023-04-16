package com.tzy.springboot;

public class TomcatWebServer implements WebServer{
    @Override
    public void start() {
        System.out.println("start tomcat...");
    }
}
