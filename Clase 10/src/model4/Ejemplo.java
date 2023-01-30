package model4;

/**
 *
 * @author Juan Carlos Camayo
 */
public class Ejemplo {
    
    public static void main(String[] args) {
        //checkAge(15);
        //checkAge(20);
        validNumbers();
    }
    
    static void checkAge(int age){
        if(age < 18){
            throw new IllegalArgumentException("Acceso denegado: Debe ser mayor a 18.");
        }else{
            System.out.println("Acceso garantizado - Tu eres mayor.");
        }
    }
    
    static void validNumbers(){
        try{
            int[] numbers = { 1, 2, 3 };
            System.out.println( numbers[5] );
        }catch(Exception ex){
            System.out.println("Algo salio mal.");
        }finally{
            System.out.println("Try catch fue finalizado.");
        }
    }
    
}
