package model1;

/**
 *
 * @author Juan Carlos Camayo
 */
public class Perro extends Mamifero{
    @Override
    public String hacerRuido(){
        return "Guau";
    }

    @Override
    public String mensaje() {
        return super.mensaje() + " (Perro)";
    }
    
    public void correr(){
        
    }
}
