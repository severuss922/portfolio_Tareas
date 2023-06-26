package com.portfolio.tareas.service;

import com.portfolio.tareas.dto.request.TareasRequestDto;
import com.portfolio.tareas.dto.response.CreatedResponseDto;
import com.portfolio.tareas.entities.Tareas;
import com.portfolio.tareas.repository.TareasRepository;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class TareasServiceImpl implements TareasService{

    TareasRepository tareasRepository;

    public TareasServiceImpl(TareasRepository tareasRepository){
        this.tareasRepository = tareasRepository;
    }

    @Override
    public CreatedResponseDto createTarea(TareasRequestDto tareas, UserDetails userDetails) {
        ModelMapper mapper = new ModelMapper();
        tareas.getTareas().stream()
                .map(unaTareaDto-> mapper.map(unaTareaDto,Tareas.class))
                .forEach(tarea -> {
                    tarea.setUsername(userDetails.getUsername());
                    tareasRepository.save(tarea);
                });
        CreatedResponseDto response = new CreatedResponseDto("La siguiente lista de tareas ha sido creada.",tareas);
        return response;
    }
}
