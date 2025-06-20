package com.example.modulith.simple.hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
class HelloController {

    @Value("${hello.text}")
    private String helloText;

    @GetMapping("/hello")
    String hello (){
        // refactor and rebuild
        return helloText ;
    }
}