package com.company;

import java.util.HashSet;
import java.util.Set;

public class TaskExecution {

    public Set<Task> execution(Graph graph) {
        Set<Task> res = new HashSet<>();
        Set<Task> undo = new HashSet<>();
        while (true) {
            for (Task task : graph.getTasks()) {
                Set<Task> tasks = graph.getTasks();
                boolean undoFlag = true;
                if (null != tasks || !tasks.isEmpty()) {
                    for (Task task1 : tasks) {
                        if (!task1.isState()) {
                            //如果依赖的任务有一个未被执行，则此任务不能加入执行集合
                            undoFlag = false;
                            undo.add(task);
                            break;
                        }
                    }
                }
                //依赖的任务都已被执行或无依赖任务，将此任务加入执行集合，更新任务执行状态
                if(undoFlag) {
                    res.add(task);
                    task.setState(true);
                    undo.remove(task);
                }
            }
            if (undo.isEmpty()) {
                break;
            }
        }
        return res;
    }
}

