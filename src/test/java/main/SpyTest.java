package main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class SpyTest {

	@Spy
	private ArrayList<String> listSpy ;//= spy(ArrayList.class);

	@Mock
	private List mockedList ;//=mock(ArrayList.class);

	private ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);

	@Test
	public void testSum(){
		listSpy.add("Dummy");
		verify(listSpy).add("Dummy");
		Assertions.assertEquals(listSpy.size(),1);
	}

	@Test
	public void testArgumentCaptor(){
		mockedList.add("Bugs");
		verify(mockedList).add(argumentCaptor.capture());

		Assertions.assertEquals(argumentCaptor.getValue(),"Bugs");
	}
}
