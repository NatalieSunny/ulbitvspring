package com.example.ulbitvspring.model;

import com.example.ulbitvspring.entity.UserEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//import javax.persistence.Entity;
import java.util.List;
import java.util.stream.Collectors;
@NoArgsConstructor
@Getter
@Setter
public class User {
    private Long id;
    private String username;
    private List<Todo> todos;

    public static User toModel(UserEntity entity){
        User model=new User();
        model.setId(entity.getId());
        model.setUsername(entity.getUsername());
        model.setTodos(entity.getTodos().stream().map(Todo::toModel).collect(Collectors.toList()));
        return model;
    }
}
