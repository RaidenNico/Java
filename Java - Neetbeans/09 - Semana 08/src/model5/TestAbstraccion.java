package model5;

/**
 *
 * @author Juan Carlos Camayo
 */
public class TestAbstraccion {
    
    public static void main(String[] args) {
        
        Cuadrado obj1 = new Cuadrado(100, 20, 12);
        System.out.println("Cuadrado");
        System.out.println("Ubicacion: " + obj1.ubicacion());
        System.out.println("Area: " + obj1.area());
        
        Circulo obj2 = new Circulo(300, 200, 20);
        System.out.println("Circulo");
        System.out.println("Ubicacion: " + obj2.ubicacion());
        System.out.println("Area: " + obj2.area());
          
        System.out.println("=====================================");
        
        imprimir(obj1);
        imprimir(obj2);
    }
    
    public static void imprimir(Figura f){
        System.out.println(f.getClass().getName());
        System.out.println("Ubicacion: " + f.ubicacion());
        System.out.println("Area: " + f.area());
    }
    
    
}
