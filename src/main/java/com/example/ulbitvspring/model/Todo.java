package com.example.ulbitvspring.model;

import com.example.ulbitvspring.entity.ToDoEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Todo {
    private Long id;
    private String title;
    private Boolean completed;

    public static Todo toModel(ToDoEntity entity){
        Todo model=new Todo();
        model.setId(entity.getId());
        model.setTitle(entity.getTitle());
        model.setCompleted(entity.getCompleted());
        return model;
    }
}
