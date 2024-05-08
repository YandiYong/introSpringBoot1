package com.congo.ToDoList.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.security.Timestamp;

@Getter
@Setter
@Entity
public class ToDoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @NonNull
    private  String taskName;

    @NonNull
    private  String taskDesc;

    @CreatedDate
    Timestamp dateCreated;

}
