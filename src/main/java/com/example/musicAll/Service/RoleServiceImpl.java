package com.example.musicAll.Service;



import com.example.musicAll.Model.Role;
import com.example.musicAll.Repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleRepository roleRepository;

    @Override
    public Role createRole(Role newRole) {
        if (newRole.getRoleType() == null || newRole.getRoleType().isEmpty()){
            newRole.setRoleType("ROLE_NONE");
        }
        return roleRepository.save(newRole);
    }


    @Override
    public Role getRole(String roleType) {

        return roleRepository.findByRoleType(roleType);
    }


//    Mapping error, can't write to Json, potential issue with bidirectional
    @Override
    public List<Role> listRoles() {
        return roleRepository.findAll();
    }
}

