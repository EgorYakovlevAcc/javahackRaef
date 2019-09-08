package com.javahack.demo.services.user;

import com.javahack.demo.models.User;

public interface UserService {
    void save (User user);
    void delete (User user);
    User findUserById (Integer id);
}
