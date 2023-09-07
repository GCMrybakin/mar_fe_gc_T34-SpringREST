package com.mrybakin.tarea34.Exceptions;


public class EmpleadosNotFoundException extends RuntimeException {
    public EmpleadosNotFoundException(Long id) {
        super("Empleado no encontrado con ID: " + id);
    }
}
