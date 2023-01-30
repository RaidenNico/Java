package sellado;

import java.util.Arrays;
import org.junit.Assert;

/**
 *
 * @author Juan Carlos Camayo
 */
public class Test {
    
    public static void main(String[] args) {
        
        Eagle eagle = new Eagle();
        Assert.assertFalse(eagle.getClass().isSealed());//Eagle no esta sellado
        Assert.assertTrue(eagle.getClass().getSuperclass().isSealed()); //Bird sellado
        
        Class[] permits = eagle.getClass().getSuperclass().getPermittedSubclasses();
        Class eagleClass = eagle.getClass();
        
        Assert.assertTrue(Arrays.asList(permits).contains(eagleClass));
        
        Falcon falcon = new Falcon();
        Class falconClass = falcon.getClass();
        
        Assert.assertFalse(Arrays.asList(permits).contains(falconClass));
        
    }
    
}
