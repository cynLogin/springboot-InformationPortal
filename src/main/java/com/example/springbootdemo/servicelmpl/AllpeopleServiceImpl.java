package com.example.springbootdemo.servicelmpl;

import com.example.springbootdemo.bean.AdministratorBean;
import com.example.springbootdemo.bean.AllpeopleBean;
import com.example.springbootdemo.bean.AllpeopleDetailBean;
import com.example.springbootdemo.mapper.AllpeopleMapper;
import com.example.springbootdemo.service.AllpeopleService;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AllpeopleServiceImpl implements AllpeopleService {
    @Resource
    private AllpeopleMapper allpeopleMapper;
    public AllpeopleBean logIn(String id,String pwd){
        return allpeopleMapper.getByIdPwd(id,pwd);
    }
    public AdministratorBean isAdmin(String userId){
        return allpeopleMapper.getById(userId);
    }
    //找人
    public List<AllpeopleBean> findAll(){
        return allpeopleMapper.getAll();
    }
    public AllpeopleBean findOne(String id){
        return allpeopleMapper.getUserById(id);
    }
    public AllpeopleDetailBean findDetailOne(String id){
        return allpeopleMapper.getUserDetailById(id);
    }
    public boolean changeUserDetailOne(String userId, String username, String sex, String tel, int notice_deliver_priv,
                                                                   String pass_word, String usertype_no, String department_no) {
        int rowAffected = allpeopleMapper.updateUserDetailById(userId,username,sex,tel,notice_deliver_priv,pass_word,usertype_no,department_no);
        return rowAffected>0;
    }
    public boolean deleteUserById(String userId){
        int rowAffected = allpeopleMapper.deleteUserById(userId);
        return rowAffected>0;
    }
    public boolean insertUser(String userId,String userName,String sex,String tel,int noticeDeliverPriv,
                              String passWord,String userTypeNo,String departmentNo){
        int rowAffected = allpeopleMapper.insertUser(userId,userName,sex,tel,noticeDeliverPriv,
                passWord,userTypeNo,departmentNo);
        return rowAffected>0;
    }
    public List<AllpeopleBean> findAllIdNameDepartment(String userId,String userName)
    {
        return allpeopleMapper.getUserByIdNameDepartment(userId,userName);
    }
}
