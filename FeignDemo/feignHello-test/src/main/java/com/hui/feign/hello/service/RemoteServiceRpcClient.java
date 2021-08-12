package com.hui.feign.hello.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * @author hui
 * 2021/8/10 0010 16:18
 */
@Component
@FeignClient(name = "feignHelloService")
public interface RemoteServiceRpcClient extends IHelloServiceClient {
}
