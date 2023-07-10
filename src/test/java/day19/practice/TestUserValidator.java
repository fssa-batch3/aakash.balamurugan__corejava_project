package day19.practice;
import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;
import day19.practic.User;



public class TestUserValidator {

    @Test
    public void testValidId() {
        User user = new User();
        user.setId(123);
        assertEquals(123, user.getId());
    }

    @Test
    public void testInvalidId() {
        User user = new User();
        assertThrows(IllegalArgumentException.class, () -> user.setId(-1));
    }

    @Test
    public void testValidName() {
        User user = new User();
        user.setName("John Doe");
        assertEquals("John Doe", user.getName());
    }

    @Test
    public void testInvalidName() {
        User user = new User();
        assertThrows(IllegalArgumentException.class, () -> user.setName("John"));
    }

    @Test
    public void testValidPassword() {
        User user = new User();
        user.setPassword("Password#123");
        assertEquals("Password123!", user.getPassword());
    }

    @Test
    public void testInvalidPassword() {
        User user = new User();
        assertThrows(IllegalArgumentException.class, () -> user.setPassword("password"));
    }

    @Test
    public void testValidEmail() {
        User user = new User();
        user.setEmail("test@example.com");
        assertEquals("test@example.com", user.getEmail());
    }

    @Test
    public void testInvalidEmail() {
        User user = new User();
        assertThrows(IllegalArgumentException.class, () -> user.setEmail("invalid_email"));
    }
}
