package com.chen.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author chenjing
 * @create 2020-08-01 13:23
 */

/**
 * @FeignClient(name = "service-provider")注解绑定service-provider服务，还可以使用url参数指定一个URL。
 */

@FeignClient(name = "service-provider")
public interface MyFeignClient {
    //定义代码调用对方服务的"/hello"接口
    @RequestMapping(value = "hello", method = RequestMethod.GET)
    String sayHelloFromClientOne(@RequestParam(value = "name") String name);
}
