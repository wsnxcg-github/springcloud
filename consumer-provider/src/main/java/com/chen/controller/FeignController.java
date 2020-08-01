package com.chen.controller;

import com.chen.service.MyFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenjing
 * @create 2020-08-01 13:27
 */
@RestController
public class FeignController {
    @Autowired
    private MyFeignClient feignClient;

    @GetMapping(value = "/hello")
    public String sayHi(@RequestParam(value = "name") String name) {
        String result = feignClient.sayHelloFromClientOne(name);
        return result;
    }

}
