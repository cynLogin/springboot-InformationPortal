package com.example.springbootdemo.controller;

import com.example.springbootdemo.bean.UserTypeBean;
import com.example.springbootdemo.service.AllpeopleService;
import com.example.springbootdemo.service.UserTypeService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserTypeController {
    @Resource
    UserTypeService userTypeService;
    @RequestMapping(value = "/loadAllUserType",method = RequestMethod.GET)
    public List<UserTypeBean> loadAllUserType(){
        return userTypeService.loadAllUserType();
    }
}
