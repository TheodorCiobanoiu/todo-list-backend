package com.example.todolist.controller;

import com.example.todolist.model.ToDo;
import com.example.todolist.service.ToDoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("todo")
public class ToDoController {

    private final ToDoService toDoService;

    @PostMapping("save")
    public ToDo saveToDo(@RequestBody ToDo todo){
        return toDoService.saveToDo(todo);
    }

    @GetMapping("get")
    public List<ToDo> getToDo(){
        return toDoService.getToDo();
    }

    @DeleteMapping("delete/{id}")
    public void deleteToDo(@PathVariable Integer id){
        toDoService.deleteToDoById(id);
    }
}
