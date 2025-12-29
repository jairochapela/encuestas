package gal.jairochapela.encuestas.actions;

import java.lang.System.Logger;
import com.opensymphony.xwork2.ActionSupport;
import gal.jairochapela.encuestas.models.EncuestaSatisfaccion;

public class EncuestaSatisfaccionAction extends ActionSupport {
    
    /**
     * Objeto que contiene los datos de la encuesta de satisfacción,
     * tal como el usuario los ha introducido en el formulario.
     */
    private EncuestaSatisfaccion datos;

    

    @Override
    public String execute() throws Exception {
        // Mostrar los datos recibidos en consola
        Logger logger = System.getLogger(EncuestaSatisfaccionAction.class.getName());
        logger.log(System.Logger.Level.INFO, "Datos de la encuesta de satisfacción recibidos:");
        logger.log(System.Logger.Level.INFO, "Nombre: " + datos.getNombre());
        logger.log(System.Logger.Level.INFO, "Edad: " + datos.getEdad());
        logger.log(System.Logger.Level.INFO, "Sexo: " + datos.getSexo());
        logger.log(System.Logger.Level.INFO, "Puntuación: " + datos.getPuntuacion());
        logger.log(System.Logger.Level.INFO, "Grado de Satisfacción: " + datos.getGradoSatisfaccion());
        logger.log(System.Logger.Level.INFO, "Recomendar a Amigos: " + datos.isRecomendarAmigos());
        logger.log(System.Logger.Level.INFO, "Comentarios: " + datos.getComentarios());
        return SUCCESS;
    }



    public EncuestaSatisfaccion getDatos() {
        return datos;
    }



    public void setDatos(EncuestaSatisfaccion datos) {
        this.datos = datos;
    }


    
}
