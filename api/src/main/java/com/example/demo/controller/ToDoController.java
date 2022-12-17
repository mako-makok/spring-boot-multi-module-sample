package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.todo.ToDo;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
class ToDoController {

    @GetMapping
    public List<ToDo> list() {
        return List.of(
            new ToDo("1", "すきやきを食べる"),
            new ToDo("2", "洗剤を買う")
        );
    }
}
