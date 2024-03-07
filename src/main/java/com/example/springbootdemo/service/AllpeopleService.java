package com.example.springbootdemo.service;

import com.example.springbootdemo.bean.AdministratorBean;
import com.example.springbootdemo.bean.AllpeopleBean;
import com.example.springbootdemo.bean.AllpeopleDetailBean;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface AllpeopleService {
    AllpeopleBean logIn(String id,String pwd);
    AdministratorBean isAdmin(String userId);
    List<AllpeopleBean> findAll();
    AllpeopleBean findOne(String id);
    AllpeopleDetailBean findDetailOne(String id);
    boolean changeUserDetailOne(String userId, String username, String sex, String tel, int notice_deliver_priv,
                                                            String pass_word, String usertype_no, String department_no);
    boolean deleteUserById(String userId);
    boolean insertUser(String userId,String userName,String sex,String tel,int noticeDeliverPriv,
                       String passWord,String userTypeNo,String departmentNo);
    List<AllpeopleBean> findAllIdNameDepartment(String userId,String userName);
}
