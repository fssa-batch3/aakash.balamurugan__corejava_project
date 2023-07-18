package day06.practice;

import java.util.ArrayList;

public class Task {
    public String taskName;
    public int priority;

    // Constructor
    public Task(String taskName, int priority) {
        this.taskName = taskName;
        this.priority = priority;
    }

    // Getters and setters (not necessary for this example)

    public static boolean findTaskByName(String name, ArrayList<Task> tasks) {
        for (Task task : tasks) {
            if (task.taskName.equals(name)) {
                return true; // Found a task with the given name
            }
        }
        return false; // No task found with the given name
    }

}
