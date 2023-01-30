package s07;

import model1.Alumno;
import model1.Docente;
import model1.DocenteParcial;
import model1.Persona;

/**
 *
 * @author Juan Carlos Camayo
 */
public class S07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // HERENCIA
        Persona per1 = new Persona();
        per1.setNombre("Juan");
        per1.setApellidos("Perez");
        per1.setEdad(30);
        printDatos(per1);
        System.out.println("");
        
        Docente doc1 = new Docente();
        doc1.setNombre("Jose");
        doc1.setApellidos("Lopez");
        doc1.setEdad(35);
        doc1.setTarifa(21);
        doc1.setHoras(8);
        printDatos(doc1);
        System.out.println("Sueldo: " + doc1.calcularSueldo());
        System.out.println("");
        
        Alumno alu1 = new Alumno();
        alu1.setNombre("Maria");
        alu1.setApellidos("Salas");
        alu1.setEdad(25);
        alu1.setNota1(15);
        alu1.setNota2(15);
        alu1.setNota1(15);
        printDatos(alu1);
        System.out.println("Promedio: " + alu1.calcularPromedio());
        
        DocenteParcial docP1 = new DocenteParcial();
        docP1.setNombre("Ana");
        docP1.setApellidos("Gomez");
        docP1.setEdad(33);
        docP1.setTarifa(15);
        docP1.setHoras(10);
        docP1.setContrato("CON123456789");
        docP1.setTurno("M");
        printDatos(docP1);
        System.out.println("Sueldo: " + docP1.calcularSueldo());
        System.out.println("");
        
    }
    
    public static void printDatos(Persona p){
        System.out.println("Nombre: " + p.getNombre() + " " + p.getApellidos());
        System.out.println("Edad: " + p.getEdad());
        System.out.println("Correo:" + p.generarCorreo());
    }
    
}
