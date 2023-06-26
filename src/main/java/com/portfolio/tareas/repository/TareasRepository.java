package com.portfolio.tareas.repository;

import com.portfolio.tareas.entities.Tareas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareasRepository extends JpaRepository<Tareas,Long> {

}
