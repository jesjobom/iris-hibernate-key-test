package com.jesjobom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

    protected final void run(String[] arguments) throws Exception {
        SpringApplication.run(App.class, arguments);
    }

    public static void main(String[] args) throws Exception {
        new App().run(args);
    }
}
