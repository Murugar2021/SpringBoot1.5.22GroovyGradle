package com.iqmsoft;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iqmsoft.groovy.MyGroovyClass;


@RestController
@RequestMapping("/message")
public class MessageService {

    @RequestMapping("/java")
    public String getJavaMessage(){
        return "Hello Java FROM IQMSOFT";
    }

    @RequestMapping("/groovy")
    public String getGroovyMessage(){
        return new MyGroovyClass().getMessage();
    }
}
