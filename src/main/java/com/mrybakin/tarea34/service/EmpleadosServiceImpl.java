package com.mrybakin.tarea34.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrybakin.tarea34.dao.EmpleadosRepository;
import com.mrybakin.tarea34.dto.Empleados;
import com.mrybakin.tarea34.dto.Trabajos;

@Service
public class EmpleadosServiceImpl implements IEmpleadosService{

    @Autowired
    EmpleadosRepository EmpleadosRepo;

	@Override
	public List<Empleados> listarTrabajadores() {
		// TODO Auto-generated method stub
		return EmpleadosRepo.findAll();
	}

	@Override
	public Empleados mostrarTrabajadorID(Long id) {
		// TODO Auto-generated method stub
		return EmpleadosRepo.findById(id).get();
	}

	@Override
	public List<Empleados> listarTrabajadoresPorTrabajo(Trabajos trabajo) {
		// TODO Auto-generated method stub
		return EmpleadosRepo.findByTrabajo(trabajo);
	}

	@Override
	public Empleados guardarTrabajador(Empleados Empleado) {
		// TODO Auto-generated method stub
		return EmpleadosRepo.save(Empleado);
	}

	@Override
	public Empleados actualizarTrabajador(Empleados Empleado) {
		// TODO Auto-generated method stub
		return EmpleadosRepo.save(Empleado);
	}

	@Override
	public void eliminarTrabajador(Long id) {
		// TODO Auto-generated method stub
		EmpleadosRepo.deleteById(id);
		
	}
    
    

}
