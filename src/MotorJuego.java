
import java.util.Scanner;
import java.util.Random;

public class MotorJuego {

    private Scanner teclado;
    private Random aleatorio;

    private int respuestasCorrectas;
    private int respuestasIncorrectas;

    public MotorJuego() {
        teclado = new Scanner(System.in);
        aleatorio = new Random();

        respuestasCorrectas = 0;
        respuestasIncorrectas = 0;
    }

    public Preguntas[] elegirCategoria() {

        System.out.println("ELIGE UNA CATEGORÍA");
        System.out.println("1. Cuidados diarios");
        System.out.println("2. Adopción responsable");

        System.out.print("Introduce una opción: ");
        int opcion = teclado.nextInt();

        if (opcion == 1) {
            return BolsilloDePreguntas.obtenerCuidadosDiarios();

        } else if (opcion == 2) {
            return BolsilloDePreguntas.obtenerAdopcionResponsable();

        } else {
            System.out.println("Opción no válida. Se seleccionará Cuidados diarios.");
            return BolsilloDePreguntas.obtenerCuidadosDiarios();
        }

    }

    public Preguntas[] seleccionarPreguntas(Preguntas[] preguntasDisponibles) {
        Preguntas[] seleccionadas = new Preguntas[5];
        boolean[] utilizadas = new boolean[preguntasDisponibles.length];
        for (int i = 0; i < seleccionadas.length; i++) {

            int posicion;
            do {
                posicion = aleatorio.nextInt(preguntasDisponibles.length);
            } while (utilizadas[posicion]);

            utilizadas[posicion] = true;

            seleccionadas[i] = preguntasDisponibles[posicion];

        }
        return seleccionadas;
    }

    public void mostrarPregunta(Preguntas pregunta) {

        System.out.println();
        System.out.println(pregunta.getTexto());

        Respuesta[] respuestas = pregunta.getRespuesta();
        for (int i = 0; i < respuestas.length; i++) {
            System.out.println(
                    respuestas[i].getLetra() + "." +
                            respuestas[i].getText()
            );
        }
    }

    public void comprobarRepsuesta(Preguntas pregunta) {

        System.out.print("Tu respuesta (A, B o C): ");
        char opcion = teclado.next().toUpperCase().charAt(0);

        Respuesta[] respuestas = pregunta.getRespuesta();

        for (int i = 0; i < respuestas.length; i++) {

            if (respuestas[i].getLetra() == opcion) {
                if (respuestas[i].isCorrecta()) {
                    System.out.println("¡Respuesta Correcta!");
                    respuestasCorrectas++;

                } else {
                    System.out.println("Respuesta Incorrecta");
                    respuestasIncorrectas++;
                }
                return;
            }
        }

    System.out.println(("Opcion No Valida"));

    }

    public void jugarPartida() {
        respuestasCorrectas = 0;
        respuestasCorrectas = 0;

        Preguntas[] categoria = elegirCategoria();

        Preguntas[] preguntasPartida = seleccionarPreguntas(categoria);

        for (int i = 0; i < preguntasPartida.length; i++) {

            System.out.println();
            System.out.println("Pregunta " + (i + 1));

            mostrarPregunta(preguntasPartida[i]);

            comprobarRepsuesta(preguntasPartida[i]);
        }
        System.out.println();
        System.out.println("Fin del Juego");
        System.out.println("Respuestas Correctas: " + respuestasCorrectas);
        System.out.println("Respuestas Incorrectas: " + respuestasIncorrectas);

        double porcentaje = calcularPorcentaje();

        System.out.println("Porcentaje de aciertos: " + porcentaje + "%");

    }

    public double calcularPorcentaje() {

        return (respuestasCorrectas * 100.0) / 5;
    }
}
