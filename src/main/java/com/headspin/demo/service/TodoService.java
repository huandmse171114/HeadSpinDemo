package com.headspin.demo.service;

import java.util.List;

import com.headspin.demo.entity.Todo;

public interface TodoService {

	List<Todo> getTodos();

	Todo saveTodo(Todo todo);

	void deleteTodo(int id);

	Todo updateTodoStatus(int id, int status);

}
