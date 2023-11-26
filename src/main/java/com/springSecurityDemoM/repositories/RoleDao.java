package com.springSecurityDemoM.repositories;

import com.springSecurityDemoM.entities.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleDao extends CrudRepository<Role, Integer> {
    Role findByRole(String role);
}
