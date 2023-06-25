package com.portfolio.tareas.controller;

import com.portfolio.tareas.dto.request.TareasRequestDto;
import com.portfolio.tareas.dto.request.UnaTareaDto;
import com.portfolio.tareas.entities.Tareas;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tareas")
public class TareasController {

    @PostMapping("/create")
    public ResponseEntity<?> testTareas(@RequestBody @Valid TareasRequestDto tareasRequestDto){
        tareasRequestDto.getTareas().forEach(System.out::println);
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }

}
