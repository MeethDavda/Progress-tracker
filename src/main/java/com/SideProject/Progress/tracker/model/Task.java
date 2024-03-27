package com.SideProject.Progress.tracker.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "progressTracker")
public class Task {
    @Override
    public String toString() {
        return "Task{" +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", date=" + date +
                ", comments='" + comments + '\'' +
                ", topic='" + topic + '\'' +
                '}';
    }

    public Task() {
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }


    private String name;
    private String status;
    private Date date;
    private String comments;
    private String topic;
}
