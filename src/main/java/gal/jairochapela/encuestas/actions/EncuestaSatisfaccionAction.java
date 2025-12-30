package gal.jairochapela.encuestas.actions;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.System.Logger;
import java.sql.Date;

import com.opensymphony.xwork2.ActionSupport;
import gal.jairochapela.encuestas.models.EncuestaSatisfaccion;

public class EncuestaSatisfaccionAction extends ActionSupport {
    
    /**
     * Objeto que contiene los datos de la encuesta de satisfacción,
     * tal como el usuario los ha introducido en el formulario.
     */
    private EncuestaSatisfaccion datos;

    
    /**
     * Método que se ejecuta al procesar el formulario de la encuesta de satisfacción.
     */
    @Override
    public String execute() throws Exception {
        // Mostrar los datos recibidos en consola
        Logger logger = System.getLogger(EncuestaSatisfaccionAction.class.getName());
        logger.log(System.Logger.Level.INFO, "Datos de la encuesta de satisfacción recibidos: " + datos);

        // Añadimos la información a un fichero de texto
        try (FileWriter writer = new FileWriter("encuestas_satisfaccion.txt", true)) {
            PrintWriter printwr = new PrintWriter(writer);
            printwr.println(new Date(System.currentTimeMillis()).toString());
            printwr.println(datos.getNombre());
            printwr.println(datos.getEmail());
            printwr.println(datos.getEdad());
            printwr.println(datos.getSexo());
            printwr.println(datos.getPuntuacion());
            printwr.println(datos.getGradoSatisfaccion());
            printwr.println(datos.isRecomendarAmigos());
            printwr.println(datos.getComentarios());
            printwr.println("---");
        } catch (java.io.IOException e) {
            logger.log(System.Logger.Level.ERROR, "Error al escribir los datos de la encuesta en el fichero: " + e.getMessage());
            addActionError("Se produjo un error al procesar la encuesta. Por favor, inténtelo de nuevo más tarde.");
            return ERROR;
        }

        return SUCCESS;
    }


    

    /**
     * Este método sirve para validar los datos del formulario antes de ejecutar el método execute().
     * Es importante asegurarse de que los datos introducidos por el usuario son correctos y completos,
     * evitando que el usuario envíe información incosistente o errónea.
     * En caso de encontrar errores, añadiremos mensajes de error que serán mostrados al usuario.
     */
    @Override
    public void validate() {
        if (datos.getEdad() <= 0 || datos.getEdad() > 120) {
            addFieldError("datos.edad", "La edad debe ser un número válido entre 1 y 120.");
        }
        if (datos.getPuntuacion() < 1 || datos.getPuntuacion() > 10) {
            addFieldError("datos.puntuacion", "La puntuación debe estar entre 1 y 10.");
        }
        //TODO: Simplificar esta condición
        if (datos.getGradoSatisfaccion() == null || datos.getGradoSatisfaccion().isEmpty() ||
            !(datos.getGradoSatisfaccion().equals("1") || datos.getGradoSatisfaccion().equals("2") ||
              datos.getGradoSatisfaccion().equals("3") || datos.getGradoSatisfaccion().equals("4") ||
              datos.getGradoSatisfaccion().equals("5"))) {
            addFieldError("datos.gradoSatisfaccion", "Debe seleccionar un grado de satisfacción entre Muy Insatisfecho y Muy Satisfecho.");
        }
    }





    public EncuestaSatisfaccion getDatos() {
        return datos;
    }



    public void setDatos(EncuestaSatisfaccion datos) {
        this.datos = datos;
    }


    
}
