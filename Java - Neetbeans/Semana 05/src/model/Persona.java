package model;

import java.util.Scanner;

/**
 *
 * @author Juan Carlos Camayo
 */
public class Persona {
    
    private Scanner teclado;
    private String nombre;
    private int edad;
    
    public void inicializar(){
        teclado = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        nombre = teclado.next();
        System.out.println("Ingrese edad:");
        edad = teclado.nextInt();
    }
    
    public void imprimir(){
        System.out.println("Nombre:" + nombre);
        System.out.println("Edad:" + edad);
    }
    
    public void esMayorEdad(){
        if(edad >= 18){
            System.out.println(nombre + " es mayor de edad");
        }else{
            System.out.println(nombre + " no es mayor de edad");
        }
    }
    
}
