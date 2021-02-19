package com.ta.service;

import com.ta.pojo.Teacher;

/**
 * @description:
 * @author: wltay
 * @date: 2021/2/18 22:52
 */

public interface TeacherService {
    Teacher selectByPrimaryKey(Integer id);
}
