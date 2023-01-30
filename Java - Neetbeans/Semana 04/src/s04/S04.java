package s04;

/**
 *
 * @author Juan Carlos Camayo
 */
public class S04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=0, b=10;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //Contadores
        a = a + 1;
        a++;
        b = b - 1;
        b--;
        System.out.println("Contadores");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //Acumuladores
        a = a + 3;
        a += 3;
        b = b - 2;
        b -= 2;
        System.out.println("Acumuladores");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        a *= 2;
        b /= 2; 
        System.out.println("Multi/Divi");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        //Concatenador
        String mensaje = "IDAT";
        System.out.println("mensaje = " + mensaje);
        mensaje += " PERU";
        mensaje = mensaje + " 2022";
        System.out.println("mensaje = " + mensaje);
        
        System.out.println("Iteracion (for)");
        for(int i=0; i<5; i++){
            System.out.println("i = " + i);
        }
        
        
        
    }
    
}
