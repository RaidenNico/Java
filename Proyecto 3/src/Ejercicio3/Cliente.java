/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Nicolas
 */
public class Cliente {
    public String nombre;
    public double monto;

    public Cliente(String nombre, double monto) {
        this.nombre = nombre;
        this.monto = monto;
    }
    public double depositar(double cant){
        return monto = monto + cant;
    }
    public double extraer(double stonks){
        return monto = monto - stonks;
    }
    public String imprimir(){
    return "Nombre: " + nombre + "\n" +"Monto: " + monto;
    }
}
