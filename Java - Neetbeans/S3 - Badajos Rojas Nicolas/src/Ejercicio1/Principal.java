/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;
import Ejercicio1.Empleado;
import Ejercicio1.Consultor;

/**
 *
 * @author Nicolas
 */
public class Principal {
    public static void main(String[] args) {
        Empleado a = new Empleado("Nicolas", "Badajos", "987936272", 600, 40);
        Consultor b = new Consultor("Alexis", "Rojas", "789396722", 6, 14);
        Trabajador c = new Trabajador("Cesar", "Soto", "924936789");
        System.out.println(a.mostrardatos());
        System.out.println(b.mostrardatos());
        System.out.println(c.generarcodigo( ));
    }
}
