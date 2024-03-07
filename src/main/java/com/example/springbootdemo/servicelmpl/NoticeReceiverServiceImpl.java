package com.example.springbootdemo.servicelmpl;

import com.example.springbootdemo.bean.AllpeopleBean;
import com.example.springbootdemo.mapper.AllpeopleMapper;
import com.example.springbootdemo.mapper.NoticeReceiverMapper;
import com.example.springbootdemo.service.NoticeReceiverService;
import jakarta.annotation.Resource;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NoticeReceiverServiceImpl implements NoticeReceiverService {
    @Resource
    NoticeReceiverMapper noticeReceiverMapper;
    @Resource
    AllpeopleMapper allpeopleMapper;
    public boolean insertNoticeReceiverUser(int notice_no, List<String> receiverID){
        //一条一条插入NoticeReceiver
        int rowAffected=0;
        for(String id: receiverID){
            rowAffected=noticeReceiverMapper.insertNoticeReceiver(notice_no,id);
        }
        return rowAffected>0;
    }
    public boolean insertNoticeReceiverDepartment(int notice_no, List<String> receiverID){
        int rowAffected=0;
        for(String id: receiverID){
            List<AllpeopleBean> allpeopleBeans=allpeopleMapper.getUserByDepartment(id);
            for(AllpeopleBean allpeopleBean: allpeopleBeans){
                rowAffected=noticeReceiverMapper.insertNoticeReceiver(notice_no,allpeopleBean.getUserID());
            }
        }
        return rowAffected>0;
    }
    public boolean insertNoticeReceiverType(int notice_no, List<String> receiverID){
        int rowAffected=0;
        for(String id: receiverID){
            List<AllpeopleBean> allpeopleBeans=allpeopleMapper.getUserByType(id);
            for(AllpeopleBean allpeopleBean: allpeopleBeans){
                rowAffected=noticeReceiverMapper.insertNoticeReceiver(notice_no,allpeopleBean.getUserID());
            }
        }
        return rowAffected>0;
    }
}
