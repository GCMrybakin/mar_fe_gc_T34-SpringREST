package com.mrybakin.tarea34.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mrybakin.tarea34.Exceptions.EmpleadosNotFoundException;
import com.mrybakin.tarea34.dao.EmpleadosRepository;
import com.mrybakin.tarea34.dto.Empleados;
import com.mrybakin.tarea34.dto.Trabajos;
import com.mrybakin.tarea34.service.EmpleadosServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/empleados")
public class EmpleadosController {

    @Autowired
    private EmpleadosServiceImpl EmpleadosService;

    private double asignarSalarioPorTrabajo(String trabajo) {
    	switch (trabajo) {
    	case "DESARROLLADOR":
    		return 50000.0;
    	case "DISEÑADOR":
    		return 45000.0;
    	case "GERENTE":
    		return 60000.0;
    	case "ANALISTA":
    		return 48000.0;
    	default:
    		return 0.0;
    	}
    }
    
    @PostMapping("/add")
    public Empleados crearEmpleado(@RequestBody Empleados empleado) {
        empleado.setSalario(asignarSalarioPorTrabajo(empleado.getTrabajo()));
        
        return EmpleadosService.guardarTrabajador(empleado);
    }

    @GetMapping
    public List<Empleados> obtenerEmpleados() {
        return EmpleadosService.listarTrabajadores();
    }

    @GetMapping("/{id}")
    public Empleados obtenerEmpleadoPorId(@PathVariable Long id) {
        return EmpleadosService.mostrarTrabajadorID(id);
    }

    @PutMapping("/{id}")
    public Empleados actualizarEmpleado(@PathVariable Long id, @RequestBody Empleados empleadoActualizado) {
        Empleados empleado = EmpleadosService.mostrarTrabajadorID(id);

        empleado.setNombre(empleadoActualizado.getNombre());
        empleado.setTrabajo(empleadoActualizado.getTrabajo());

        return EmpleadosService.guardarTrabajador(empleado);
    }

    @DeleteMapping("/{id}")
    public void eliminarEmpleado(@PathVariable Long id) {
        EmpleadosService.eliminarTrabajador(id);
    }

    @GetMapping("/buscarPorTrabajo")
    public List<Empleados> buscarPorTrabajo(@RequestParam Trabajos trabajo) {
        return EmpleadosService.listarTrabajadoresPorTrabajo(trabajo);
    }
    
}
