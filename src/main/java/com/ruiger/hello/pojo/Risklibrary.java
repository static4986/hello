package com.ruiger.hello.pojo;

public class Risklibrary {

    private Integer id;

    private String risktype;

    private String riskname;

    private String riskcode;

    private String riskvalue;

    private String riskanswer;

    private String groupId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRisktype() {
        return risktype;
    }

    public void setRisktype(String risktype) {
        this.risktype = risktype == null ? null : risktype.trim();
    }

    public String getRiskname() {
        return riskname;
    }

    public void setRiskname(String riskname) {
        this.riskname = riskname == null ? null : riskname.trim();
    }

    public String getRiskcode() {
        return riskcode;
    }

    public void setRiskcode(String riskcode) {
        this.riskcode = riskcode == null ? null : riskcode.trim();
    }

    public String getRiskvalue() {
        return riskvalue;
    }

    public void setRiskvalue(String riskvalue) {
        this.riskvalue = riskvalue == null ? null : riskvalue.trim();
    }

    public String getRiskanswer() {
        return riskanswer;
    }

    public void setRiskanswer(String riskanswer) {
        this.riskanswer = riskanswer == null ? null : riskanswer.trim();
    }

    public  String getType(){
        return risktype;
    }


    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
}