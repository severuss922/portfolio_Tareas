package com.portfolio.tareas.service.jwt;

import com.portfolio.tareas.dto.LoginRequestDto;
import com.portfolio.tareas.dto.SignUpRequestDto;
import org.springframework.http.ResponseEntity;

public interface AuthService {
    ResponseEntity<?> signIn(LoginRequestDto loginRequestDto);

    ResponseEntity<?> register(SignUpRequestDto signUpRequestDto);
}
