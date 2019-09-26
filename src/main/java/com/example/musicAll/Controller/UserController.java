package com.example.musicAll.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    /**
     * Creates /helloworld as an endpoint
     * @return Hello World!!!
     */
    @GetMapping("/hello")
    public String hello(){
        return "Hello world!";
    }
}
