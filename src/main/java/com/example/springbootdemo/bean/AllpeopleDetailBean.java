package com.example.springbootdemo.bean;

public class AllpeopleDetailBean {
    private String userID;
    private String username;
    private String sex;
    private String tel;
    private int notice_deliver_priv;
    private String pass_word;
    private String usertype_name;
    private String department_name;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getNotice_deliver_priv() {
        return notice_deliver_priv;
    }

    public void setNotice_deliver_priv(int notice_deliver_priv) {
        this.notice_deliver_priv = notice_deliver_priv;
    }

    public String getPass_word() {
        return pass_word;
    }

    public void setPass_word(String pass_word) {
        this.pass_word = pass_word;
    }

    public String getUsertype_name() {
        return usertype_name;
    }

    public void setUsertype_name(String usertype_name) {
        this.usertype_name = usertype_name;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }
}
