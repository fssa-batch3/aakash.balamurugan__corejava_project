package day08.practice;

import java.util.HashMap;
import java.util.Map;

public class Practice1 {

    static void countOccurrences(String[] arr) {
        Map<String, Integer> countMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (countMap.get(arr[i]) == null) {
                countMap.put(arr[i], 1);
            } else {
                int count = countMap.get(arr[i]);
                count++;
                countMap.put(arr[i], count);
            }
        }

        for (String i : countMap.keySet()) {
            System.out.println(i + " " + countMap.get(i));
        }
    }

    public static void main(String[] args) {
        String[] arr = {"Ram", "Ram", "Superman", "spider", "hey", "hello", "hey", "Spider"};
        countOccurrences(arr);
    }

}
