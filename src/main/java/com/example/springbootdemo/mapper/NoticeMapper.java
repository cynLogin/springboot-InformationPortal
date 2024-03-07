package com.example.springbootdemo.mapper;

import com.example.springbootdemo.bean.NoticeBean;
import com.example.springbootdemo.bean.NoticeDepartmentBean;
import com.example.springbootdemo.bean.NoticeDetailBean;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface NoticeMapper {
    List<NoticeDepartmentBean> getByType(String receiverID,String noticeType);
    List<NoticeBean> getAll();
    NoticeDetailBean getById(String noticeId);
    int insertNotice(String senderID,String title,String content,
                     String notice_type);
    List<NoticeBean> getBySenderId(String senderID);
    List<NoticeDepartmentBean> getBySenderIdDepartment(String senderID);
    int updateNoticeById(int notice_no,String title, String content, String notice_type);
    int deleteNoticeById(int notice_no);
    List<NoticeDepartmentBean> getByTypeTitleDepartment(String receiverID,String noticeType
    ,String title,String departmentName);
}
