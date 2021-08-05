package com.hui.dapeng;

import com.github.dapeng.core.SoaException;
import com.hui.dapeng.hello.HelloServiceClient;

/**
 * @author hui
 * 2021/8/5 0005 15:35
 */
public class HelloTest {
    public static void main(String[] args) {
        HelloServiceClient client = new HelloServiceClient();
        try {
            client.sayHello("dddd");
        } catch (SoaException e) {
            e.printStackTrace();
        }
    }
}
