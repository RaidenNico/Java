/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;
import Hijo.Gato;
import Hijo.Perro;
import Hijo.Pollo;
/**
 *
 * @author Nicolas
 */
public class Principal {
    public static void main(String[] args) {
        Gato g = new Gato();
        System.out.println(g.habla());
        Perro p = new Perro();
        System.out.println(p.habla());
        Pollo t = new Pollo();
        System.out.println(t.habla());
    }
}
