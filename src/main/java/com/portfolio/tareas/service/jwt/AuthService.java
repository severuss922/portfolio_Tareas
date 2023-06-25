package com.portfolio.tareas.service.jwt;

import com.portfolio.tareas.dto.request.LoginRequestDto;
import com.portfolio.tareas.dto.jwt.SignUpRequestDto;
import org.springframework.http.ResponseEntity;

public interface AuthService {
    ResponseEntity<?> signIn(LoginRequestDto loginRequestDto);

    ResponseEntity<?> register(SignUpRequestDto signUpRequestDto);
}
