package com.ta.service;

import com.ta.pojo.User;

import java.util.List;

public interface UserService {
    List<User> findById(int id);
}
