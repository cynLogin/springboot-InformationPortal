package com.example.springbootdemo.controller;

import com.example.springbootdemo.bean.AllpeopleBean;
import com.example.springbootdemo.bean.AllpeopleDetailBean;
import com.example.springbootdemo.service.AllpeopleService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PeopleController {
    @Resource
    AllpeopleService allpeopleService;

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public List<AllpeopleBean> findMethod(){
        return allpeopleService.findAll();
    }
    @RequestMapping(value = "/findOne",method = RequestMethod.GET)
    public AllpeopleBean findMethod(String userId){
        return allpeopleService.findOne(userId);
    }
    @RequestMapping(value = "/findDetailOne",method = RequestMethod.POST)
    public AllpeopleDetailBean findDetailMethod(String userId){
        return allpeopleService.findDetailOne(userId);
    }
    @RequestMapping(value = "/changeDetailOne",method = RequestMethod.POST)
    public String changeUserDetailMethod(@RequestParam("userID")String userID, @RequestParam("username")String username, @RequestParam("sex")String sex, @RequestParam("tel")String tel, @RequestParam("notice_deliver_priv")int notice_deliver_priv,
                                       @RequestParam("pass_word") String pass_word, @RequestParam("usertype_no")String usertype_no,@RequestParam("department_no") String department_no)
    {
        if(allpeopleService.changeUserDetailOne(userID,username,sex,tel,notice_deliver_priv,pass_word,usertype_no,department_no)){
            return "success";
        }
        else{
            return "error";
        }
    }
    @RequestMapping(value = "/deleteOne",method = RequestMethod.GET)
    public String deleteUserOneMethod(String userId){
        if(allpeopleService.deleteUserById(userId)){
            return "success";
        }
        else{
            return "error";
        }
    }
    @RequestMapping(value = "/insertOne",method = RequestMethod.POST)
    public String insertUserOneMethod(String userID,String username,String sex,String tel,int notice_deliver_priv,
                                      String pass_word,String usertype_no,String department_no)
    {
        if(allpeopleService.insertUser(userID,username,sex,tel,notice_deliver_priv,pass_word,usertype_no,department_no)){
            return "success";
        }
        else{
            return "error";
        }
    }
    @RequestMapping(value = "/findAllIdNameDepartment",method = RequestMethod.GET)
    public List<AllpeopleBean> findIdNameDepartmentMethod(
            String userId,String userName
    ){
        return allpeopleService.findAllIdNameDepartment(userId,userName);
    }
}
