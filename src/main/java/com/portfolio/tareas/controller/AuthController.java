package com.portfolio.tareas.controller;

import com.portfolio.tareas.dto.LoginRequestDto;
import com.portfolio.tareas.dto.MessageResponseDto;
import com.portfolio.tareas.dto.SignUpRequestDto;
import com.portfolio.tareas.service.jwt.AuthServiceImpl;
import com.portfolio.tareas.utils.JwtUtils;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    AuthServiceImpl authService;

    @Autowired
    JwtUtils jwtUtils;

    @PostMapping("/signIn")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequestDto loginRequest){
        return authService.signIn(loginRequest);
    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignUpRequestDto signUpRequest) {
        return authService.register(signUpRequest);
    }

    @PostMapping("/signout")
    public ResponseEntity<?> logoutUser() {
        ResponseCookie cookie = jwtUtils.getCleanJwtCookie();
        return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE, cookie.toString())
                .body(new MessageResponseDto("You've been signed out!"));
    }
}
