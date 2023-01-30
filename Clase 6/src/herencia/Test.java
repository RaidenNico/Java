package herencia;

/**
 *
 * @author Juan Carlos Camayo
 */
public class Test {

    public static void main(String[] args) {
        
        ClasePadre padre = new ClasePadre();
        padre.setCodigo(1);
        padre.setNombre("Juan");
        padre.imprimeSaludo();
        padre.imprimeDespedida();
    
        ClaseHija hija = new ClaseHija();
        hija.setEdad(15);
        hija.setCodigo(2);
        hija.setNombre("Maria");
        hija.imprimeSaludo();
        hija.imprimeDespedida();
        
        //Clases abstractas no se instancian
        //ClaseAbstracta abstracta = new ClaseAbstracta();
        
    }
    
}
