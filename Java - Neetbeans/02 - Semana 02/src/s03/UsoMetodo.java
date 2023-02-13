package s03;

/**
 *
 * @author Juan Carlos Camayo
 */
public class UsoMetodo {
    
    //Metodo sobrecargados

    void getPromedio(int n1, int n2, int n3, String nombre){
        double promedio = (n1+n2+n3)/3;
        System.out.println("nombre = " + nombre);
        System.out.println("promedio = " + promedio);
    }
    
    double getPromedio(int n1, int n2, int n3){
        double promedio = (n1+n2+n3)/3;
        return promedio;
    }
    
    double getPromedio(int x1, short x2, int x3){
        double promedio = (x1+x2+x3)/3;
        return promedio;
    }
    
    //No se pueden sobrecargar metodos simulares con/sin retorno
    //void getPromedio(int n1, int n2, int n3){
    //    double promedio = (n1+n2+n3)/3;
    //    System.out.println("Promedio : " + promedio);
    //}
    
}
