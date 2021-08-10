package com.hui.feign.hello.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hui
 * 2021/8/10 0010 15:47
 */
@FeignClient(value = "feignHelloService", path = "/hello")
public interface RemoteServiceClient {
    @RequestMapping("/")
    String testHello();
}
