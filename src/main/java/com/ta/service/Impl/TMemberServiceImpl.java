package com.ta.service.Impl;

import com.ta.mapper.TMemberMapper;
import com.ta.pojo.TMember;
import com.ta.service.TMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: wltay
 * @date: 2021/2/19 8:51
 */

@Service
public class TMemberServiceImpl implements TMemberService {

    @Autowired
    private TMemberMapper tMemberMapper;
    @Override
    public TMember selectByPrimaryKey(Integer id) {
        return tMemberMapper.selectByPrimaryKey(id);
    }
}
