package com.mrybakin.tarea34.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrybakin.tarea34.dto.Empleados;
import com.mrybakin.tarea34.dto.Trabajos;

public interface EmpleadosRepository extends JpaRepository<Empleados, Long> {
    List<Empleados> findByTrabajo(Trabajos trabajo);
}
