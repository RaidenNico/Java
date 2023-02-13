package ejercicio02;

public class Producto {

    private int id;
    private String nombre;
    private int cantidad;
    private double precioUnitario;

    // Inicio de contructor
    public Producto(int id, String nombre, int cantidad, double precioUnitario) { // Sirve para construir una nueva instancia de mi clase Producto
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public Producto() {
    }
    // Fin de Constructor

    // Metodos
    public double obtenerImportePagar() {
        return this.cantidad * this.precioUnitario;
    }

    public double obtenerImportePagarEnDolares(double tipoCambioDolares) {
        return this.obtenerImportePagar() * tipoCambioDolares;
    }

    // Inicio de Getters and Setts
    // Get = Traer
    // Set = Enviar
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    // Fin de Getters and Setts
    public void imprimir(double tipoDeCambio) {
        System.out.println("Producto{"
                + "id=" + id
                + ", nombre=" + nombre
                + ", cantidad=" + cantidad
                + ", precioUnitario=" + precioUnitario
                + ", totalEnDolares=" + this.obtenerImportePagarEnDolares(tipoDeCambio)
                + '}'
        );
    }

}
