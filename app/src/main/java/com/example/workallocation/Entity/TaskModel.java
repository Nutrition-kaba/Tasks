package com.example.workallocation.Entity;

public class TaskModel {
    private String title,description, department,startdate,enddate,taskdate,taskId,s_desc,assigned_to,file;
    private String status,uid;


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public TaskModel(String title, String description, String department, String startdate, String enddate, String taskdate, String taskId, String s_desc, String assigned_to, String file, String status, String uid) {
        this.title = title;
        this.description = description;
        this.department = department;
        this.startdate = startdate;
        this.enddate = enddate;
        this.taskdate = taskdate;
        this.taskId = taskId;
        this.s_desc = s_desc;
        this.assigned_to = assigned_to;
        this.file = file;
        this.status = status;
        this.uid = uid;
    }

    public TaskModel(String title, String description, String department, String startdate, String enddate, String taskdate, String taskId, String s_desc, String assigned_to, String file, String status) {
        this.title = title;
        this.description = description;
        this.department = department;
        this.startdate = startdate;
        this.enddate = enddate;
        this.taskdate = taskdate;
        this.taskId = taskId;
        this.s_desc = s_desc;
        this.assigned_to = assigned_to;
        this.file = file;
        this.status = status;
    }

    public TaskModel(String title, String description, String department, String startdate, String enddate, String taskdate, String taskId, String s_desc, String assigned_to, String file) {
        this.title = title;
        this.description = description;
        this.department = department;
        this.startdate = startdate;
        this.enddate = enddate;
        this.taskdate = taskdate;
        this.taskId = taskId;
        this.s_desc = s_desc;
        this.assigned_to = assigned_to;
        this.file = file;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getS_desc() {
        return s_desc;
    }

    public void setS_desc(String s_desc) {
        this.s_desc = s_desc;
    }

    public String getAssigned_to() {
        return assigned_to;
    }

    public void setAssigned_to(String assigned_to) {
        this.assigned_to = assigned_to;
    }

    public TaskModel() {
    }



    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskdate() {
        return taskdate;
    }

    public void setTaskdate(String taskdate) {
        this.taskdate = taskdate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }
}
