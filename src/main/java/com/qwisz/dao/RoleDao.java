package com.qwisz.dao;

import com.qwisz.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
}
