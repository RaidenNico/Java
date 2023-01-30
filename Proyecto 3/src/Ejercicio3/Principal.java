/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Nicolas
 */
public class Principal {
    public static void main(String[] args) {
        Cliente t = new Cliente("Nicolas", 500 );
        System.out.println(t.depositar(500));
        System.out.println(t.extraer(200));
        System.out.println(t.imprimir());
    }
}
