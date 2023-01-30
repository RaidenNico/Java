package s03;

import java.util.ArrayList;

/**
 *
 * @author Juan Carlos Camayo
 */
public class BuscaArray {
    
    public static void main(String[] args) {
        
        ArrayList<String> paises = new ArrayList<>();
        paises.add("Perú");
        paises.add("Argentina");
        paises.add("Chile");
        paises.add("Ecuador");
        paises.add("Bolivia");
        
        String busqueda ="Perú";
        boolean existe = paises.contains(busqueda);
        if (existe) {
            System.out.println(busqueda + " exista en la lista");
        }else{
            System.out.println(busqueda + " no exista en la lista");
        }
        
        busqueda ="Mexico";
        existe = paises.contains(busqueda);
        if (existe) {
            System.out.println(busqueda + " exista en la lista");
        }else{
            System.out.println(busqueda + " no exista en la lista");
        }
        
    }
    
}
