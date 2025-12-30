package gal.jairochapela.encuestas.actions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import gal.jairochapela.encuestas.models.EncuestaSatisfaccion;

public class ResultadosAction extends ActionSupport {

    private List<EncuestaSatisfaccion> resultados;

    public ResultadosAction() {
        // Creación de lista de resultados inicialmente vacía
        this.resultados = new ArrayList<>();
    }

    public List<EncuestaSatisfaccion> getResultados() {
        return resultados;
    }

    public void setResultados(List<EncuestaSatisfaccion> resultados) {
        this.resultados = resultados;
    }



    @Override
    public String execute() throws Exception {
        // Lectura del archivo de encuesta
        try (BufferedReader reader = new BufferedReader(new FileReader("encuestas_satisfaccion.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                EncuestaSatisfaccion encuesta = new EncuestaSatisfaccion();
                encuesta.setNombre(reader.readLine());
                encuesta.setEmail(reader.readLine());
                encuesta.setEdad(Integer.parseInt(reader.readLine()));
                encuesta.setSexo(reader.readLine());
                encuesta.setPuntuacion(Integer.parseInt(reader.readLine()));
                encuesta.setGradoSatisfaccion(reader.readLine());
                encuesta.setRecomendarAmigos(Boolean.parseBoolean(reader.readLine()));
                String comment;
                while ((comment = reader.readLine()) != null && !comment.equals("---")) {
                    encuesta.setComentarios(encuesta.getComentarios() + "\n" + comment);
                }
                // Leer la línea separadora "---"
                //reader.readLine();
                resultados.add(encuesta);
            }
        } catch (java.io.IOException e) {
            addActionError("Error al leer los resultados de la encuesta: " + e.getMessage());
            return ERROR;
        }
        return SUCCESS;
    }
    

    
}
