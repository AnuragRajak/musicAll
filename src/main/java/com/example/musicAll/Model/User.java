package com.example.musicAll.Model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//Says we want to create an API
//@JsonIdentityInfo(
//        //This will create a unique primary key every time we create a new user
//        generator = ObjectIdGenerators.PropertyGenerator.class,
//        property = "id")


@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    //create @column or find another way to specify that username and password can not be null/empty
    private String username;
    private String password;
    @ManyToOne()
    @JoinColumn(name = "role_id")
    private Role role;

    public User() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
