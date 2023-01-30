package model1;

/**
 *
 * @author Juan Carlos Camayo
 */
public class TestInterfaz {

    public static void main(String[] args) {
        
        ClaseA objA = new ClaseA();
        objA.set(2);
        System.out.println(objA.show());
        System.out.println("dato objA = " + objA.get());
        
        ClaseB objB = new ClaseB();
        objB.set(4);
        System.out.println("dato objB = " + objB.get());
    }
    
}
