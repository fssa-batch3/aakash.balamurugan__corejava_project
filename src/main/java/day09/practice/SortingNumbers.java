package day09.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortingNumbers {
	
    static List<Integer> output(List<Integer> input) {
    	Collections.sort(input);
        return input;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int count =0;
        List<Integer> input = new ArrayList<>();

        while (count!=a) {
            input.add(s.nextInt());
            count++;
        }

        s.close();
        System.out.println(output(input));
    }
}
