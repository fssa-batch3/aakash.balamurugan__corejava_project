package day06.practice;
import java.util.*;
 class Task1 {
	 
	 private String taskName;
	 private int priority;
	 
    public String getTaskName() {
		return taskName;
	}

	public int getPriority() {
		return priority;
	}


	
    
    Task1(String taskName,int priority){
    	this.taskName = taskName;
    	this.priority = priority;
    	
    }
 }

public class TaskArray {
	public static void main(String[] args) {
		List<Task1> ListArr= new ArrayList<>();
		
		Task1 obj1 = new Task1("first", 2);
		Task1 obj2 = new Task1("Second", 3);
		Task1 obj3 = new Task1("middle", 1);
		Task1 obj4 = new Task1("last", 4);
		
		ListArr.add(obj1);
		ListArr.add(obj2);
		ListArr.add(obj3);
		ListArr.add(obj4);
		
		System.out.print(ListArr);
	}
     
}

	
	



