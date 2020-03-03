package com.company;

public class Task {

    //任务编号
    private String num;
    //任务执行状态
    private boolean state;

    public Task(String num, boolean state) {
        this.num = num;
        this.state = state;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
