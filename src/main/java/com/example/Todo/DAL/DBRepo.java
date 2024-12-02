package com.example.Todo.DAL;
import com.example.Todo.Model.Todo;



import java.util.List;

public interface DBRepo {
    List<Todo> getTodo();
    Todo createTodo(Todo todo);
    Todo updateTodo(String id, Todo newtodo);
    void deleteById(String id);

}