package paq01;

/**
 *
 * @author Juan Carlos Camayo
 */
public class MiClase {
    
    private   String varPrivate;
              String varDefault;
    protected String varProtected;
    public    String varPublic;
    
    public void miMetodo(){
        System.out.println("varPrivate = " + varPrivate);
        System.out.println("varDefault = " + varDefault);
        System.out.println("varProtected = " + varProtected);
        System.out.println("varPublic = " + varPublic);
    }
    
}
