package com.portfolio.tareas.service;

import com.portfolio.tareas.dto.request.TareasRequestDto;
import com.portfolio.tareas.dto.response.CreatedResponseDto;

public interface TareasService {
    CreatedResponseDto createTarea(TareasRequestDto tareas);
}
