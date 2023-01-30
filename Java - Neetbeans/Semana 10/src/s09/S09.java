package s09;

import java.util.ArrayList;

/**
 *
 * @author Juan Carlos Camayo
 */
public class S09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ArrayList
        ArrayList<String> listaNombres = new ArrayList<String>();
        
        //.add()
        listaNombres.add("Juan");
        listaNombres.add("Carlos");
        listaNombres.add("Mary");
        listaNombres.add("Ana");
        listaNombres.add("Jose");
        System.out.println(listaNombres);
        
        //.add(index, objeto)
        listaNombres.add(1, "Rene");
        System.out.println(listaNombres);
                
        //.clear()
        //listaNombres.clear();
        //System.out.println(listaNombres);
        
        //get(index)
        System.out.println(listaNombres.get(1));
        
        //.indexof( Object )
        System.out.println(listaNombres.indexOf("Ana"));
        
        //.remove(index)
        listaNombres.remove(4);
        System.out.println(listaNombres);
        
        //.remove(object)
        listaNombres.remove("Rene");
        System.out.println(listaNombres);
        
        //.set(index, object)
        listaNombres.set(1, "Julian");
        System.out.println(listaNombres);
        
        //.size()
        System.out.println("Cantidad: " + listaNombres.size());
    }
    
}
