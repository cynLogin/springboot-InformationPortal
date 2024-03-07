package com.example.springbootdemo.servicelmpl;

import com.example.springbootdemo.bean.UserTypeBean;
import com.example.springbootdemo.mapper.UserTypeMapper;
import com.example.springbootdemo.service.UserTypeService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserTypeServiceImpl implements UserTypeService {
    @Resource
    private UserTypeMapper userTypeMapper;
    public List<UserTypeBean> loadAllUserType(){
        return userTypeMapper.getAll();
    }
}
