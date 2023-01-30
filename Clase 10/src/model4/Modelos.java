package model4;

/**
 *
 * @author Juan Carlos Camayo
 */
public class Modelos {
    
    public static void main(String[] args) {
        
        //Ejemplo 01
        try{
            //CODIGO
        }catch(Exception ex)
        {
            //ex.getMessage();
            //ex.getStackTrace();
            //MENSAJE DE ERROR
        }
        
        //Ejemplo 02
        try{
            //CODIGO
        }catch(NullPointerException ex1){
            // String n = null;
            // n.length() <-- ERROR
        }catch(ArithmeticException ex2){
            // int n = 45 / 0;  <-- ERROR
        }catch(NumberFormatException ex3){
            // String n = "doce";
            // int i = Integer.parseInt(n); <-- ERROR
        }
        
        //Ejemplo 03
        try{
            //CODIGO
        }catch(NullPointerException | ArithmeticException | NumberFormatException ex){
            //Mensaje de error
        }

        //Ejemplo 04
        try{
            //CODIGO
            //linea 1
            //linea 2
            //linea 3  <-- ERROR
            //linea 4
            //linea 5
            
        }catch(Exception ex){
            //mensaje de error
        }finally{
            
        }
    }
    
}
