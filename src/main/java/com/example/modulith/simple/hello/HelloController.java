package com.example.modulith.simple.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
class HelloController {

    @GetMapping("/hello")
    String hello (){
        // refactor and rebuild
        return "Hello World!" ;
    }
}