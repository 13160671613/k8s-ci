package com.morgan.k8sci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class K8sCiApplication {

    public static void main(String[] args) {
        SpringApplication.run(K8sCiApplication.class, args);
    }

    @GetMapping("/k8s")
    public String k8s(){
        return "k8s";
    }

    @GetMapping(value = "/hello1")
    public String hello() {
        return "hello1";
    }
}

