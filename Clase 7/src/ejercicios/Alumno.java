package ejercicios;

/**
 *
 * @author Juan Carlos Camayo
 */
public class Alumno {
    private String nombre;
    private String apellido;

    public Alumno() {
    }

    
    
    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    public String getNombreCompleto()
    {
        return nombre + " " + apellido;
    }
    
}
