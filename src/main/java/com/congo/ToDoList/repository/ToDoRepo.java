package com.congo.ToDoList.repository;


import com.congo.ToDoList.entity.ToDoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface ToDoRepo extends JpaRepository<ToDoEntity,Long>{
}
