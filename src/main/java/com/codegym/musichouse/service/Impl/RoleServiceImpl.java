package com.codegym.musichouse.service.Impl;

import com.codegym.musichouse.model.Role;
import com.codegym.musichouse.model.RoleName;
import com.codegym.musichouse.repository.RoleRepository;
import com.codegym.musichouse.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Optional<Role> findByName(RoleName roleName) {
        return roleRepository.findByName(roleName);
    }
}
