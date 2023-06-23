package com.portfolio.tareas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TareasApplication {
    /*
    Desafío: Sistema de Gestión de Tareas

    Objetivo:
    Crear un sistema de gestión de tareas que permita a los usuarios crear, actualizar y eliminar tareas,
    así como también marcarlas como completadas. Deberás implementar una API RESTful que permita realizar
    estas operaciones.

    Requisitos funcionales:

    1- Los usuarios deben poder registrarse en el sistema y luego iniciar sesión para acceder a
    las funcionalidades.

    2-Cada usuario puede crear múltiples tareas, cada una con un título, una descripción y una
    fecha de vencimiento.

    3-Los usuarios pueden ver todas sus tareas, así como también filtrarlas por estado
    (completadas o pendientes) y fecha de vencimiento.

    4-Los usuarios pueden marcar una tarea como completada o pendiente.

    5-Los usuarios pueden actualizar el título, la descripción y la fecha de vencimiento de
    una tarea existente.

    6-Los usuarios pueden eliminar una tarea.

    Requisitos técnicos:

    1-Utiliza Java para implementar el sistema.
    2-Aplica una arquitectura multicapa (por ejemplo, controladores, servicios, repositorios).
    3-Utiliza JPA (Java Persistence API) para interactuar con la base de datos.
    4-Implementa pruebas automatizadas para verificar el funcionamiento de las diferentes funcionalidades.
    5-Utiliza el patrón DTO (Data Transfer Object) para la transferencia de datos entre las capas de la aplicación y la API RESTful.

    Puedes utilizar cualquier framework o biblioteca adicional que consideres necesario para completar el desafío, como Spring Boot para la creación de la API RESTful.

    Recuerda documentar tu proyecto y proporcionar instrucciones claras sobre cómo ejecutarlo localmente.

    ¡Buena suerte con tu proyecto! Espero que este desafío te permita demostrar tus habilidades en las áreas que mencionaste.

    */

    public static void main(String[] args) {
        SpringApplication.run(TareasApplication.class, args);
    }

}
