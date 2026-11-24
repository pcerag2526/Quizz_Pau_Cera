public class Preguntas {

    private String texto;
    private String categoria;
    private Respuesta[] respuestas;

    public Preguntas(String texto, String categoria, Respuesta[] respuestas) {
        this.texto = texto;
        this.categoria = categoria;
        this.respuestas = respuestas;

    }
    public String getTexto() {
        return texto;
    }

    public String getCategoria() {
        return categoria;
    }

    public Respuesta[] getRespuesta() {
        return respuestas;
    }
    }

