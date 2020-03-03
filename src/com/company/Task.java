package com.company;

public class Task {

    //任务id
    private int id;
    //任务执行状态
    private boolean state;

    public Task(int id, boolean state) {
        this.id = id;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
