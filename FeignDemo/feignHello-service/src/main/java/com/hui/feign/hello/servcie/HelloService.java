package com.hui.feign.hello.servcie;

import com.hui.feign.hello.request.HelloRequest;
import com.hui.feign.hello.response.HelloResponse;
import org.springframework.stereotype.Service;

/**
 * @author hui
 * 2021/8/9 0009 16:27
 */
@Service
public class HelloService{
    public HelloResponse sayHello(HelloRequest request) {
        return new HelloResponse(request.toString());
    }
}
