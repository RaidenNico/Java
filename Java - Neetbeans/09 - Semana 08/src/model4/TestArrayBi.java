package model4;

/**
 *
 * @author Juan Carlos Camayo
 */
public class TestArrayBi {
    
    public static void main(String[] args) {
        
        int n[][] = new int[3][4];
        int [] x0 = {10, 20, 30, 40};
        n[0] = x0;
        
        n[1][0] = 51;
        n[1][1] = 52;
        n[1][2] = 53;
        n[1][3] = 54;
        
        n[2][2] = 60;
        
        System.out.println("n.length = " + n.length);
        System.out.println("n[0].length = " + n[0].length);
             
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                String valor = (n[i][j] == 0) ? "00" : ""+n[i][j];
                System.out.print(valor + " ");
            }
            System.out.println();
        }
        
    }
    
}
