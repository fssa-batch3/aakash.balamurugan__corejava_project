package day01.practice;

public class Cat {
    // Attributes
    private int age;
    private String color;
    static private String speaks = "meaow"; 

    // Constructor
    public Cat(int hasAge, String color) {
        this.age = hasAge;
        this.color = color;
    }

    // Getters and setters
    public int GetAge() {
        return age;
    }

    public void setAge(int CatAge) {
        this.age = CatAge;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

		public String speak() {
        return this.speaks;
    }

    // Main method to create Cat objects
    public static void main(String[] args) {
        // Create two Dog objects
    	Cat Cat1 = new Cat(4, "purple");
        Cat Cat2 = new Cat(3, "blue");

        // Print the attributes of each Dog
        System.out.println("Cat 1:");
        System.out.println("Age: " + Cat1.GetAge());
        System.out.println("Color: " + Cat1.getColor());
		System.out.print("Speaks: " + Cat1.speak());

        System.out.println("Cat 2:");
        System.out.println("Age: " + Cat2.GetAge());
        System.out.println("Color: " + Cat2.getColor());
		System.out.print("Speaks: "+ Cat2.speak());
		
		
    }
}
