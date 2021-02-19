package com.ta.service;

import com.ta.pojo.TMember;

/**
 * @description:
 * @author: wltay
 * @date: 2021/2/19 8:50
 */
public interface TMemberService {

    TMember selectByPrimaryKey(Integer id);

}
