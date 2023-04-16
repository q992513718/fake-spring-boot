package com.tzy.springboot;

import org.apache.catalina.*;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.core.StandardEngine;
import org.apache.catalina.core.StandardHost;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class FakeSpringApplication {

    public static void run(Class config) {
        // 创建Spring容器
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.register(config);
        applicationContext.register(WebServerConfiguration.class);
        applicationContext.refresh();
        WebServer webServer = getWebServer(applicationContext);
        webServer.start();
    }

    private static WebServer getWebServer(AnnotationConfigWebApplicationContext applicationContext) {
        return applicationContext.getBean(WebServer.class);
    }
}
