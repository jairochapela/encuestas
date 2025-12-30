package gal.jairochapela.encuestas.models;

public class EncuestaSatisfaccion {
    
    private String nombre;
    private String email;
    private int edad;
    private String sexo; // (M)asculino, (F)emenino, (O)tro
    private int puntuacion; // De 0 a 10
    private String gradoSatisfaccion; // Muy Insatisfecho, Insatisfecho, Neutral, Satisfecho, Muy Satisfecho
    private boolean recomendarAmigos;
    private String comentarios;

    public EncuestaSatisfaccion() {
        this.nombre = "";
        this.email = "";
        this.edad = 0;
        this.sexo = "";
        this.puntuacion = 0;
        this.gradoSatisfaccion = "";
        this.recomendarAmigos = false;
        this.comentarios = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getGradoSatisfaccion() {
        return gradoSatisfaccion;
    }

    public void setGradoSatisfaccion(String gradoSatisfaccion) {
        this.gradoSatisfaccion = gradoSatisfaccion;
    }

    public boolean isRecomendarAmigos() {
        return recomendarAmigos;
    }

    public void setRecomendarAmigos(boolean recomendarAmigos) {
        this.recomendarAmigos = recomendarAmigos;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "EncuestaSatisfaccion [nombre=" + nombre + ", email=" + email
                + ", edad=" + edad + ", sexo=" + sexo + ", puntuacion="
                + puntuacion + ", gradoSatisfaccion=" + gradoSatisfaccion + ", recomendarAmigos=" + recomendarAmigos
                + ", comentarios=" + comentarios + "]";
    }


    
}
