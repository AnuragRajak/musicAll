package com.example.musicAll.Service;

import com.example.musicAll.Model.Role;
import com.example.musicAll.Repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;


    public Role createRole(Role newRole) {
       return roleRepository.save(newRole);
    }
}
