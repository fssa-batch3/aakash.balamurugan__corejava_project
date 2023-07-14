package day06.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateArrayValidator {

    public static boolean validateCityList(List<String> cityList) {
        Set<String> uniqueCities = new HashSet<>();

        for (String city : cityList) {
            if (uniqueCities.contains(city)) {
                return false; // Duplicate found, validation fails
            } else {
                uniqueCities.add(city);
            }
        }

        return true; // No duplicates found, validation passes
    }
}

