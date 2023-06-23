package com.portfolio.tareas.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SignUpRequestDto {
    private String username;
    private String password;
    private String email;
    Set<String> role;

}
