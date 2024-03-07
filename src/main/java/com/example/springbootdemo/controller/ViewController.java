package com.example.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    @RequestMapping("/page/{noticeId}")
    public String showPage(){
        return "noticeView";
    }
    @RequestMapping("/staff/{userId}")
    public String showDashBoard(){
        return "dashBoard";
    }
    @RequestMapping("/admin/{userId}")
    public String showDashBoardAdmin(){
        return "dashBoardAdmin";
    }
    @RequestMapping("/sendMessage/{senderId}")
    public String showSendMessage(){
        return "sendMessage";
    }
    @RequestMapping("/changeuser/{noticeId}")
    public String showChangeuser(){
        return "changePeopleView";
    }
    @RequestMapping("addPeople")
    public String showAddPeople(){
        return "addPeopleView";
    }
    @RequestMapping("/changemessage/{noticeId}")
    public String showChangemessage(){
        return "changeNoticeView";
    }
    @RequestMapping("/changePersonal/{noticeId}")
    public String showChangepersonal(){
        return "changePersonalView";
    }

}
