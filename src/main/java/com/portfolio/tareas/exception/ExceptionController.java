package com.portfolio.tareas.exception;

import com.portfolio.tareas.dto.response.FieldErrorDto;
import com.portfolio.tareas.dto.response.ValidationFailResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> validacion(MethodArgumentNotValidException ex){
        List<FieldErrorDto> errorsDto = ex.getBindingResult().getFieldErrors().stream()
                .map(fieldError ->  new FieldErrorDto(fieldError.getField(),fieldError.getDefaultMessage()))
                .toList();
        HttpStatus status = HttpStatus.BAD_REQUEST;

        ValidationFailResponseDto response = new ValidationFailResponseDto(status,errorsDto);
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

}
