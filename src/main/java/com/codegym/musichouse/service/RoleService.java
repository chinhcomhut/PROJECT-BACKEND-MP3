package com.codegym.musichouse.service;

import com.codegym.musichouse.model.Role;
import com.codegym.musichouse.model.RoleName;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface RoleService {
    Optional<Role> findByName(RoleName roleName);

}
