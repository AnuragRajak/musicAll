package com.example.musicAll.Service;

import com.example.musicAll.Config.JwtUtil;
import com.example.musicAll.Model.User;
import com.example.musicAll.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl {
    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleService RoleService;

    @Autowired
    JwtUtil jwtUtil;


    //loadUserByUsername needs method created in userserviceimpl?
//    public String login(User newUser) {
//        if (userRepository.login(newUser.getUsername(), newUser.getPassword()) != null) {
//            UserDetails userDetails = loadUserByUsername(newUser.getUsername());
//            return jwtUtil.generateToken(userDetails);
//        }
//        return null;
//    }

    //getGrantedAuthorities(user) won't work if roleId cannot be obtained to grant authority below this method
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = getUser(username);
//
//        if(user==null)
//            throw new UsernameNotFoundException("User null");
//        // Code edited to not include bCrypt
//        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
//                true, true, true, true, getGrantedAuthorities(user));
//    }

    //need to get roleId for each user to grant authority
//    private List<GrantedAuthority> getGrantedAuthorities(User user){
//        List<GrantedAuthority> authorities = new ArrayList<>();
//
//        authorities.add(new SimpleGrantedAuthority(user.getUserRole().getName()));
//
//        return authorities;
//    }

    @Override
    public User getUser(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public Iterable<User> listUsers() {
        return userRepository.findAll();
    }

    //need to get roleId for each user
//    @Override
//    public String createUser(User newUser) {
//        UserRole userRole = userRoleService.getRole(newUser.getUserRole().getName());
//        newUser.setUserRole(userRole);
//        newUser.setPassword(newUser.getPassword());
//        if(userRepository.save(newUser) != null){
//            UserDetails userDetails = loadUserByUsername(newUser.getUsername());
//            return jwtUtil.generateToken(userDetails);
//        }
//        return null;
//    }

    //same error as lines 27-33 : loadUserByUsername needs method created in userserviceimpl?
//    @Override
//    public String login(User user){
//        User newUser = userRepository.findByUsername(user.getUsername());
////      Code edited to not use default bCrypt for password.
//        if(newUser != null && user.getPassword().equals(newUser.getPassword())){
//            UserDetails userDetails = loadUserByUsername(newUser.getUsername());
//            return jwtUtil.generateToken(userDetails);
//        }
//        return null;
//    }

}
