package com.company;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Graph {
    //任务集合
    private Set<Task> tasks;
    //任务关联集合
    private Map<Task,Set<Task>> taskMap;

    public Graph(Set<Task> tasks,Map<Task,Set<Task>> taskMap){
        this.tasks=tasks;
        this.taskMap=taskMap;
    }
    //增加任务
    public void addTask(Task task){
        tasks.add(task);
    }
    //增加任务依赖
    public void addTaskDependency(Task task,Task pre){
        Set<Task> tempSet=taskMap.get(task);
        if(null==tempSet){
            tempSet=new HashSet<>();
        }
        tempSet.add(pre);
        taskMap.put(task,tempSet);
    }

    public Set<Task> getTasks() {
        return tasks;
    }

    public void setTasks(Set<Task> tasks) {
        this.tasks = tasks;
    }

    public Map<Task, Set<Task>> getTaskMap() {
        return taskMap;
    }

    public void setTaskMap(Map<Task, Set<Task>> taskMap) {
        this.taskMap = taskMap;
    }

}
