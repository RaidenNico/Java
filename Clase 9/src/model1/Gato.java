package model1;

/**
 *
 * @author Juan Carlos Camayo
 */
public class Gato extends Mamifero {
    @Override
    public String hacerRuido() {
        return "Miau";
    }

    @Override
    public String mensaje() {
        return super.mensaje() + " (Gato)";
    }
    
    public void dormir(){
        
    }
    
    
    
    
    
}
