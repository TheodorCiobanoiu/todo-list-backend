package com.example.todolist.service;


import com.example.todolist.model.ToDo;
import com.example.todolist.repository.ToDoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ToDoService {

    private final ToDoRepository toDoRepository;

    public ToDo saveToDo(ToDo todo){
        return toDoRepository.save(todo);
    }

    public List<ToDo> getToDo(){
        return toDoRepository.findAll();
    }

    public void deleteToDoById(Integer id){
        toDoRepository.deleteById(id);
    }

}
