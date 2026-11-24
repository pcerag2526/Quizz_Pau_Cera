import java.util.ArrayList;
import java.util.Random; //Elige numeros aleatorios, asi puedo hacer preguntas alazar


public class BolsilloDePreguntas {

    // CATEGORÍA 1: CUIDADOS DIARIOS
    private static final Preguntas[] cuidadosDiarios = {

            crearPregunta("Cuidados diarios", "¿Qué necesita una mascota cada día?", "Comida, agua y cuidados", "Solo juguetes", "Nada", 'A'),
            crearPregunta("Cuidados diarios", "¿Con qué frecuencia debe pasear un perro?", "Nunca", "Todos los días", "Una vez al mes", 'B'),
            crearPregunta("Cuidados diarios", "¿Por qué es importante el agua fresca?", "Para jugar", "Para lavar juguetes", "Para mantenerse hidratado", 'C'),
            crearPregunta("Cuidados diarios", "¿Qué alimento es peligroso para los perros?", "Chocolate", "Comida específica para perros", "Pienso", 'A'),
            crearPregunta("Cuidados diarios", "¿Dónde debería dormir una mascota?", "En la calle", "En un lugar seguro y cómodo", "En cualquier lugar", 'B'),
            crearPregunta("Cuidados diarios", "¿Qué debes hacer con los excrementos de tu perro?", "Dejarlos en el suelo", "Ignorarlos", "Recogerlos", 'C'),
            crearPregunta("Cuidados diarios", "¿Por qué necesitan atención las mascotas?", "Por su bienestar emocional", "Para que no duerman", "Para que no coman", 'A'),
            crearPregunta("Cuidados diarios", "¿Cómo puedes entretener a tu mascota?", "Ignorándola", "Ofreciéndole juguetes y actividades", "No dejándola moverse", 'B'),
            crearPregunta("Cuidados diarios", "¿Por qué es importante cepillar a algunas mascotas?", "Para cambiar su color", "Para que duerman más", "Para mantener su higiene", 'C'),
            crearPregunta("Cuidados diarios", "¿Quién debe cuidar de una mascota?", "Su propietario o cuidador responsable", "Nadie", "Solo los vecinos", 'A')
    };


    // CATEGORÍA 2: ADOPCIÓN RESPONSABLE
    private static final Preguntas[] adopcionResponsable = {

            crearPregunta("Adopción responsable", "¿Dónde puedes adoptar un animal?", "En un supermercado", "En una protectora de animales", "En una juguetería", 'B'),
            crearPregunta("Adopción responsable", "¿Qué significa adoptar una mascota?", "Comprar un accesorio", "Conseguir un juguete", "Dar un hogar a un animal", 'C'),
            crearPregunta("Adopción responsable", "¿Por qué es importante adoptar en lugar de comprar?", "Das una segunda oportunidad a un animal", "No requiere responsabilidad", "Es una moda", 'A'),
            crearPregunta("Adopción responsable", "¿Qué debes tener en cuenta antes de adoptar?", "Solo su color", "Sus necesidades y tu estilo de vida", "Solo su tamaño", 'B'),
            crearPregunta("Adopción responsable", "¿Adoptar una mascota es un compromiso a largo plazo?", "No", "Solo durante una semana", "Sí", 'C'),
            crearPregunta("Adopción responsable", "¿Qué es una protectora de animales?", "Una organización que protege animales", "Una tienda de juguetes", "Un supermercado", 'A'),
            crearPregunta("Adopción responsable", "¿Qué debes hacer si no puedes cuidar de tu mascota?", "Abandonarla", "Pedir ayuda a un adulto o a una organización", "Dejarla en la calle", 'B'),
            crearPregunta("Adopción responsable", "¿Para qué sirve el microchip?", "Para alimentar al animal", "Para entrenarlo", "Para ayudar a identificarlo", 'C'),
            crearPregunta("Adopción responsable", "¿Qué debes hacer después de adoptar?", "Ayudar al animal a adaptarse a su nuevo hogar", "Olvidarte de él", "Dejarlo solo", 'A'),
            crearPregunta("Adopción responsable", "¿Cuál es el mejor motivo para adoptar?", "Seguir una moda", "Ofrecer un hogar a un animal que lo necesita", "Presumir", 'B')
    };


    private static Preguntas crearPregunta(String categoria, String enunciado,
                                           String opcionA, String opcionB,
                                           String opcionC, char correcta) {

        Respuesta[] respuestas = {

                new Respuesta('A', opcionA, correcta == 'A'),
                new Respuesta('B', opcionB, correcta == 'B'),
                new Respuesta('C', opcionC, correcta == 'C')

        };

        return new Preguntas(enunciado, categoria, respuestas);
    }


    // MÉTODOS PARA OBTENER LAS PREGUNTAS
    public static Preguntas[] obtenerCuidadosDiarios() {
        return cuidadosDiarios;
    }

    public static Preguntas[] obtenerAdopcionResponsable() {
        return adopcionResponsable;
    }

}
