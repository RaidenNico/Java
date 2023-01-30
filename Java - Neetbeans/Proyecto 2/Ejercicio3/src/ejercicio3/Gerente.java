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
public class Gerente extends Empleado {

    private String departamento;

    public Gerente(String departamento, String nombre, Double salario, Date fechaDeNacimiento) {
        super(nombre, salario, fechaDeNacimiento);
        this.departamento = departamento;
    }

    public Gerente() {
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}
