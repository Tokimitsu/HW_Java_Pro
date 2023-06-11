package org.firstPart;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    List<Task> tasks = new ArrayList<>();
    List<Task> postponedTasks = new ArrayList<>();

    Task[] expiredTasksArray = new Task[10];

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public void getAllTasks() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void getCompletedTasks() {
        for (Task task : tasks) {
            if (task.isCompleted()) {
                System.out.println(task);
            }
        }
    }

    public void getUncompletedTasks() {
        for (Task task : tasks) {
            if (!task.isCompleted()) {
                System.out.println(task);
            }
        }
    }

    public void postponeTask(Task task) {
        tasks.remove(task);
        postponedTasks.add(task);
    }

    public void getPostponedTasks() {
        for (Task task : postponedTasks) {
            System.out.println(task);
        }
    }

    public void expireTask(Task task) {
        postponedTasks.remove(task);
        for (int i = 0; i < expiredTasksArray.length; i++) {
            if (expiredTasksArray[i] == null) {
                expiredTasksArray[i] = task;
                break;
            }
        }
    }

    public void getExpiredTasks() {
        for (Task task : expiredTasksArray) {
            if (task != null) {
                System.out.println(task);
            }
        }
    }
}
