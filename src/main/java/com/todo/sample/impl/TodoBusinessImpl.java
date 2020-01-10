package com.todo.sample.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.todo.sample.ToDoService;

public class TodoBusinessImpl {
	private ToDoService todoService;

	public TodoBusinessImpl(ToDoService todoService) {
		this.todoService = todoService;
	}

	public List<String> retriveTodosForSpring(String user) {
		List<String> filteredTodos = new ArrayList<String>();
		List<String> todos = todoService.retriveTodos(user);
		filteredTodos = todos.stream().filter((x) -> x.contains("Spring")).collect(Collectors.toList());
		return filteredTodos;
	}
}
