package com.portfolio.tareas.dto.response;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class FieldErrorDto {
    private String field;
    private String message;
}
