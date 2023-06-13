package com.stage.security.services;

import com.stage.models.ERole;
import com.stage.models.Role;
import com.stage.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    RoleRepository roleRepository;

    public void addRole(String role){
        Role r = new Role();
        r.setName(ERole.valueOf(role));
        roleRepository.save(r);
    }
}
