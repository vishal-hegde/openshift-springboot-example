package com.ibm.openshift.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldController {

    @GetMapping("/")
    public String helloWorld() {
        return "{\"name\":\"openshift\"}";
    }
}
