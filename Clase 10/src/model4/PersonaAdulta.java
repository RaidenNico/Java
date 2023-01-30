package model4;

/**
 *
 * @author Juan Carlos Camayo
 */
public class PersonaAdulta {
    private String nombre;
    private int edad;

    public PersonaAdulta(String nombre, int edad) throws Exception {
        this.nombre = nombre;
        if(edad < 18)
            throw new Exception("No es adulta la persona " + nombre + " porque tiene " + edad + " años.");
        this.edad = edad;
        //fijarEdad(edad);
    }
    
   public void fijarEdad(int edad) throws Exception{
        if(edad < 18)
            throw new Exception("No es adulta la persona " + nombre + " porque tiene " + edad + " años.");
        this.edad = edad;
   }
   
   public void imprimir(){
       System.out.println(nombre + " - " + edad);
   }
   
    public static void main(String[] args) {
        try{
            PersonaAdulta per = new PersonaAdulta("Ana", 50);
            per.imprimir();
            per.fijarEdad(10);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            System.out.println("Proceso finalizado.");
        }
    }
   
}
