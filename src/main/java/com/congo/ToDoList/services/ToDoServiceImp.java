package com.congo.ToDoList.services;

import com.congo.ToDoList.entity.ToDoEntity;
import com.congo.ToDoList.repository.ToDoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service//Used to specify that this is a service
public class ToDoServiceImp  implements ToDoService {

    @Autowired//Allows us to use methods from DB that will enable us to connect the repo to the project
    private ToDoRepo toDoRepo;
    @Override
    public List<ToDoEntity> getAllToDoEntity(){
       //ToDoRepo communicate with database
        return toDoRepo.findAll();
    }

    @Override
    public void saveToDo(ToDoEntity toDo) {
        this.toDoRepo.save(toDo);
    }

    @Override
    public ToDoEntity getToDoById(Long id) {
        Optional<ToDoEntity> optional = toDoRepo.findById(id);
        ToDoEntity toDo;

        if (optional.isPresent()){
            toDo = optional.get();
        }else {
            throw new RuntimeException("ToDo id "+ id +" is not found");
        }
        return toDo;
    }


    @Override
    public void toDoUpDate(Long id, ToDoEntity toDo) {

       ToDoEntity toDoFromDb = toDoRepo.findById(id).get();
       toDoFromDb.setTaskName(toDo.getTaskName());
       toDoFromDb.setTaskDesc(toDo.getTaskDesc());
       toDoRepo.save(toDoFromDb);
    }

    @Override
    public void deleteToDo(Long id) {
       this.toDoRepo.deleteById(id);
    }


}
