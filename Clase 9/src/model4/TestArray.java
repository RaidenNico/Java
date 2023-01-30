package model4;

/**
 *
 * @author Juan Carlos Camayo
 */
public class TestArray {
    
    public static void main(String[] args) {
        //Declaracion de arreglos
        int[] numeros; //null
        double[] sueldos;
        String[] nombres;
        
        //Inicializacion de arreglos
        numeros = new int[10];
        sueldos = new double[5];
        nombres = new String[7];
        
        //Valores por defecto en la primera casilla
        System.out.println(numeros[0]);
        System.out.println(sueldos[0]);
        System.out.println(nombres[0]);
        
        //System.out.println(sueldos[5]);   //ERROR
        
        System.out.println("Numero aleatorio");
        System.out.println(Math.random());
        System.out.println((int)Math.random());
        System.out.println((int)(Math.random()*10));
        //MIN: 1 MAX: 100
        //(MAX - MIN + 1) * random + MIN
        System.out.println((int)((100-1+1)*Math.random()+1));
        System.out.println("==============================================");
        generarNumeros(numeros);
        System.out.println("==============================================");
        generarSueldos(sueldos);
        System.out.println("==============================================");
        generarNombres(nombres);
    }
    
    public static void generarNumeros(int[] numeros){
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)((99-10+1)*Math.random()+10);
        }   //MIN: 10 MAX: 99
        for (int numero : numeros) {
            System.out.println("numero = " + numero);
        }
    }
    
    public static void generarSueldos(double[] sueldos){
        for (int i = 0; i < sueldos.length; i++) {
            sueldos[i] = Math.round((2500-850+1)*Math.random()+850);
        }//MIN 850 MAX 2500
        for (double sueldo : sueldos) {
            System.out.println("sueldo = " + sueldo);
        }
    }
    
    public static void generarNombres(String[] nombres){
        String[] bd = { "Andrea", "David", "Baldomero", "Balduino", "Baldwin", 
                "Baltasar", "Barry", "Bartolo", "Bartolomé", "Baruc", 
                "Baruj", "Candelaria", "Cándida", "Canela", "Caridad", 
                "Carina", "Carisa", "Caritina", "Carlota", "Baltazar"};
        
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = bd[(int)Math.floor(Math.random()*bd.length)];
        }
        for (String nombre : nombres) {
            System.out.println("nombre = " + nombre);
        }
    }
    
}
