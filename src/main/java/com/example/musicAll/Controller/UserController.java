package com.example.musicAll.Controller;

import com.example.musicAll.Model.JwtResponse;
import com.example.musicAll.Model.User;
import com.example.musicAll.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/signup")
    public User createUser(@RequestBody User newUser) {
        return userService.createUser(newUser);
    }

//Original Login Endpoint
//    @PostMapping("/login/{username}/{password}")
//    public User login( @PathVariable String username, @PathVariable String password){
//        return userService.login(username, password);
//    }

    //JWT Login Endpoint
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody String username, String password) {
        return ResponseEntity.ok(new JwtResponse(userService.login(username, password)));
    }
}
