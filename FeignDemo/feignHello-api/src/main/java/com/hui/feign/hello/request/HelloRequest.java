package com.hui.feign.hello.request;

/**
 * @author hui
 * 2021/8/6 0006 17:33
 */
public class HelloRequest {
    public String name;
    public int age;

    public HelloRequest() {
    }

    public HelloRequest(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}
