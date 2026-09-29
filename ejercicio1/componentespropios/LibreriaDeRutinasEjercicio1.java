package ejercicio1.componentespropios;

import java.util.concurrent.ThreadLocalRandom;
import des.LibreriaDeRutinas;

public class LibreriaDeRutinasEjercicio1 extends LibreriaDeRutinas {

    private static final double MEDIA_ENTRE_ARRIBOS = 1.91;
    private static final double PROCESAMIENTO_MIN = 0.5;
    private static final double PROCESAMIENTO_MAX = 2.5;

    /** Tiempo entre arribos ~ Exponencial(media = 1.91 min). */
    public double tiempoEntreArribosSolicitudes() {
        double r = ThreadLocalRandom.current().nextDouble();
        return -MEDIA_ENTRE_ARRIBOS * Math.log(1.0 - r);
    }

    /** Clase de solicitud: 1, 2, 3 o 4 con igual probabilidad.
     *  El enunciado no especifica otra distribución para las clases. */
    public int claseDeSolicitud() {
        return ThreadLocalRandom.current().nextInt(1, 5);
    }

    /** Tiempo de procesamiento ~ Uniforme(0.5, 2.5) min. */
    public double tiempoDeProcesamiento() {
        double r = ThreadLocalRandom.current().nextDouble();
        return PROCESAMIENTO_MIN + (PROCESAMIENTO_MAX - PROCESAMIENTO_MIN) * r;
    }
}
