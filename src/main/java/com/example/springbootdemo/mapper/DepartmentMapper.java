package com.example.springbootdemo.mapper;

import com.example.springbootdemo.bean.DepartmentBean;
import com.example.springbootdemo.bean.NoticeBean;

import java.util.List;

public interface DepartmentMapper {
    List<DepartmentBean> getAll();
}
