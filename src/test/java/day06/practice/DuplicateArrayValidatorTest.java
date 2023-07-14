package day06.practice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class DuplicateArrayValidatorTest {

    @Test
    public void testValidateCityList_WithDuplicates_ShouldReturnFalse() {
        // Arrange
        List<String> cityList = new ArrayList<>();
        cityList.add("Chennai");
        cityList.add("Bangalore");
        cityList.add("Mumbai");
        cityList.add("Mumbai");

        // Act
        boolean isValid = DuplicateArrayValidator.validateCityList(cityList);

        // Assert
        Assert.assertFalse(isValid);
    }

    @Test
    public void testValidateCityList_WithoutDuplicates_ShouldReturnTrue() {
        // Arrange
        List<String> cityList = new ArrayList<>();
        cityList.add("Chennai");
        cityList.add("Bangalore");
        cityList.add("Mumbai");

        // Act
        boolean isValid = DuplicateArrayValidator.validateCityList(cityList);

        // Assert
        Assert.assertTrue(isValid);
    }
}

