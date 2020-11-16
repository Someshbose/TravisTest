package main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AddTwoNumbersTest {
	
	@Test
	public void testAdd() {
		assertEquals(AddTwoNumbers.add(2, 3), 5);
	}
}
