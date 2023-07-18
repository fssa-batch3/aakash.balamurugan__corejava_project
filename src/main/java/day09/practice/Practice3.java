package day09.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Task {
    private String name;
    private int deadline;
    private int priority;

    public Task(String name, int deadline, int priority) {
        this.name = name;
        this.deadline = deadline;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getDeadline() {
        return deadline;
    }

    public int getPriority() {
        return priority;
    }
}

public class Practice3 {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();

        // Adding sample tasks
        tasks.add(new Task("Task 1", 3, 2));
        tasks.add(new Task("Task 2", 2, 1));
        tasks.add(new Task("Task 3", 3, 1));
        tasks.add(new Task("Task 4", 1, 3));
        tasks.add(new Task("Task 5", 2, 2));

        // Sort the tasks based on deadline and priority
        Collections.sort(tasks, new Comparator<Task>() {
            @Override
            public int compare(Task t1, Task t2) {
                // Compare based on deadline first
                int deadlineComparison = Integer.compare(t1.getDeadline(), t2.getDeadline());
                if (deadlineComparison != 0) {
                    return deadlineComparison;
                }

                // If deadlines are the same, compare based on priority
                return Integer.compare(t1.getPriority(), t2.getPriority());
            }
        });

        // Print the sorted tasks
        for (Task task : tasks) {
            System.out.println(task.getName());
        }
    }
}

