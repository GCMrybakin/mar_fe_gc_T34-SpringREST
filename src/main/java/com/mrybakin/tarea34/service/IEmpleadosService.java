package com.mrybakin.tarea34.service;

import java.util.List;

import com.mrybakin.tarea34.dto.Empleados;
import com.mrybakin.tarea34.dto.Trabajos;

public interface IEmpleadosService {
	
	public List<Empleados> listarTrabajadores();
	
	public Empleados mostrarTrabajadorID(Long id);
	
	public List<Empleados> listarTrabajadoresPorTrabajo(Trabajos trabajo);
	
	public Empleados guardarTrabajador(Empleados Empleado);
	
	public Empleados actualizarTrabajador(Empleados Empleado);
	
	public void eliminarTrabajador(Long id);


}
