/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Nicolas
 */
public class Consultor extends Trabajador {
    private int hora;
    private int tarifa;

    public Consultor(String nombre, String apellido, String telefono, int hora, int tarifa) {
        super(nombre, apellido, telefono);
        this.hora = hora;
        this.tarifa = tarifa;
    }
    public int sbruto(){
        return hora * tarifa;
    }
    public String mostrardatos(){
        return "Nombre: " + nombre + "\n" +"Apellido: " + apellido + "\n" + "Telefono: " + telefono + "\n" + "Sueldo Bruto: " + sbruto();
    }
}
