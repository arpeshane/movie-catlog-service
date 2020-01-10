package com.movie.demo.test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.todo.sample.ToDoService;

public class TodoServiceStub implements ToDoService{

	@Override
	public List<String> retriveTodos(String user) {
		return Stream.of("Learn Java","Learn Spring MVC","Learn Spring Boot").collect(Collectors.toList());		
		
	}
	

}
