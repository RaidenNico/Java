package pkgfinal;

public class UsuarioTinka {

    private int id;
    private String Nombres;
    private String Correo;
    private int Puntos;
    
    public UsuarioTinka(){
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the Nombres
     */
    public String getNombres() {
        return Nombres;
    }

    /**
     * @param Nombres the Nombres to set
     */
    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    /**
     * @return the Correo
     */
    public String getCorreo() {
        return Correo;
    }

    /**
     * @param Correo the Correo to set
     */
    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    /**
     * @return the Puntos
     */
    public int getPuntos() {
        return Puntos;
    }

    /**
     * @param Puntos the Puntos to set
     */
    public void setPuntos(int Puntos) {
        this.Puntos = Puntos;
    }

}
