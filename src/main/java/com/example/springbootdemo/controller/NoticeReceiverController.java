package com.example.springbootdemo.controller;

import com.example.springbootdemo.bean.NoticeBean;
import com.example.springbootdemo.bean.ReceiverDTO;
import com.example.springbootdemo.mapper.NoticeMapper;
import com.example.springbootdemo.service.NoticeReceiverService;
import com.example.springbootdemo.service.NoticeService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class NoticeReceiverController {
    @Resource
    NoticeReceiverService noticeReceiverService;
    @Resource
    NoticeMapper noticeMapper;
    @PostMapping("/insertNoticeReceiverUser")
    public String insertNoticeReceiverUserMethod(@RequestBody ReceiverDTO receiverDTO)
    {
        String senderID = receiverDTO.getSenderID();
        List<Map<String, String>> receivers = receiverDTO.getReceivers();
        List<String> receiverID =new ArrayList<>();
        for (Map<String, String> itm : receiverDTO.getReceivers()) {
            receiverID.add(itm.get("value"));
        }
        List<NoticeBean> noticeBean=noticeMapper.getBySenderId(receiverDTO.getSenderID());
        if(noticeReceiverService.insertNoticeReceiverUser(noticeBean.get(noticeBean.size()-1).getNotice_no(),receiverID)){
            return "success";
        }
        else{
            return "error";
        }
    }
    @PostMapping("/insertNoticeReceiverDepartment")
    public String insertNoticeReceiverDepartmentMethod(@RequestBody ReceiverDTO receiverDTO)
    {
        String senderID = receiverDTO.getSenderID();
        List<Map<String, String>> receivers = receiverDTO.getReceivers();
        List<String> receiverID =new ArrayList<>();
        for (Map<String, String> itm : receiverDTO.getReceivers()) {
            receiverID.add(itm.get("value"));
        }
        List<NoticeBean> noticeBean=noticeMapper.getBySenderId(receiverDTO.getSenderID());
        if(noticeReceiverService.insertNoticeReceiverDepartment(noticeBean.get(noticeBean.size()-1).getNotice_no(),receiverID)){
            return "success";
        }
        else{
            return "error";
        }
    }
    @PostMapping("/insertNoticeReceiverType")
    public String insertNoticeReceiverTypeMethod(@RequestBody ReceiverDTO receiverDTO)
    {
        String senderID = receiverDTO.getSenderID();
        List<Map<String, String>> receivers = receiverDTO.getReceivers();
        List<String> receiverID =new ArrayList<>();
        for (Map<String, String> itm : receiverDTO.getReceivers()) {
            receiverID.add(itm.get("value"));
        }
        List<NoticeBean> noticeBean=noticeMapper.getBySenderId(receiverDTO.getSenderID());
        if(noticeReceiverService.insertNoticeReceiverType(noticeBean.get(noticeBean.size()-1).getNotice_no(),receiverID)){
            return "success";
        }
        else{
            return "error";
        }
    }
}
