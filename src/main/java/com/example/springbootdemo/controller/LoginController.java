package com.example.springbootdemo.controller;

import com.example.springbootdemo.bean.AdministratorBean;
import com.example.springbootdemo.bean.AllpeopleBean;
import com.example.springbootdemo.service.AllpeopleService;
import jakarta.annotation.Resource;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @Resource
    AllpeopleService allpeopleService;
    @RequestMapping("/loginView")
    public String show(){return "loginView";}
    @RequestMapping(value = "/logIn",method = RequestMethod.POST)
    public String loginMethod(@RequestParam("userId") String id, @RequestParam("password") String pwd){
        AllpeopleBean allpeopleBean=allpeopleService.logIn(id,pwd);
        if(allpeopleBean!=null)
        {
            String Id=allpeopleBean.getUserID();
            AdministratorBean adminBean=allpeopleService.isAdmin(Id);
            if(adminBean!=null){
                return "redirect:admin/"+Id;
            }
            else{
                return "redirect:staff/"+Id;
            }
        }
        else return "error";
    }
}
