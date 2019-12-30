package com.LaboratoryManagementSystem.entity;

import java.util.Date;

public class Todo {
    private String todoId;

    private String todoDescription;

    private String todoTeacherid;

    private Date todoAnpaitime;

    private String todoAnpairen;

    private Date todoFinaltime;

    private String todoStatus;

    private String todoZerenren;

    private Date todoDatetime;

    public String getTodoId() {
        return todoId;
    }

    public void setTodoId(String todoId) {
        this.todoId = todoId == null ? null : todoId.trim();
    }

    public String getTodoDescription() {
        return todoDescription;
    }

    public void setTodoDescription(String todoDescription) {
        this.todoDescription = todoDescription == null ? null : todoDescription.trim();
    }

    public String getTodoTeacherid() {
        return todoTeacherid;
    }

    public void setTodoTeacherid(String todoTeacherid) {
        this.todoTeacherid = todoTeacherid == null ? null : todoTeacherid.trim();
    }

    public Date getTodoAnpaitime() {
        return todoAnpaitime;
    }

    public void setTodoAnpaitime(Date todoAnpaitime) {
        this.todoAnpaitime = todoAnpaitime;
    }

    public String getTodoAnpairen() {
        return todoAnpairen;
    }

    public void setTodoAnpairen(String todoAnpairen) {
        this.todoAnpairen = todoAnpairen == null ? null : todoAnpairen.trim();
    }

    public Date getTodoFinaltime() {
        return todoFinaltime;
    }

    public void setTodoFinaltime(Date todoFinaltime) {
        this.todoFinaltime = todoFinaltime;
    }

    public String getTodoStatus() {
        return todoStatus;
    }

    public void setTodoStatus(String todoStatus) {
        this.todoStatus = todoStatus == null ? null : todoStatus.trim();
    }

    public String getTodoZerenren() {
        return todoZerenren;
    }

    public void setTodoZerenren(String todoZerenren) {
        this.todoZerenren = todoZerenren == null ? null : todoZerenren.trim();
    }

    public Date getTodoDatetime() {
        return todoDatetime;
    }

    public void setTodoDatetime(Date todoDatetime) {
        this.todoDatetime = todoDatetime;
    }
}