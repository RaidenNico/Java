package model5;

/**
 *
 * @author Juan Carlos Camayo
 */
public abstract class Figura {

    int x, y;

    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public String ubicacion(){
        return x + " , " + y;
    }
    
    public abstract double area();
    
}
