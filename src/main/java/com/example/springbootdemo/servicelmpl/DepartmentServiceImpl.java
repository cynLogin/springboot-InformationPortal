package com.example.springbootdemo.servicelmpl;

import com.example.springbootdemo.bean.DepartmentBean;
import com.example.springbootdemo.mapper.DepartmentMapper;
import com.example.springbootdemo.service.DepartmentService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Resource
    private DepartmentMapper departmentMapper;
    public List<DepartmentBean> loadAllDepartment(){
        return departmentMapper.getAll();
    }
}
