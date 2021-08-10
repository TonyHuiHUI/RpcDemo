package com.hui.feign.hello.service;

import com.hui.feign.hello.request.HelloRequest;
import com.hui.feign.hello.response.HelloResponse;

/**
 * @author hui
 * 2021/8/6 0006 17:37
 */
public interface IHelloServiceClient {
    HelloResponse sayHello(HelloRequest request);
}
