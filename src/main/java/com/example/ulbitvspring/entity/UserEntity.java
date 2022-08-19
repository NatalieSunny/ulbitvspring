package com.example.ulbitvspring.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
@NoArgsConstructor
@Getter
@Setter
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "user")
    private List<ToDoEntity> todos;
}
