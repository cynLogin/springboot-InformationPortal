package com.example.springbootdemo.service;

import com.example.springbootdemo.bean.NoticeBean;
import com.example.springbootdemo.bean.NoticeDepartmentBean;
import com.example.springbootdemo.bean.NoticeDetailBean;

import java.util.List;

public interface NoticeService {
    List<NoticeDepartmentBean> searchByType(String receiverID,String type);//还有个收件人ID
    List<NoticeBean> searchAll();
    NoticeDetailBean searchOneDetail(String noticeId);
    boolean insertNotice(String senderID,String title,String content,
                         String notice_type);
    List<NoticeBean> searchBySenderId(String senderId);
    List<NoticeDepartmentBean> searchBySenderIdDepartment(String senderId);
    boolean changeNoticeById(int notice_no,String title, String content, String notice_type);
    boolean deleteNoticeById(int notice_no);
    List<NoticeDepartmentBean> searchByTypeTitleDepartment(String receiverID,String type,String title,String departmentName);//还有个收件人ID
}
