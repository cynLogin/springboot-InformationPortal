package com.example.springbootdemo.mapper;

import com.example.springbootdemo.bean.AdministratorBean;
import com.example.springbootdemo.bean.AllpeopleBean;
import com.example.springbootdemo.bean.AllpeopleDetailBean;

import java.util.List;

public interface AllpeopleMapper {
    AllpeopleBean getByIdPwd(String userID, String pass_word);
    AdministratorBean getById(String userId);
    List<AllpeopleBean> getAll();
    AllpeopleBean getUserById(String userId);
    AllpeopleDetailBean getUserDetailById(String userId);
    int updateUserDetailById(String userId,String username,String sex,String tel,int notice_deliver_priv,
    String pass_word,String usertype_no,String department_no);
    int deleteUserById(String userId);
    int insertUser(String userId,String userName,String sex,String tel,int noticeDeliverPriv,
                   String passWord,String userTypeNo,String departmentNo);
    List<AllpeopleBean> getUserByDepartment(String departmentId);
    List<AllpeopleBean> getUserByType(String typeId);
    List<AllpeopleBean> getUserByIdNameDepartment(String userID,String userName);
}
