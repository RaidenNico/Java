package model5;

/**
 *
 * @author Juan Carlos Camayo
 */
public class Cuadrado extends Figura{
    double lado;

    public Cuadrado(double lado, int x, int y) {
        super(x, y);
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }
    
}
