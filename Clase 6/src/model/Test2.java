package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juan Carlos Camayo
 */
public class Test2 {
    
    public static void main(String[] args) {
    
        List<Libro> libros = new ArrayList<Libro>();
        libros.add(new Libro("Programación orientada a objetos en Java", 
                "Blasco, F.", 2019));
        libros.add(new Libro("Java: interfaces gráficas y aplicaciones para internet",
                "Ceballos Sierra, F.",2015));
        libros.add(new Libro("Java 2: lenguaje y aplicaciones.",
                "Ceballos Sierra, F. J.",2015));
        libros.add(new Libro("Creación de páginas web: HTML 5.",
                "Celaya Luna, A.",2014));
        libros.add(new Libro("Iniciación a javascript","Mohedano, J.",2013));

        for (Libro lib : libros) {
            System.out.println("===========================");
            lib.mostrar();
        }
    }
    
}
