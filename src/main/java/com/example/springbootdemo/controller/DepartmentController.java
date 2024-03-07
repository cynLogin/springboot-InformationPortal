package com.example.springbootdemo.controller;

import com.example.springbootdemo.bean.DepartmentBean;
import com.example.springbootdemo.service.AllpeopleService;
import com.example.springbootdemo.service.DepartmentService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {
    @Resource
    DepartmentService departmentService;
    @RequestMapping(value = "/loadAllDepartment", method = RequestMethod.GET)
    public List<DepartmentBean> loadAllDepartment(){
        return departmentService.loadAllDepartment();
    }
}
