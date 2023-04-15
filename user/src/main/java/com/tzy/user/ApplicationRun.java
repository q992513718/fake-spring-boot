package com.tzy.user;


import com.tzy.springboot.FakeSpringApplication;
import com.tzy.springboot.annotation.FakeSpringBootApplication;

@FakeSpringBootApplication
public class ApplicationRun {
    public static void main(String[] args) {
        FakeSpringApplication.run(ApplicationRun.class);
    }
}
