package com.example.ulbitvspring.repository;

import com.example.ulbitvspring.entity.ToDoEntity;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepo extends CrudRepository<ToDoEntity,Long> {

}
