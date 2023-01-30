package model;

/**
 *
 * @author Juan Carlos Camayo
 */
public class Persona{ //extends Object
     
    /* Modificadores
        private, protected, public, (default)
    */   
    //Atributos
    private String nombre;
    private String apellido;
    private double nota;

    //Constructor
    public Persona(){
        nombre = "INICIALIZADO";
    }

    public Persona(String nombre, String apellido, double nota) {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setNota(nota); 
    }
    
    public Persona(String nombre, String apellido, double nota1, double nota2) {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setNota((nota1+nota2)/2); 
    }
    
    public Persona(String nombre, String apellido, double nota1, double nota2, double nota3) {
        this(nombre, apellido, ((nota1+nota2+nota3)/3));
    }
    
    //Metodos
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        if(apellido.trim().equals(""))
        {
            this.apellido = "SIN_REGISTRO";
        }
        else{
            this.apellido = apellido;
        }
    }

    /**
     * @return the nota
     */
    public double getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(double nota) {
        this.nota = (nota>20 || nota<0)? -1 : nota;
    }
    
    public void imprimir(){
        System.out.println("persona.getNombre() = " + this.getNombre());
        System.out.println("persona.getApellido() = " + this.getApellido());
        System.out.println("persona.getNota() = " + this.getNota());
        System.out.println("------------------------------------------------");
    }

    @Override
    public String toString() {
        return "\nnombre:\t\t" + this.getNombre() +
               "\napellido:\t" + this.getApellido() +
               "\nnota\t\t" + this.getNota();
        //return super.toString(); 
    }
    
    
    
}
