package com.movie.demo.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;

class ListMock {

	@Test
	@DisplayName("List Test")
	void testListMockGet() {
		List list = mock(List.class);
		when(list.get(0)).thenReturn("Ajit");
		assertEquals("Ajit", list.get(0));
	}
	@DisplayName("List Test getAny")
	@Test
	void testListMockGetAny() {
		List list = mock(List.class);
		when(list.get(anyInt())).thenReturn("Ajit").thenReturn("Raju");
		assertEquals("Ajit", list.get(0));
		assertEquals("Raju", list.get(1));
	}
	
	@Test()
	void testListMockThrowException() {
		List list = mock(List.class);
		when(list.get(anyInt())).thenThrow(new RuntimeException());
		list.get(0);
	}
	

}
