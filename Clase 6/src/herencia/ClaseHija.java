package herencia;

/**
 *
 * @author Juan Carlos Camayo
 */
public class ClaseHija extends ClasePadre{
    private int edad;

    @Override
    void imprimeSaludo() {
        ///this.edad
        System.out.println("Buenas tardes " + getNombre());
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
