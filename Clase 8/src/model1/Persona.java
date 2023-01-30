package model1;

/**
 *
 * @author Juan Carlos Camayo
 */
public class Persona {
    
    private String apellidos;
    protected String nombre;
    private int edad;

    public Persona() {
    }

    public String generarCorreo(){
        return nombre.toLowerCase() + "." + apellidos.toLowerCase() + "@mail.com";
    }
    
    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
