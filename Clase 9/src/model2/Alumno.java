
package model2;

/**
 *
 * @author Juan Carlos Camayo
 */
public class Alumno {
    private String nombre;
    public static int cantidad;// = 0;
    
    static{
        cantidad = 0;
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
        cantidad++;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre;
    }
    
    
    
    
}
