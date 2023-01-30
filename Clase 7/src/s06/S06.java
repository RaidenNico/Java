package s06;

import model.Persona;
import model.Ventana;
import model.VentanaTitulo;

/**
 *
 * @author Juan Carlos Camayo
 */
public class S06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona persona = new Persona();
        //persona.nombre = ""; //Sin encapsular
        //Encapsular:
        //Registringir-> atributos o metodos
        //Controlar   -> metodos de acceso (get - set)
        System.out.println("Persona (datos)");
        persona.setNombre("Juan");
        System.out.println("persona.getNombre() = " + persona.getNombre());
        persona.setApellido("");
        System.out.println("persona.getApellido() = " + persona.getApellido());
        persona.setNota(30);
        System.out.println("persona.getNota() = " + persona.getNota());
        
        System.out.println("Persona (por defecto)");
        persona = new Persona();
        persona.imprimir();
        
        System.out.println("Persona (constructor con datos)");
        persona = new Persona("Jose", "Lopez", 15);
        persona.imprimir();
        persona = new Persona("Maria", "Ramos", 15, 18);
        persona.imprimir();
        persona = new Persona("Ana", "Vidal", 13, 15, 17);
        //persona.imprimir();
        System.out.println("persona = " + persona); // persona.toString()
        
        System.out.println("==============================================");
        System.out.println("Clase Ventana");
        Ventana ventana = new Ventana(0, 0, 20, 30);
        ventana.mostrar();
        ventana.cambiarDimensiones(10, 10);
        ventana.mostrar();
        System.out.println("Clase Ventana Titulo");
        VentanaTitulo ventanaTitulo = new VentanaTitulo();
        ventanaTitulo.mostrar();
        ventanaTitulo.cambiarDimensiones(15, 15);
        ventanaTitulo.mostrar();
        
        ventanaTitulo = new VentanaTitulo("Titulo principal", 0, 0, 20, 30);
        ventanaTitulo.mostrar();
        ventanaTitulo.desplazar(4, 3);
        ventanaTitulo.cambiarDimensiones(10, -5);
    }
    
}
