package com.example.musicAll.Service;

import com.example.musicAll.Model.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService extends UserDetailsService {

    public List<User> listUsers();

    public User createUser(User newUser);

    public String login(String username, String password);

    public int getRoleId();

//    public List<User> listUsers() {
//        return userRepository.findAll();
//    }

//    public User createUser(User newUser){
//        return userRepository.save(newUser);
//    }

//    public User login(String username, String password) {
//        return userRepository.login(username, password);
//    }


}
