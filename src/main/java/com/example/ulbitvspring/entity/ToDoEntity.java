package com.example.ulbitvspring.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "todo")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ToDoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Boolean completed;
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;
}
