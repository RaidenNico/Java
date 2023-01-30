package s03;

/**
 *
 * @author Juan Carlos Camayo
 */
public class UsoVar {
    
    //Variables globales
    private String nombre = "IDAT";
    int edad;
    char de;
    //Valores por defect int (0), double (0.0) boolean(false) char('\0')
    //String (null)
    
    void metodo01()
    {
        //Variables locales
        int x = 10;
        int y;
        System.out.println("x = " + x);
        //System.out.println("y = " + y); // y debe de inicalizarse
        System.out.println("nombre = " + nombre);
        System.out.println("edad = " + edad);
        System.out.println("de = [" + de + ']');
        nombre = "IDAT M1";
    }
    
    void metodo02(){
        String a = "A";
        String b;
        System.out.println("a = " + a);
        //System.out.println("b = " + b);
        //System.out.println("x = " + x);
        System.out.println("nombre = " + nombre);
        System.out.println("edad = " + edad);
    }
    
    void metodoGeneral(){
        System.out.println("METODO GENERAL");
        System.out.println("==========================");
        metodo01();
        System.out.println("==========================");
        metodo02();
        System.out.println("==========================");
    }
 
    //Metodo sin retorno
    void setNombre(String nom){
        this.nombre = nom;
    }
    
    void setEdad(int edad){
        this.edad = edad;
    }
    
    //Metodo con retorno
    String getNombre(){
        return nombre;
    }
}
