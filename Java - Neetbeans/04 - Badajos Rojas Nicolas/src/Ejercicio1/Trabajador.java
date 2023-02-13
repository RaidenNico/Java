/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Nicolas
 */
public class Trabajador {
    protected String nombre;
    protected String apellido;
    protected String telefono;

    public Trabajador(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }
    
    public String generarcodigo(){
       String z = nombre.substring(0,1);
       String w = apellido.substring(apellido.length()-1);
       String cod = z + w + telefono;
       return cod;
       }
    }
