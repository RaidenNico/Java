package model3;

/**
 *
 * @author Juan Carlos Camayo
 */
public class Test {
    
    public static void main(String[] args) {
        A obj1 = new A(2, 4);
        B obj2 = new B(1, 3, 5);
        
        System.out.println("A: " + obj1.suma());
        System.out.println("B: " + obj2.suma());
        System.out.println("B_A: " + obj2.suma_A());
    }
    
}
