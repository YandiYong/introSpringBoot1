package com.congo.ToDoList.controllers;


import com.congo.ToDoList.entity.ToDoEntity;
import com.congo.ToDoList.services.ToDoServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ToDoEntity")
public class ToDoController {
    @Autowired
    private ToDoServiceImp toDoService;

    @GetMapping
    public List<ToDoEntity> findAll(){
        return  toDoService.getAllToDoEntity();
    }
    @PostMapping
    public  void save(@RequestBody ToDoEntity toDo){
        toDoService.saveToDo(toDo);
    }
    @GetMapping("{id}")
    public  ToDoEntity findOne(@PathVariable Long id){
        return toDoService.getToDoById(id);
    }

    @PutMapping

    public  void  upDate(@PathVariable Long id, @RequestBody ToDoEntity toDo){
        this.toDoService.toDoUpDate(id,toDo);
    }

    @DeleteMapping
    public  void  delete(@PathVariable Long id){
        this.toDoService.deleteToDo(id);
    }

}
