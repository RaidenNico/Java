package pe.edu.idat.model;

public class Ejercicio01Form {
  private int cantidad;
  private double precio;
  
  public Ejercicio01Form() {
		super();
		// TODO Auto-generated constructor stub
	}

  public Ejercicio01Form(int cantidad, double precio) {
    super();
    this.cantidad = cantidad;
    this.precio = precio;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }
}
