package com.example.musicAll.Controller;

import com.example.musicAll.Model.User;
import com.example.musicAll.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    /**
     * Creates /helloworld as an endpoint
     * @return Hello World!!!
     */
    @GetMapping("/hello")
    public String hello(){
        return "Hello world!";
    }

    @GetMapping("/list")
    public List<User> listUsers(){
        return userService.listUsers();
    }
}
