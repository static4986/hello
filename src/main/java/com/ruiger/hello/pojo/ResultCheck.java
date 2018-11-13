package com.ruiger.hello.pojo;

public class ResultCheck {
    private boolean pass;

    private Integer count;

    private String riskanswer;

    public ResultCheck() {
    }

    public boolean isPass() {
        return pass;
    }

    public void setPass(boolean pass) {
        this.pass = pass;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getRiskanswer() {
        return riskanswer;
    }

    public void setRiskanswer(String riskanswer) {
        this.riskanswer = riskanswer;
    }

    @Override
    public String toString() {
        return "ResultCheck{" +
                "pass=" + pass +
                ", count=" + count +
                ", riskanswer='" + riskanswer + '\'' +
                '}';
    }
}
