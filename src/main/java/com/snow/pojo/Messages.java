package com.snow.pojo;

import java.util.Date;

public class Messages {
    private Integer id;
    private Integer sender;
    private Integer Receiver;
    private String Content_;
    private String time;

    public Messages() {
    }


    @Override
    public String toString() {
        return "Messages{" +
                "id=" + id +
                ", sender=" + sender +
                ", Receiver=" + Receiver +
                ", Content_='" + Content_ + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSender() {
        return sender;
    }

    public void setSender(Integer sender) {
        this.sender = sender;
    }

    public Integer getReceiver() {
        return Receiver;
    }

    public void setReceiver(Integer receiver) {
        Receiver = receiver;
    }

    public String getContent_() {
        return Content_;
    }

    public void setContent_(String content_) {
        Content_ = content_;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
