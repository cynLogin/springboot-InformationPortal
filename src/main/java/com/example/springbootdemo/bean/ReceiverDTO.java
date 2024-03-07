package com.example.springbootdemo.bean;

import java.util.List;
import java.util.Map;

public class ReceiverDTO {
    private List<Map<String, String>> receivers;
    private String senderID;

    // 提供一个默认构造函数
    public ReceiverDTO() {
    }

    // 提供带参构造函数
    public ReceiverDTO(List<Map<String, String>> receivers, String senderID) {
        this.receivers = receivers;
        this.senderID = senderID;
    }

    // 省略 getters 和 setters

    public List<Map<String, String>> getReceivers() {
        return receivers;
    }

    public void setReceivers(List<Map<String, String>> receivers) {
        this.receivers = receivers;
    }

    public String getSenderID() {
        return senderID;
    }

    public void setSenderID(String senderID) {
        this.senderID = senderID;
    }
}
