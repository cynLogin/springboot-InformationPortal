package com.example.springbootdemo.bean;

public class AllpeopleBean {
    private String userID;
    private String username;
    private String sex;
    private String tel;
    private int notice_deliver_priv;
    private String pass_word;
    private String usertype_no;
    private String department_no;

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

    public String getUsertype_no() {
        return usertype_no;
    }

    public void setUsertype_no(String usertype_no) {
        this.usertype_no = usertype_no;
    }

    public String getDepartment_no() {
        return department_no;
    }

    public void setDepartment_no(String department_no) {
        this.department_no = department_no;
    }
}
