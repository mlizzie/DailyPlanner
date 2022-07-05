package com.mlizzie.daily_planner.entity;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "tasks",schema = "", catalog = "")
public class Task {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "message")
    private String message;
    @Column(name = "date")
    private Date date;
    @Column(name = "done")
    private boolean done;

    public Task() {}
    public Task(int id, String message, boolean done) {
        this.id = id;
        this.message = message;
        this.date = new Date();
        this.done = done;
    }
    public Task( String message, boolean done) {
        this.message = message;
        this.date = new Date();
        this.done = done;
    }

    public Boolean getDone(){
        return done;
    }
    public int getId() {
        return id;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
