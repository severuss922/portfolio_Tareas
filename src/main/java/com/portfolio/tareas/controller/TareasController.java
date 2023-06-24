package com.portfolio.tareas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tareas")
public class TareasController {

    @GetMapping("/get")
    public String testTareas(){
        return "acces granted";
    }

}
