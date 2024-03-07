package com.example.springbootdemo.service;

import java.util.List;

public interface NoticeReceiverService {
    boolean insertNoticeReceiverUser(int notice_no, List<String> receiverID);
    boolean insertNoticeReceiverDepartment(int notice_no, List<String> receiverID);
    boolean insertNoticeReceiverType(int notice_no, List<String> receiverID);
}
