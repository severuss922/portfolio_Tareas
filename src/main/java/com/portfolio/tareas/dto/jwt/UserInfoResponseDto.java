package com.portfolio.tareas.dto.jwt;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class UserInfoResponseDto {
    private Long id;
    private String name;

    private String email;

    List<String> roles;


}
