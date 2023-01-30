package s03;

/**
 *
 * @author Juan Carlos Camayo
 */
public class S03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        UsoVar tema = new UsoVar();                         //nombre = IDAT
        System.out.println("UsoVar. Metodo 01");                
        tema.metodo01();                                    //print IDAT
                                                            //nombre = IDAT M1
        System.out.println("========================");     
        System.out.println("UsoVar. Metodo 02");            
        tema.metodo02();                                    //print IDAT M1  
        System.out.println("========================");  
        System.out.println("UsoVar. Metodo 02 (new UsoVar())");         
        tema = new UsoVar();                                //nombre = IDAT
        tema.metodo02();                                    //print IDAT
        System.out.println("========================");  
        tema.metodoGeneral();
        
        //Acceso a variables
        //System.out.println("tema.nombre = " + tema.nombre);
        System.out.println("tema.edad = " + tema.edad);
        tema.setEdad(25);
        tema.setNombre("PERU");
        System.out.println("tema.getNombre() = " + tema.getNombre());
        System.out.println("tema.edad = " + tema.edad);
        
        System.out.println("========================"); 
        //Metodos sobrecargados y con retorno
        UsoMetodo meto = new UsoMetodo();
        meto.getPromedio(13, 15, 19, "JAVA");
        System.out.println("meto.getPromedio(15,16,18) = " + meto.getPromedio(15,16,18));
        
        System.out.println("========================"); 
        String text = "Please locate where 'locate' occurs!";
        System.out.println("text = " + text);
        System.out.println("Uso de indexof");
        System.out.println("buscar locate: " + text.indexOf("locate"));
        System.out.println("buscar Please: " + text.indexOf("Please"));
        System.out.println("buscar IDAT:   " + text.indexOf("IDAT"));
        System.out.println("Uso de Contains");
        System.out.println("existe locate : " +  text.contains("locate"));
        System.out.println("existe IDAT : " +  text.contains("IDAT"));
        System.out.println("Uso de Replace");
        String mensaje1 = "Me gusta programar en Python";
        System.out.println(mensaje1.replace("Python", "Java"));
        String mensaje2 = "Me gusta programar en Python porque Python tiene mucha documentacion.";
        System.out.println(mensaje2.replace("Python", "Java"));
        
        System.out.println("========================");
        System.out.println("Tipo de metodos");
        UsoMetodoClase.miMetodoEstatico();
        UsoMetodoClase metClase = new UsoMetodoClase();
        metClase.miMetodoInstancia();
        
        
    }
    
}
