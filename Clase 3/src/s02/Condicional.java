package s02;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.*;

/**
 *
 * @author Juan Carlos Camayo
 */
public class Condicional {
    
    public static void main(String[] args) {
        System.out.println("Condicional==========");
        int nroBoleto = 123456;
        int nroGanador = 123456;
        
        System.out.println("Inicio de sorteo");
        if(nroGanador == nroBoleto)
        {
            System.out.println("Has obtenido un premio");
        }
        
        double premio;
        if(nroGanador == nroBoleto){    //SI...
            premio = 1000;              //entonces
        }else {                         //sino
            premio = 0;                 //...
        }
        System.out.println("premio = " + premio);
        double pre = (nroGanador==nroBoleto)?1000:0;
        System.out.println("pre = " + pre);
        System.out.println("Fin del sorteo");
        
        Calendar c = new GregorianCalendar();
        c.setTime(new Date());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.MONTH) + 1);
        System.out.println(c.get(Calendar.YEAR));
        
        int diaSem = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        //Domingo = 1 ...
        String dia = "";
        if(diaSem == 1){
            dia = "Domingo";
        }else{
            if(diaSem == 2){
                dia = "Lunes";
            }else if(diaSem == 3){
                dia = "Martes";
            }else if(diaSem == 4){
                dia = "Miercoles";
            }else if(diaSem == 5){
                dia = "Jueves";
            }else if(diaSem == 6){
                dia = "Viernes";
            }else if(diaSem == 7){
                dia = "Sabado";
            }else{
                dia = "--";
            }
        }
        System.out.println("(1) dia = " + dia);
        switch (diaSem) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Lunes";
                break;
            case 3: dia = "Martes"; break;
            case 4: dia = "Miercoles"; break;
            case 5: dia = "Jueves"; break;
            case 6: dia = "Viernes"; break;
            case 7: dia = "Sabado"; break;
            default:
                dia = "--";
        }
        System.out.println("(2) dia = " + dia);
        
        int anio = c.get(Calendar.YEAR);
        int mes = c.get(Calendar.MONTH) + 1;
        int numDias=0;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: numDias = 31; break;
            case 4:
            case 6:
            case 9:
            case 11: numDias = 30; break;
            case 2:
                if( ( (anio%4 == 0) && !(anio%100 == 0) ) || (anio%400==0) )
                    numDias = 29;
                else
                    numDias = 28;
            default:
                System.out.println("Este mes no existe");
        }
        
        Month _month = Month.of(mes);
        String _mes = _month.getDisplayName(TextStyle.FULL, new Locale("es","ES"));
        System.out.println("_mes = " + _mes);
        
        System.out.printf("El mes %s del año %d tiene %d dias.\n", 
                _mes, anio, numDias);
        
    }
    
}
