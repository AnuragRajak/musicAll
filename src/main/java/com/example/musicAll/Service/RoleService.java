package com.example.musicAll.Service;

import com.example.musicAll.Model.Role;

public interface RoleService {
    public Role createRole(Role newRole);

    public Role getRole(String roleType);
}
