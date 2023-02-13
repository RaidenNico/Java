
package model5;

/**
 *
 * @author Juan Carlos Camayo
 */
public class Circulo extends Figura{

    double radio;

    public Circulo(double radio, int x, int y) {
        super(x, y);
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio; 
    }
    
    
    
}
