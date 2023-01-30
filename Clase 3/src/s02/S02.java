package s02;

/**
 *
 * @author Juan Carlos Camayo
 */
public class S02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Operadores Aritmeticos
        int suma = 30 + 40;
        int resta = 95 - 25;
        int multi = 12 * 5;
        int divInt = 20 / 7;
        double divi = 20 / 7d; // 7.0 7d 7f
        int modu = 20 % 7;
        
        //sout   ->   System.out.println("");
        //soutv (TAB) ->   System.out.println("modu = " + modu);
        
        System.out.println("suma = " + suma);
        System.out.println("resta = " + resta);
        System.out.println("multi = " + multi);
        System.out.println("divInt = " + divInt);
        System.out.println("divi = " + divi);
        System.out.println("modu = " + modu);
        
        //No se puede operar si es que se tiene un texto en la operación
        System.out.println("opera 1 = " + suma + resta);
        System.out.println("opera 2 = " + (suma + resta));
        
        // Al realizar varias operaciones en una sola asignacion, tomar en cuenta:
        // ()       primera opcion
        // * / %    segunda opcion
        // + -      tercera opcion
        
        double v1 = 3.0 * 2 + 50 / 10;      // 6.0 + 5 = 11.0
        System.out.println("v1 = " + v1);
        double v2 = 3.0 * (2 + 50) / 10;    //3.0 * 52 / 10 = 15.6
        System.out.println("v2 = " + v2);
        
        //boolean v3 = true + false; //NO SE PUEDE 
        
        System.out.println("======Operadores relacionales======");
        // 8 > 4 = true   .... 8 < 4 = false
        boolean valor1 = true;
        boolean valor2 = false;
        System.out.println("valor1 = " + valor1);
        System.out.println("valor2 = " + valor2);
        boolean valor3 = Boolean.parseBoolean("true");
        System.out.println("valor3 = " + valor3);
        boolean valor4 = Boolean.parseBoolean("false");
        System.out.println("valor4 = " + valor4);
        boolean valor5 = Boolean.parseBoolean("1");//No es correcto
        System.out.println("valor5 = " + valor5);
        
        // a <  b ... ¿"a" es menor a "b"?
        // a >  b ... ¿"a" es mayor a "b"?
        // a == b ... ¿"a" es igual a "b"?
        // a != b ... ¿"a" es distinto a "b"?
        // a <=  b ... ¿"a" es menor o igual a "b"?
        // a >=  b ... ¿"a" es mayor o igual a "b"? 
        
        int valComp = 10;
        System.out.println("valComp = " + valComp);
        System.out.println("(5 > valComp) = " + (5 > valComp));
        System.out.println("(8 < valComp) = " + (8 < valComp));
        System.out.println("(6 == valComp) = " + (6 == valComp));
        System.out.println("(6 != valComp) = " + (6 != valComp));
        System.out.println("(6 >= valComp) = " + (6 >= valComp));
        System.out.println("(6 <= valComp) = " + (6 <= valComp));
        System.out.println("(10 < valComp) = " + (10 < valComp));
        System.out.println("(10 > valComp) = " + (10 > valComp));
        System.out.println("(10 <= valComp) = " + (10 <= valComp));
        System.out.println("(10 >= valComp) = " + (10 >= valComp));
        
        System.out.println("======Operadores logicos======");
        // AND && (Alt+38)
        //  OR || (Alt+124)
        // NOT  !
        
        int a = 5, b = 3 , c = 7;
        boolean valor6 = ( (a<b) && (b<c) );
                        // (5<3) && (3<7) = (false && true) = false 
        boolean valor7 = ( (a<b) || (b<c) );
                        // false || true = true
        boolean valor8 = !( (a<b) || (b<c) );
                        // !(true) = false
        System.out.println("valor6 = " + valor6);
        System.out.println("valor7 = " + valor7);
        System.out.println("valor8 = " + valor8);
        
        System.out.println("(false && true || true) = " + (false && true || true));
        System.out.println("(false && (true || true)) = " + (false && (true || true)));
        System.out.println("(false || true && true) = " + (false || true && true));
        
        //  (false && ..... ) = false
        //  (true  || ..... ) = true
        
        String nombre1 = "IDAT", nombre2 = "IDAT";
        System.out.println("(nombre1 == nombre2) = " + (nombre1 == nombre2));
        System.out.println("nombre1.equals(nombre2) = " + nombre1.equals(nombre2));
                //    0 1 2 3 4
        int arrA[] = {1,2,3,4,5};
        int arrB[] = {1,2,3,4,5};
        
        System.out.println("(arrA == arrB) = " + (arrA == arrB));
        //Los arreglos no se pueden comparar
        boolean valor9 = ( (arrA.length == arrB.length) && 
                (arrA[0]==arrB[0]) && (arrA[1]==arrB[1]) 
                && (arrA[2]==arrB[2]) && (arrA[3]==arrB[3]) && (arrA[4]==arrB[4]) );
        System.out.println("valor9 = " + valor9);
        
        boolean valor10 = true;
        System.out.println("valor10 = " + valor10);
        System.out.println("(valor10==true) = " + (valor10==true));
        
    }
    
}
