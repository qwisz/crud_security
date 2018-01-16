package com.qwisz.service;

import com.qwisz.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
