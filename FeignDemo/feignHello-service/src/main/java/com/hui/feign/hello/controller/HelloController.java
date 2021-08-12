package com.hui.feign.hello.controller;

import com.hui.feign.hello.request.HelloRequest;
import com.hui.feign.hello.response.HelloResponse;
import com.hui.feign.hello.servcie.HelloService;
import com.hui.feign.hello.service.IHelloServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hui
 * 2021/8/9 0009 15:06
 */
@RestController
public class HelloController implements IHelloServiceClient {
    @Autowired
    HelloService helloService;

    @Override
    @RequestMapping("/hello")
    //http://localhost:8000/hello?name=qqqq&age=22
    public String sayHello(@RequestParam(name = "name", defaultValue = "tony") String name,
                           @RequestParam(name = "age", defaultValue = "18") int age) {
        HelloRequest request = new HelloRequest(name, age);
        return helloService.sayHello(request).toString();
    }

    @Override
    @RequestMapping("/hello1")
    public String sayHello() {
        HelloRequest request = new HelloRequest("tony", 19);
        return helloService.sayHello(request).toString();
    }

    @Override
    @RequestMapping("/hello2")
    public HelloResponse sayHello(@RequestBody HelloRequest request) {
        return helloService.sayHello(request);
    }
}
