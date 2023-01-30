package model;

/**
 *
 * @author Juan Carlos Camayo
 */
public class VentanaTitulo extends Ventana{
    protected String titulo;
    
    public VentanaTitulo() {
        super();
    }
    
    public VentanaTitulo(String titulo, int x, int y, int ancho, int alto)
    {
        super(x, y, ancho, alto);
        this.titulo = titulo;
    }
    
    public VentanaTitulo(int x, int y, int ancho, int alto)
    {
        super(x, y, ancho, alto);
        this.titulo = "";
    }
    
    public void desplazar(int dx, int dy){
        x += dx;
        y += dy;
    }

    @Override
    public void mostrar() {
        super.mostrar(); 
        System.out.println("titulo:\t" + titulo);
    }
    
    

    
}
