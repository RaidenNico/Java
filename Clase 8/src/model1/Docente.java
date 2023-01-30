
package model1;

/**
 *
 * @author Juan Carlos Camayo
 */
public class Docente extends Persona {
    private int horas;
    private double tarifa;

    public Docente() {
    }

    public double calcularSueldo(){
        return horas * tarifa;
    }
    
    /**
     * @return the horas
     */
    public int getHoras() {
        return horas;
    }

    /**
     * @param horas the horas to set
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }

    /**
     * @return the tarifa
     */
    public double getTarifa() {
        return tarifa;
    }

    /**
     * @param tarifa the tarifa to set
     */
    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
    
    
            
}
