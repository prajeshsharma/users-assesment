package com.user.service;

import com.user.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User save(User user);
    Optional<User> get(long userId);
    List<User> fetchUserList();
    User update(User user);
    void delete(long userId);
    void deleteAll();
}
