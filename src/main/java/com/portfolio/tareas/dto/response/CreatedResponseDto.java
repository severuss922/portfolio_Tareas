package com.portfolio.tareas.dto.response;

import com.portfolio.tareas.dto.request.TareasRequestDto;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CreatedResponseDto {
    private String message;
    private TareasRequestDto tareas;
}
