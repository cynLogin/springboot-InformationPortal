package com.example.springbootdemo.service;

import com.example.springbootdemo.bean.UserTypeBean;

import java.util.List;

public interface UserTypeService {
    List<UserTypeBean> loadAllUserType();
}
