package com.hui.dapeng;

import com.github.dapeng.core.SoaException;
import com.hui.dapeng.hello.domain.Hello;
import com.hui.dapeng.hello.service.HelloService;

/**
 * @author hui
 * 2021/8/3 0003 13:52
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) throws SoaException {
        return "hello " + name;
    }

    @Override
    public String sayHello2(Hello hello) throws SoaException {
        return "hello " + hello.name + " " + hello.message;
    }
}
