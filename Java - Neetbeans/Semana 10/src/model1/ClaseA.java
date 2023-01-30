package model1;

/**
 *
 * @author Juan Carlos Camayo
 */
public class ClaseA implements 
        Constantes, Interfaz1{
    double dato;

    @Override
    public void set(int dato) {
        this.dato = dato;
    }

    @Override
    public int get() {
        return (int) dato;
    }

    public String show(){
        return "Imprime: " + dato;
    }
    
}
