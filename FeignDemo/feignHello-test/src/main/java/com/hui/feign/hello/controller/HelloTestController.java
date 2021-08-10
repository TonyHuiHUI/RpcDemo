package com.hui.feign.hello.controller;

import com.hui.feign.hello.service.RemoteServiceClient;
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

    @RequestMapping("/remote")
    public String remoteHello(){
        return remoteService.testHello();
    }

    @RequestMapping("/local")
    public String localHello(){
        return "hello" + UUID.randomUUID().toString();
    }
}
