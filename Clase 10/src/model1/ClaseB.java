package model1;

/**
 *
 * @author Juan Carlos Camayo
 */
public class ClaseB implements 
            Constantes, Interfaz1{
    int dato;

    @Override
    public void set(int dato) {
        this.dato = dato * NUMERO;
    }

    @Override
    public int get() {
        return dato;
    }
    
    
}
