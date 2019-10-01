package com.example.musicAll.Service;

import com.example.musicAll.Model.User;

import java.util.List;

public interface UserService {
    public List<User> listUsers();
    public User createUser(User newUser);
    public User login(String username, String password);

}