package s08;

import model2.Alumno;

/**
 *
 * @author Juan Carlos Camayo
 */
public class TestStatic {
    
    public static void main(String[] args) {
        System.out.println("==== Test Static ====");
        System.out.println(new Alumno("Kike"));
        System.out.println(new Alumno("Jose"));
        System.out.println(new Alumno("Fio"));
        System.out.println(new Alumno("Vane"));
        System.out.println("====================");
        System.out.println("Cantidad: " + Alumno.cantidad);
    }
    
}
