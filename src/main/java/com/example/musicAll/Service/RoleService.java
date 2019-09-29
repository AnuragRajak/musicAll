package com.example.musicAll.Service;

import com.example.musicAll.Model.Role;
import com.example.musicAll.Repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;


    public Role createRole(Role newRole) {
        if (newRole.getRoleType() == null || newRole.getRoleType().isEmpty()){
            newRole.setRoleType("none");
        }
       return roleRepository.save(newRole);
    }

//    Mapping error, can't write to Json, potential issue with bidirectional mapping
//Could not write JSON: could not extract ResultSet; nested exception is com.fasterxml.jackson.databind.JsonMappingException: could not extract ResultSet (through reference chain: java.util.ArrayList[0]->com.example.musicAll.Model.Role[\"users\"])",
//    public List<Role> listRoles() {
//        return roleRepository.findAll();
//    }
}
