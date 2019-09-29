package com.example.musicAll.Controller;

import com.example.musicAll.Model.Role;
import com.example.musicAll.Service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    RoleService roleService;

    @PostMapping("/create")
    public Role createRole(@RequestBody Role newRole){
        return roleService.createRole(newRole);
    }

}
