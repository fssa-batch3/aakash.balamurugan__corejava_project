package day07.practice;

import java.util.ArrayList;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Create an ArrayList with duplicate entries
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);

        // Create a HashSet to store unique values
        HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);

        // Display the unique values
        for (Integer number : uniqueNumbers) {
            System.out.println(number);
        }
    }
}

