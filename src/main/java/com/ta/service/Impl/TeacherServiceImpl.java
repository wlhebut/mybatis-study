package com.ta.service.Impl;

import com.ta.mapper.TeacherMapper;
import com.ta.pojo.Teacher;
import com.ta.service.TeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description:
 * @author: wltay
 * @date: 2021/2/18 22:52
 */

@Service
public class TeacherServiceImpl implements TeacherService {

    @Resource
    private TeacherMapper teacherMapper;

    @Override
    public Teacher selectByPrimaryKey(Integer id) {
        Teacher teacher = teacherMapper.selectByPrimaryKey(id);
        return teacher;
    }
}
