package com.hui.feign.hello.response;

import java.util.UUID;

/**
 * @author hui
 * 2021/8/6 0006 17:35
 */

public class HelloResponse {
    public String hello;
    public HelloResponse(String hello){
        this.hello = hello;
    }

    @Override
    public String toString() {
        return hello + UUID.randomUUID().toString();
    }
}
