package com.example.demo.dubbo.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface DemoService {
    @GetMapping("/test")
    String sayHello(String name);
}
