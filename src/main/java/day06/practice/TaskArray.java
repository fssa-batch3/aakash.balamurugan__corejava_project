package day06.practice;
import java.util.*;
 class Task {
	 
	 private String taskName;
	 private int priority;
	 
    public String getTaskName() {
		return taskName;
	}

	public int getPriority() {
		return priority;
	}


	
    
    Task(String taskName,int priority){
    	this.taskName = taskName;
    	this.priority = priority;
    	
    }
 }

public class TaskArray {
	public static void main(String[] args) {
		List<Task> ListArr= new ArrayList<>();
		
		Task obj1 = new Task("first", 2);
		Task obj2 = new Task("Second", 3);
		Task obj3 = new Task("middle", 1);
		Task obj4 = new Task("last", 4);
		
		ListArr.add(obj1);
		ListArr.add(obj2);
		ListArr.add(obj3);
		ListArr.add(obj4);
		
		System.out.print(ListArr);
	}
     
}

	
	



