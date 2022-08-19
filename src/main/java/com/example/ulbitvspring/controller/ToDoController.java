package com.example.ulbitvspring.controller;

import com.example.ulbitvspring.entity.ToDoEntity;
import com.example.ulbitvspring.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todos")
public class ToDoController {
    @Autowired
    private TodoService todoService;

    @PostMapping
    public ResponseEntity createTodo(@RequestBody ToDoEntity todo,@RequestParam Long userId){

        try {
            return ResponseEntity.ok(todoService.createTodo(todo,userId));

        } catch (Exception e){
            return ResponseEntity.badRequest().body("Error");
        }
    }

    @PutMapping
    public ResponseEntity completeTodo(@RequestParam Long id){
        try {
            return ResponseEntity.ok(todoService.completeTodo(id));

        } catch (Exception e){
            return ResponseEntity.badRequest().body("Error");
        }
    }
}
