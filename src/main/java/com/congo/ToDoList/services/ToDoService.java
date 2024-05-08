package com.congo.ToDoList.services;

import com.congo.ToDoList.entity.ToDoEntity;
import java.util.List;

public interface ToDoService {
    //Declare list with our entity
    List <ToDoEntity> getAllToDoEntity();

    //Save our toDoList
    void saveToDo(ToDoEntity toDo);

    void toDoUpDate(Long id, ToDoEntity toDo);

    ToDoEntity getToDoById(Long id);

    void  deleteToDo(Long id);
}


