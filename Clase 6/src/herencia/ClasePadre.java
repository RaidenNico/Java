
package herencia;

/**
 *
 * @author Juan Carlos Camayo
 */
public class ClasePadre {
    private int codigo;
    private String nombre;

    void imprimeSaludo(){
        System.out.println("Hola " + nombre);
    }
    void imprimeDespedida(){
        System.out.println("Hasta luego " + nombre);
    }
    
    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
    
}
