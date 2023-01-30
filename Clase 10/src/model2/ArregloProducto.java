package model2;

import java.util.ArrayList;

/**
 *
 * @author Juan Carlos Camayo
 */
public class ArregloProducto {

    private ArrayList<Producto> productos;

    public ArregloProducto() {
        productos = new ArrayList<Producto>();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
    
    public void adicionar(Producto p){
        productos.add(p);
    }
    
    public void eliminar(Producto p){
        productos.remove(p);
    }
    
    public Producto obtener(int pos){
        return productos.get(pos);
    }
    
    public Producto buscar(int codigo){
        for (Producto producto : productos) {
            if(producto.getCodigo() == codigo)
                return producto;
        }
        return null;
    }
    public int tamanio(){
        return productos.size();
    } 
    public double mayorPrecio(){
        if(tamanio()!=0){
            double max = productos.get(0).getPrecio();
            for (Producto producto : productos) {
                if(producto.getPrecio() > max){
                    max = producto.getPrecio();
                }
            }
            return max;
        }else{
            return Double.NaN;
        }
    }    
    public double menorPrecio(){
        if(tamanio()!=0){
            double min = productos.get(0).getPrecio();
            for (Producto producto : productos) {
                if(producto.getPrecio() < min){
                    min = producto.getPrecio();
                }
            }
            return min;
        }else{
            return Double.NaN;
        }
    }  
}
