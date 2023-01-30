package herencia;

/**
 *
 * @author Juan Carlos Camayo
 */
public class ClaseHijaAbstracta extends ClaseAbstracta
                    implements Inter{

    // METODO ABSTRACTO DE CLASEABSTRACTA
    @Override
    public void metodo01() {
        System.out.println("Metodo 01, sobreescrito");
    }

    // METODOS ABSTRACTOS DE INTERFACE INTER
    @Override
    public void metodo02I() {
        
    }

    @Override
    public void metodo03I() {
        
    }
    
    
    
}
