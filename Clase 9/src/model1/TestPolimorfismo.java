package model1;

import java.util.ArrayList;

/**
 *
 * @author Juan Carlos Camayo
 */
public class TestPolimorfismo {
    
    public static void main(String[] args) {
        //Polimorfismo
        System.out.println("Metodos directos de objetos");
        Perro p = new Perro();
        System.out.println(p.hacerRuido());
        p.correr();
        
        Gato g = new Gato();
        System.out.println(g.hacerRuido());
        g.dormir();
        
        Mamifero m = new Mamifero() {
            @Override
            public String hacerRuido() {
                return "...";
            }
        };
        
        System.out.println("==============================");
        System.out.println("Declaracions de objetos con Clase Padre e instancia Hija");
        //Perro p1 = new Perro();
        Mamifero m1 = new Perro();
        System.out.println(m1.hacerRuido());
        System.out.println(m1.mensaje());
        System.out.println(m1.unico());
        //m1.correr();
        
        //m1 es un objeto de clase Mamifero pero instanciado como clase Perro
        //m1 puede usar solo los metodos de Mamifero
        //m1 no puede usar los metodos de Perro que no esten en Mamifero
        //m1 usara los metodos de Perro que han sido sobreescritor de Mamifero
        
        Mamifero m2 = new Gato();
        System.out.println(m2.hacerRuido());
        System.out.println(m2.mensaje());
        
        System.out.println("==============================");
        System.out.println("Envio de objeto a metodo con clase Padre de parametro");
        imprimir(p);
        imprimir(g);
        imprimir(m);
        
        System.out.println("==============================");
        System.out.println("Crear ArrayList de animales con instanacias de hijos");
        ArrayList<Mamifero> animales = new ArrayList<Mamifero>();
        animales.add(p);//0             //Perro
        animales.add(g);//1             //Gato
        animales.add(m);//2             //Mamifero
        animales.add(m1);               //Perro
        animales.add(m2);               //Gato
        animales.add(new Perro());      //Perro
        animales.add(new Perro());      //Perro
        animales.add(new Gato());       //Gato
        animales.add(new Gato());       //Gato
        animales.add(new Perro());      //Perro
        
        for (Mamifero animal : animales) {
            imprimir(animal);
        }
        
        System.out.println("--------------");
        System.out.println(animales.get(2));
        System.out.println(animales.get(7));
        
    }
    
    public static void imprimir(Mamifero m)
    {
        System.out.println(m.hacerRuido());
        System.out.println(m.mensaje());
        //m.correr();
        //m.dormir();
    }
    
}
