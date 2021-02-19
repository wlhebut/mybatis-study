package com.ta.controller;

import com.ta.mapper.TMemberMapper;
import com.ta.mapper.TblResourceMapper;
import com.ta.mapper.TeacherMapper;
import com.ta.pojo.TMember;
import com.ta.pojo.TblResource;
import com.ta.pojo.Teacher;
import com.ta.pojo.User;
import com.ta.service.TMemberService;
import com.ta.service.TeacherService;
import com.ta.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private UserService userService;
    @Autowired
    private TeacherService teacherService;


    @Autowired
    private TeacherMapper teacherMapper;

    @Autowired
    private TMemberMapper tMemberMapper;

    @Autowired
    private TblResourceMapper tblResourceMapper;

    @Autowired
    private TMemberService tMemberService;

    @GetMapping("/hello/{id}")
    public List<User> hello(@PathVariable int id){
        List<User> users = userService.findById(id);
        Teacher teacher = teacherMapper.selectByPrimaryKey(4);

        TMember tMember1 = tMemberService.selectByPrimaryKey(1);
        System.out.println(tMember1);
        TMember tMember = tMemberMapper.selectByPrimaryKey(1);

        TblResource tblResource = tblResourceMapper.selectByPrimaryKey(2);

        System.out.println(tMember);
        System.out.println(tblResource);

        System.out.println(teacher);
        return users;
    }
    @GetMapping("/hello1/{id}")
    public Teacher hello1(@PathVariable int id){

        Teacher teacher = teacherService.selectByPrimaryKey(id);
        System.out.println(teacher);
        return teacher;
    }

}
