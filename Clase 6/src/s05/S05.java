package s05;

import java.util.ArrayList;

public class S05 {

    public static void main(String[] args) {
        // Iteraciones (bucles)
        // while, do while y for
        // for( INICIO ; CONDICION ; INCREMENTO )
        System.out.println("For simple");
        for(int i=0; i<3; i++)
        {
            System.out.print(i + ",");
        }
        /*
            int i = 0   Por primera y unica vez
            i<3         Segunda instrucion y de las siguientes repeticiones
            {}          Instruciones del bloque  (0,)
            i++         Incremento de variables  (i=1)
            i<3         Consulta para repeticiones (1<3)
            {}          Instruciones del bloque  (0,1)
            i++         Incremento de variables  (i=2)
            i<3         Consulta para repeticiones (2<3)
            {}          Instruciones del bloque  (0,1,2)
            i++         Incremento de variables  (i=3)
            i<3         Consulta para repeticiones (3<3)  = FALSE
            FIN DEL FOR
        */
        System.out.println("");
        System.out.println("For en reversa");
        for (int i=10; i > 0; i--) {
            System.out.print(i + ",");
        }
        System.out.println("");
        System.out.println("For con acumulador");
        for (int i = 0; i < 100; i+=10) {
            System.out.print(i + ",");
        }
        System.out.println("");
        System.out.println("For con 2 variables");
        for (int i = 10, j = 30; i <= 20; i++, j--) {
            System.out.println(i + "\t" + j);
        }
        System.out.println("=====WHILE=====");
        System.out.println("While simple");
        int x = 1;
        while(x<=5){
            System.out.print(x+",");
            x++;
        }
        System.out.println("");
        System.out.println("=====DO WHILE=====");
        int y = 5;
        do{
            System.out.println(y + ",");
            --y;
        }while(y>0);
        /*
            int y = 5;      Declaracion e inicio de "y"
            do{}            Instrucciones del bloque
                y--         Disminuye y = 4
            while           Consultamos para repetir (4>0) true
            do{}            Instrucciones del bloque
                y--         Disminuye y = 3
            while           Consultamos para repetir (3>0) true
            do{}            Instrucciones del bloque
                y--         Disminuye y = 2
            while           Consultamos para repetir (2>0) true
            do{}            Instrucciones del bloque
                y--         Disminuye y = 1
            while           Consultamos para repetir (1>0) true
            do{}            Instrucciones del bloque
                y--         Disminuye y = 0
            while           Consultamos para repetir (0>0) false
            FIN DEL DO WHILE
        */
        System.out.println("");
        
        int z = 0;
        do{
            System.out.println(z + ",");
            z--;
        }while(z>0);
        /*
            int z = 0;      Declaracion e inicio de "z"
            do{}            Instrucciones del bloque
                z--         Disminuye z = -1
            while           Consultamos para repetir (-1>0) false
            FIN DEL DO WHILE
        */        
        System.out.println("a = 1 y b = 1");
        System.out.println("PostIncremento a++");
        int a = 1;
        // a++   ***    a = a + 1
        System.out.println(a++);
        System.out.println(a);
        System.out.println("PreIncremento ++b");
        int b = 1;
        System.out.println(++b);
        System.out.println(b);
        
        System.out.println("=====CASUISTICA=====");
        System.out.println("break");
        for (int i = 0; i < 10; i++) {
            if(i==6) break;
            System.out.print(i+",");
        }
        System.out.println("");
        System.out.println("continue");
        for (int i = 0; i < 10; i++) {
            if(i==6) continue;
            System.out.print(i+",");
        }
        System.out.println("");
        
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Pedro");
        nombres.add("Rosa");
        nombres.add("Jose");
        nombres.add("Miguel");
        nombres.add("Gaby");
        
        String busca = "e";
        
        for (String nombre : nombres) {
            if(nombre.contains(busca))
                System.out.println(nombre);
        }
        
    }
    
}
