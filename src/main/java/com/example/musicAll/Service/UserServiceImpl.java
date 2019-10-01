package com.example.musicAll.Service;

import com.example.musicAll.Config.JwtUtil;
import com.example.musicAll.Model.Role;
import com.example.musicAll.Model.User;
import com.example.musicAll.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleService roleService;

    @Autowired
    JwtUtil jwtUtil;

    @Autowired
    @Qualifier("encoder")
    PasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = getUser(username);

        if(user==null)
            throw new UsernameNotFoundException("User null");

        return new org.springframework.security.core.userdetails.User(user.getUsername(), bCryptPasswordEncoder.encode(user.getPassword()),
                true, true, true, true, getGrantedAuthorities(user));
    }

    private List<GrantedAuthority> getGrantedAuthorities(User user){
        List<GrantedAuthority> authorities = new ArrayList<>();

        authorities.add(new SimpleGrantedAuthority(user.getUserRole().getRoleType()));

        return authorities;
    }

    @Override
    public User getUser(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> listUsers() {
        return userRepository.findAll();
    }

    @Override
    public String createUser(User newUser){

        Role userRole = roleService.getRole(newUser.getUserRole().getRoleType());
        newUser.setRole(userRole);
        newUser.setPassword(bCryptPasswordEncoder.encode(newUser.getPassword()));
        if(userRepository.save(newUser) != null){
            UserDetails userDetails = loadUserByUsername(newUser.getUsername());
            return jwtUtil.generateToken(userDetails);
        }
        return null;
    }

    @Override
    public User login(String username, String password){
        return userRepository.login(username, password);
    }


}