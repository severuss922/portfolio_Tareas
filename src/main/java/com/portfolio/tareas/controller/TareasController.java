package com.portfolio.tareas.controller;

import com.portfolio.tareas.dto.request.TareasRequestDto;
import com.portfolio.tareas.dto.request.UnaTareaDto;
import com.portfolio.tareas.entities.Tareas;
import com.portfolio.tareas.service.TareasService;
import com.portfolio.tareas.service.TareasServiceImpl;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tareas")
public class TareasController {

    TareasService tareasService;

    public TareasController(TareasServiceImpl tareasService){
        this.tareasService = tareasService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> testTareas(@RequestBody @Valid TareasRequestDto tareasRequestDto, @AuthenticationPrincipal UserDetails userDetails){
        return new ResponseEntity<>(tareasService.createTarea(tareasRequestDto, userDetails), HttpStatus.OK);
    }

}
