package com.example.ulbitvspring.service;

import com.example.ulbitvspring.entity.ToDoEntity;
import com.example.ulbitvspring.entity.UserEntity;
import com.example.ulbitvspring.model.Todo;
import com.example.ulbitvspring.repository.TodoRepo;
import com.example.ulbitvspring.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    @Autowired
    private TodoRepo todoRepo;
    @Autowired
    private UserRepo userRepo;

    public Todo createTodo(ToDoEntity todo, Long userId){
        UserEntity user=userRepo.findById(userId).get();
        todo.setUser(user);
        return Todo.toModel(todoRepo.save(todo));
    }

    public Todo completeTodo(Long id){
        ToDoEntity todo=todoRepo.findById(id).get();
        todo.setCompleted(!todo.getCompleted());
        return Todo.toModel(todoRepo.save(todo));
    }
}
