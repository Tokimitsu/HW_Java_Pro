package org.firstPart;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        Task task1 = new Task("Clean up stairs", "Make the cleaning thoroughly", true);
        Task task2 = new Task("Make the dishes", "Use the detergent", true);
        Task task3 = new Task("Brush the cat", "Don't hurt it", true);
        Task task4 = new Task("Conquer the world", "Insanity is just a myth", false);
        Task task5 = new Task("Become a Java Daddy", "Some of the teachers definitely could help you", false);

        taskManager.addTask(task1);
        taskManager.addTask(task2);
        taskManager.addTask(task3);
        taskManager.addTask(task4);
        taskManager.addTask(task5);


        taskManager.getAllTasks();
        System.out.println("=====================================");
        System.out.println();


        taskManager.postponeTask(task4);
        taskManager.postponeTask(task5);
        System.out.println("Postponed tasks");
        taskManager.getPostponedTasks();
        System.out.println("=====================================");
        System.out.println();

        taskManager.getAllTasks();
        System.out.println("=====================================");

        taskManager.expireTask(task4);
        System.out.println("Expired tasks");
        taskManager.getExpiredTasks();
        System.out.println("=====================================");
        System.out.println("=====================================");

        System.out.println("All tasks");
        taskManager.getAllTasks();
        System.out.println("=====================================");
        System.out.println("Postponed tasks");
        taskManager.getPostponedTasks();
        System.out.println("=====================================");
        System.out.println("Expired tasks");
        taskManager.getExpiredTasks();
        System.out.println("=====================================");



    }
}