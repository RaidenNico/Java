/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Nicolas
 */
public class Empleado extends Trabajador {
    private int sueldob;
    private int porcentaje;

    public Empleado(String nombre, String apellido, String telefono, int sueldob, int porcentaje) {
        super(nombre, apellido, telefono);
        this.sueldob = sueldob;
        this.porcentaje = porcentaje;
    }
    public int bonisoles(){
        return (sueldob * porcentaje)/100;
    }
    public int sbruto(){
        return sueldob + bonisoles();
    }
    public String mostrardatos(){
        return "Nombre: " + nombre + "\n" +"Apellido: " + apellido + "\n" + "Telefono: " + telefono + "\n" + "Bono en soles: " + bonisoles() + "\n" + "Sueldo Bruto: " + sbruto();
    }
}
