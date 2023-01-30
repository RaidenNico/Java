package model2;

/**
 *
 * @author Juan Carlos Camayo
 */
public class TestAlumno {
    
    public static void main(String[] args) {
        Alumno a1 = new Alumno("Juan");
        System.out.println(a1);
        System.out.println("Cantidad: " + Alumno.cantidad);
        Alumno a2 = new Alumno("Jose");
        Alumno a3 = new Alumno("Pedro");
        Alumno a4 = new Alumno("Maria");
        Alumno a5 = new Alumno("Ana");
        Alumno a6 = new Alumno("Julian");
        Alumno a7 = new Alumno("Josue");
        
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a6);
        System.out.println(a7);
        
        a7 = new Alumno("Javier");
        System.out.println(a7);
        
        System.out.println("Cantidad: " + Alumno.cantidad);
        
        s08.TestStatic.main(args);
        
    }
    
}
