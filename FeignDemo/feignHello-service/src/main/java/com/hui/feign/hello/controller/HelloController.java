package com.hui.feign.hello.controller;

import com.hui.feign.hello.request.HelloRequest;
import com.hui.feign.hello.servcie.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hui
 * 2021/8/9 0009 15:06
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;
    @RequestMapping("/hello")
    public String hello(){
        return helloService.sayHello(new HelloRequest("tony", 20)).toString();
    }
}
