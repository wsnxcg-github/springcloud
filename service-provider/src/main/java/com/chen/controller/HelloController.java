package com.chen.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author chenjing
 * @create 2020-08-01 11:47
 */
@Controller
public class HelloController {
    //提供了默认值
    @Value("${server.port}")
    String port;

    //RequestParam绑定参数
    @RequestMapping("/hello")
    @ResponseBody
    public String Hello(@RequestParam(value = "name") String name){
        String result = "hi " + name + " , i am from port:" + port;
        System.out.println(result);
        return result;
    }
}
