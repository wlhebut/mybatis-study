package com.ta.service.Impl;

import com.ta.mapper.UserMapper;
import com.ta.pojo.User;
import com.ta.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;



    public List<User> findById(int id) {
        return userMapper.findById(id);
    }
}
