package com.company;

import java.util.LinkedList;

public class MyQueue {
    //数组队列
    private Object[] queue;
    //容量
    private int capacity;
    //队列中元素个数
    private int nums;
    //队头对应下标
    private int head;
    //队尾对应下标
    private int tail;

    //构造函数
    public MyQueue(int capacity){
        this.capacity=capacity;
        queue=new Object[capacity];
    }
    public void add(Object o){
        if(nums==capacity){
            //扩容
            capacity=2*capacity;
            Object[] temp=new Object[capacity];
            for(int i=0;i<nums;i++){
                temp[i]=queue[i];
            }
            queue=temp;
        }
        queue[tail]=o;
        tail=tail+1;
        nums++;
    }
    public Object pop(){
        if(0==nums){
            return null;
        }
        Object o=queue[head];
        queue[head]=null;
        head+=1;
        nums--;
        return o;
    }
    public Object peek(){
        if(0==nums){
            return null;
        }
        return queue[head];
    }
    public boolean empty(){
        return nums>0;
    }

}
