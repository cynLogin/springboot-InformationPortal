package com.example.springbootdemo.servicelmpl;

import com.example.springbootdemo.bean.NoticeBean;
import com.example.springbootdemo.bean.NoticeDepartmentBean;
import com.example.springbootdemo.bean.NoticeDetailBean;
import com.example.springbootdemo.mapper.NoticeMapper;
import com.example.springbootdemo.service.NoticeService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService {
    @Resource
    private NoticeMapper noticeMapper;
    public List<NoticeDepartmentBean> searchByType(String receiverID,String type){
        return noticeMapper.getByType(receiverID,type);
    }
    public List<NoticeBean> searchAll(){return noticeMapper.getAll();}
    public NoticeDetailBean searchOneDetail(String noticeId){return noticeMapper.getById(noticeId);}
    public boolean insertNotice(String senderID,String title,String content,
                                String notice_type){
        int rowAffected = noticeMapper.insertNotice(senderID,title,content,notice_type);
        return rowAffected>0;
    }
    public List<NoticeBean> searchBySenderId(String senderId){
        return noticeMapper.getBySenderId(senderId);
    }
    public List<NoticeDepartmentBean> searchBySenderIdDepartment(String senderId){
        return noticeMapper.getBySenderIdDepartment(senderId);
    }
    public boolean changeNoticeById(int notice_no,String title, String content, String notice_type){
        int rowAffected = noticeMapper.updateNoticeById(notice_no,title,content,notice_type);
        return rowAffected>0;
    }
    public boolean deleteNoticeById(int notice_no){
        int rowAffected = noticeMapper.deleteNoticeById(notice_no);
        return rowAffected>0;
    }
    public List<NoticeDepartmentBean> searchByTypeTitleDepartment(String receiverID,String type,
                                                                  String title,String departmentName){
        return noticeMapper.getByTypeTitleDepartment(receiverID,type,title,departmentName);
    }
}
