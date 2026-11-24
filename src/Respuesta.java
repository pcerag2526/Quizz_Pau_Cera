public class Respuesta {

    private char letra;
    private String texto;
    private boolean correcto;

    public Respuesta(char letra, String texto, boolean correcto) {
        this.letra = letra;
        this.texto = texto;
        this.correcto = correcto;
    }
    public char getLetra() {
        return letra;
    }
    public String getText() {
        return texto;
    }
    public boolean isCorrecta(){
        return correcto;
    }

}
