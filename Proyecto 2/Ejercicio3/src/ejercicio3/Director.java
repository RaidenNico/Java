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
public class Director extends Gerente {

    private double vehiculoEmpresa;

    public Director(String departamento, String nombre, Double salario, Date fechaDeNacimiento) {
        super(departamento, nombre, salario, fechaDeNacimiento);
    }

    public Director() {
    }

    public double getVehiculoEmpresa() {
        return vehiculoEmpresa;
    }

    public void setVehiculoEmpresa(double vehiculoEmpresa) {
        this.vehiculoEmpresa = vehiculoEmpresa;
    }

}
