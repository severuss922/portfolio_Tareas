package com.portfolio.tareas.dto.request;

import jakarta.validation.Valid;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class TareasRequestDto {
    private List<@Valid UnaTareaDto> tareas;
}
