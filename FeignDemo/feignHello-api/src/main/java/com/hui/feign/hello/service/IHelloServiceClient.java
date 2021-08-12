package com.hui.feign.hello.service;

import com.hui.feign.hello.request.HelloRequest;
import com.hui.feign.hello.response.HelloResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author hui
 * 2021/8/6 0006 17:37
 */
public interface IHelloServiceClient {
    @RequestMapping("/hello")
    String sayHello(@RequestParam(name = "name" , defaultValue = "tony") String name,
                    @RequestParam(name = "age", defaultValue = "18") int age);

    @RequestMapping("/hello1")
    String sayHello();

    @RequestMapping("/hello2")
    HelloResponse sayHello(@RequestBody HelloRequest request);
}
