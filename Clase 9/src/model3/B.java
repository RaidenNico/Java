
package model3;

/**
 *
 * @author Juan Carlos Camayo
 */
public class B extends A{
    
    // super-> A
    // this -> B
    
    public int k;

    public B(int k, int i, int j) {
        super(i, j);
        this.k = k;
    }

    @Override
    public int suma() {
        return super.suma() + k; 
    }
    
    public int suma_A(){
        return super.suma();
    }
    
    
}
