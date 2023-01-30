package model1;

/**
 *
 * @author Juan Carlos Camayo
 */
public class DocenteParcial extends Docente{
    
    private String contrato;
    private String turno;

    public DocenteParcial() {
    }

    @Override
    public double calcularSueldo() {
        return super.calcularSueldo() * 1.1; 
    }

    /**
     * @return the contrato
     */
    public String getContrato() {
        return contrato;
    }

    /**
     * @param contrato the contrato to set
     */
    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    /**
     * @return the turno
     */
    public String getTurno() {
        return turno;
    }

    /**
     * @param turno the turno to set
     */
    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    
            
    
}
