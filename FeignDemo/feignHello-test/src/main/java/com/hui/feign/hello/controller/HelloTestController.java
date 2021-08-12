package com.hui.feign.hello.controller;

import com.hui.feign.hello.request.HelloRequest;
import com.hui.feign.hello.response.HelloResponse;
import com.hui.feign.hello.service.RemoteServiceClient;
import com.hui.feign.hello.service.RemoteServiceRpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author hui
 * 2021/8/9 0009 17:14
 */
@RestController
public class HelloTestController {

    @Resource
    RemoteServiceClient remoteService;

    @Autowired
    RemoteServiceRpcClient remoteServiceRpcClient;

    @RequestMapping("/remote")
    public String remoteHello(){
        return remoteService.testHello();
    }

    @RequestMapping("/local")
    public String localHello(){
        return "hello" + UUID.randomUUID().toString();
    }

    @RequestMapping("/remoteRpc")
    public String remoteRpcHello(){
        return remoteServiceRpcClient.sayHello("tony",110);
//        return remoteServiceRpcClient.sayHello();
    }
    @RequestMapping("/remoteRpc1")
    public HelloResponse remoteRpcHello1(){
        return remoteServiceRpcClient.sayHello(new HelloRequest("YYY",122));
    }

}
