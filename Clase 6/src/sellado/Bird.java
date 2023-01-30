package sellado;

/**
 *
 * @author Juan Carlos Camayo
 */
abstract sealed class Bird permits Eagle, Owl {
    
    protected void fly(){
        System.out.println("Bird flying");
    } 
    
}
