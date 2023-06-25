package com.portfolio.tareas.dto.request;


import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class UnaTareaDto {
    @NotBlank(message = "El campo titulo debe esta completo.")
    @Size(max=40 , message = "El campo titulo no puede poseer mas de 40 caracteres.")
    private String titulo;

    @NotBlank( message = "El campo descripción debe esta completo.")
    @Size(max= 250, message = "El campo descripcion no puede poseer mas de 250 caracteres.")
    private String descripcion;

    @NotNull(message = "El campo FechaVencimiento debe estar completo.")
    @FutureOrPresent(message = "El campo fecha de vencimiento no puede poseer fechas del pasado.")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaVencimiento;
}
