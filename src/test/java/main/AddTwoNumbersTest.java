package main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.ReflectionUtils;
import org.mockito.Mockito;
import org.mockito.Spy;

public class AddTwoNumbersTest {

	@Spy
	AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

	@Test
	public void testAdd() {
		assertEquals(AddTwoNumbers.add(2, 3), 5);
	}

	@Test
	public void testSum(){
		addTwoNumbers.sum(2,3);
		Mockito.verify(addTwoNumbers).sum(2,3);
	}
}
