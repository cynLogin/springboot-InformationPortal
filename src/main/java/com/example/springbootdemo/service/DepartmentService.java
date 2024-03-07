package com.example.springbootdemo.service;

import com.example.springbootdemo.bean.DepartmentBean;

import java.util.List;

public interface DepartmentService {
    List<DepartmentBean> loadAllDepartment();
}
