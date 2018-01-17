package com.qwisz.dao;

import com.qwisz.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
