package sellado;

/**
 *
 * @author Juan Carlos Camayo
 */
final class Owl extends Bird implements Nocturnal{

    @Override
    public void dormir() {
        System.out.println("ZzZzZzZ");
    }
    
    
    
}
