package com.ruiger.hello.pojo;

public class ResultCheck {
    private boolean pass;

    public ResultCheck() {
    }

    public boolean isPass() {
        return pass;
    }

    public void setPass(boolean pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "ResultCheck{" +
                "pass=" + pass +
                '}';
    }
}
