package com.ruiger.hello.pojo;

import java.time.LocalDate;
import java.util.Date;

public class Issuepointtransitiondetail {

    private Integer id;

    private String useruuid;

    private String userphone;

    private String issuepointnum;

    private String issuedepartment;

    private LocalDate issuedate;

    private String issuesystem;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUseruuid() {
        return useruuid;
    }

    public void setUseruuid(String useruuid) {
        this.useruuid = useruuid == null ? null : useruuid.trim();
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone == null ? null : userphone.trim();
    }

    public String getIssuepointnum() {
        return issuepointnum;
    }

    public void setIssuepointnum(String issuepointnum) {
        this.issuepointnum = issuepointnum == null ? null : issuepointnum.trim();
    }

    public String getIssuedepartment() {
        return issuedepartment;
    }

    public void setIssuedepartment(String issuedepartment) {
        this.issuedepartment = issuedepartment == null ? null : issuedepartment.trim();
    }

    public LocalDate getIssuedate() {
        return issuedate;
    }

    public void setIssuedate(LocalDate issuedate) {
        this.issuedate = issuedate;
    }

    public String getIssuesystem() {
        return issuesystem;
    }

    public void setIssuesystem(String issuesystem) {
        this.issuesystem = issuesystem == null ? null : issuesystem.trim();
    }

}