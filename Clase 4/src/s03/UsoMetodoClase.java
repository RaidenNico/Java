package s03;

/**
 *
 * @author Juan Carlos Camayo
 */
public class UsoMetodoClase {
    
    static int varStatic = 100;
    int varInstancia = 200;
    
    static void miMetodoEstatico(){
        int a = 0;
        System.out.println("Metodo estatico.");
        System.out.println("varStatic = " + varStatic);
        //System.out.println("varInstancia = " + varInstancia);
    }
    
    void miMetodoInstancia(){
        System.out.println("Metodo instancia");
        System.out.println("varStatic = " + varStatic);
        System.out.println("varInstancia = " + varInstancia);
    }
    
}
