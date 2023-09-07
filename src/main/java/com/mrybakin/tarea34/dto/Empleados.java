package com.mrybakin.tarea34.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Empleados")
public class Empleados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "trabajo")
    private String trabajo;

    @Column(name = "salario")
    private double salario;
    
    public Empleados() {}

    public Empleados(Long id, String nombre, String trabajo, double salario) {
		this.id = id;
		this.nombre = nombre;
		this.trabajo = trabajo;
		this.salario = salario;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String toString() {
        return "Empleado id=" + id + ", nombre=" + nombre + ", trabajo=" + trabajo + ", salario=" + salario + "";
    }
}
