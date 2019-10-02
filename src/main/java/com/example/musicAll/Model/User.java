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
    @Column(name = "userId")
    private Long userId;
    //create @column or find another way to specify that username and password can not be null/empty
    private String username;
    private String password;
    @ManyToOne()
    @JoinColumn(name = "role_id")
    private Role role;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "playlistId", nullable = true)
    private Playlist playlist;

    public User() {}

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public Role getUserRole() { return role; }

    public void setRole(Role role) { this.role = role; }

}
