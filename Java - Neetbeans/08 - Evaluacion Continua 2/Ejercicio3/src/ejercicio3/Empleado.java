/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.util.Date;

/**
 *
 * @author Nicolas
 */
public class Empleado {

    private String nombre;
    private Double salario;
    private Date fechaDeNacimiento;

    public Empleado(String nombre, Double salario, Date fechaDeNacimiento) {
        this.nombre = nombre;
        this.salario = salario;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

}
