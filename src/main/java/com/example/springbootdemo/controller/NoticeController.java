package com.example.springbootdemo.controller;

import com.example.springbootdemo.bean.NoticeBean;
import com.example.springbootdemo.bean.NoticeDepartmentBean;
import com.example.springbootdemo.bean.NoticeDetailBean;
import com.example.springbootdemo.service.NoticeService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NoticeController {
    @Resource
    NoticeService noticeService;

    @RequestMapping(value = "/search",method = RequestMethod.GET)
    public List<NoticeBean> searchMethod(){
        return noticeService.searchAll();
    }
    @RequestMapping(value = "/searchOne",method = RequestMethod.GET)//还有一个条件就是收件人id
    public List<NoticeDepartmentBean> searchOneMethod(@RequestParam String receiverID,@RequestParam String type){return noticeService.searchByType(receiverID,type);}
    @RequestMapping(value = "/searchDetail",method = RequestMethod.GET)
    public NoticeDetailBean searchDetailMethod(@RequestParam String noticeId){return noticeService.searchOneDetail(noticeId);}
    @RequestMapping(value = "/addNotice",method = RequestMethod.POST)
    public String insertNoticeMethod(String senderID,String title,String content,
                                      String noticeType)
    {
        if(noticeService.insertNotice(senderID,title,content,noticeType)){
            return "success";
        }
        else{
            return "error";
        }
    }
    @RequestMapping(value = "/searchBySenderIdDepartment",method = RequestMethod.GET)
    public List<NoticeDepartmentBean> searchBySenderIdDepartmentMethod(@RequestParam String senderId){return noticeService.searchBySenderIdDepartment(senderId);}
    @RequestMapping(value = "/changeNotice",method = RequestMethod.POST)
    public String changeNoticeMethod(@RequestParam("notice_no")int notice_no,
                                         @RequestParam("title")String title, @RequestParam("content")String content, @RequestParam("noticeType")String notice_type)
    {
        if(noticeService.changeNoticeById(notice_no,title,content,notice_type)){
            return "success";
        }
        else{
            return "error";
        }
    }
    @RequestMapping(value = "/deleteNotice",method = RequestMethod.GET)
    public String deleteNoticeMethod(int notice_no){
        if(noticeService.deleteNoticeById(notice_no)){
            return "success";
        }
        else{
            return "error";
        }
    }
    @RequestMapping(value = "/searchOneTitleDepartment",method = RequestMethod.GET)//还有一个条件就是收件人id
    public List<NoticeDepartmentBean> searchOneTitleDepartmentMethod(@RequestParam String receiverID,@RequestParam String type,
    @RequestParam String title,@RequestParam String departmentName){
        return noticeService.searchByTypeTitleDepartment(receiverID,type,title,departmentName);}
}
