package com.movie.demo.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.runner.RunWith;
import com.todo.sample.ToDoService;
import com.todo.sample.impl.TodoBusinessImpl;

@RunWith(MockitoJUnitRunner.class)
class TodoServiceTest {
	
//	@Mock
//	ToDoService todoService;
	//ToDoService todoService = mock(ToDoService.class);
	
//	@InjectMocks
//	TodoBusinessImpl toBusiness;
	//TodoBusinessImpl toBusiness = new TodoBusinessImpl(todoService);
	
	
//	@Test
//	void test() {
//		ToDoService todoService = new TodoServiceStub();
//		TodoBusinessImpl toBusiness = new TodoBusinessImpl(todoService);
//		List<String> retriveTodosForSpring = toBusiness.retriveTodosForSpring("Dummy");
//		List<String> expected = Stream.of("Learn Spring MVC","Learn Spring Boot").collect(Collectors.toList());
// 		
//		assertEquals(expected, retriveTodosForSpring);
//	}
	
	@Test
	void testTodoServiceWithMock() {
		ToDoService todoService = mock(ToDoService.class);
		when(todoService.retriveTodos("Dummy")).thenReturn(Stream.of("Learn Spring MVC","Learn Spring Boot").collect(Collectors.toList()));
		
		TodoBusinessImpl toBusiness = new TodoBusinessImpl(todoService);
		List<String> retriveTodosForSpring = toBusiness.retriveTodosForSpring("Dummy");
		List<String> expected = Stream.of("Learn Spring MVC","Learn Spring Boot").collect(Collectors.toList());
		
		assertEquals(expected, retriveTodosForSpring);
	}

}
