package com.example.springbootdemo.bean;

public class NoticeDetailBean {
    private String title;
    private String department_name;
    private String username;
    private String sendTime;
    private String content;
    private String notice_type;

    public String getNoticeType() {
        return notice_type;
    }

    public void setNoticeType(String notice_type) {
        this.notice_type = notice_type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
