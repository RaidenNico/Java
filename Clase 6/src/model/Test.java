package model;

/**
 *
 * @author Juan Carlos Camayo
 */
public class Test {
    
    public static void main(String[] args) {
        //Clase : Auto  (atributos)
        //Objeto: a1, a2 y a3
        Auto a1 = new Auto();
        Auto a2 = new Auto(2016, "Plata", "Toyota");
        Auto a3;
        
        a1.anioFab = 2015;
        a1.marca = "Volvo";
        a1.color = "Rojo";
        
        a3 = new Auto();
        a3.anioFab = 2018;
        a3.marca = "Audi";
        a3.color = "Azul";
        
        System.out.println("3 Clases Auto");
        System.out.println("Año\tColor\tMarca");
        System.out.println(a1.anioFab+"\t" + a1.color + "\t" + a1.marca);
        System.out.println(a2.anioFab+"\t" + a2.color + "\t" + a2.marca);
        System.out.println(a3.anioFab+"\t" + a3.color + "\t" + a3.marca);
        
        //Clase Persona (metodos)
        Persona per;
        per = new Persona();
        per.inicializar();
        per.imprimir();
        per.esMayorEdad();
        
    }
    
}
