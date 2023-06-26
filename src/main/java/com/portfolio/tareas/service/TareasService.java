package com.portfolio.tareas.service;

import com.portfolio.tareas.dto.request.TareasRequestDto;
import com.portfolio.tareas.dto.response.CreatedResponseDto;
import org.springframework.security.core.userdetails.UserDetails;

public interface TareasService {
    CreatedResponseDto createTarea(TareasRequestDto tareas, UserDetails userDetails);
}
