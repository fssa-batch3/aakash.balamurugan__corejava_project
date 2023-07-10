package betterme;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import betterMe.EventValidator;
import betterMe.Event;

public class TestEventValaditor {

	@Test
	public void testValidate() {
		Event student = getevent();
		Assertions.assertTrue(EventValidator.validate(student));
	}

	@Test
	public void testInvalidName() {
		Event Event = getevent();
		try {
			Event.eventName = "a";
			EventValidator.validate(Event);
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Name cannot be empty or null", ex.getMessage());

		}
	}

	public Event getevent() {
		Event event = new Event();
		event.eventName = "Apj";
		event.eventId = 20;
		event.eventdate = LocalDate.of(2023, 7, 2);
		event.time = LocalTime.of(10, 0);
		event.venue = "chennai";
		event.info = "In this example, the generateRandomContent method takes the desired length of the random content as an argument. It then generates a random content string by selecting characters randomly from a predefined set of characters. The StringBuilder class is used to efficiently build the content string, and the Random class is used to generate random indices for selecting characters.";
		event.content = "In this example, the generateRandomContent method takes the desired length of the random content as an argument. It then generates a random content string by selecting characters randomly from a predefined set of characters. The StringBuilder class is used to efficiently build the content string, and the Random class is used to generate random indices for selecting characters.In this example, the generateRandomContent method takes the desired length of the random content as an argument. It then generates a random content string by selecting characters randomly from a predefined set of characters. The StringBuilder class is used to efficiently build the content string, and the Random class is used to generate random indices for selecting characters.";
		return event;
	}
}
