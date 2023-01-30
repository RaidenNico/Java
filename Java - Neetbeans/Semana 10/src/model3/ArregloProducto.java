package model3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Juan Carlos Camayo
 */
public class ArregloProducto {

    private ArrayList<Producto> productos;

    public ArregloProducto() {
        productos = new ArrayList<Producto>();
        LoadData();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
    
    public void adicionar(Producto p){
        productos.add(p);
        SaveData();
    }
    
    public void eliminar(Producto p){
        productos.remove(p);
        SaveData();
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
    
    public void LoadData(){
        try{
            FileInputStream f = new FileInputStream("productos.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            productos = (ArrayList<Producto>) s.readObject();
            s.close();
        } catch(Exception e){
            productos = null;
        }finally{
            productos = (productos!=null)?productos:new ArrayList<Producto>();
        }
    }
    
    public void SaveData(){
        try{
            FileOutputStream f = new FileOutputStream("productos.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(productos);
            s.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
