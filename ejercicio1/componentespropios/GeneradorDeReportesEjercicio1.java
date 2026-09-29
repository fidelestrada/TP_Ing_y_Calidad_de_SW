package ejercicio1.componentespropios;

import des.ContadoresEstadisticos;
import des.GeneradorDeReportes;

public class GeneradorDeReportesEjercicio1 extends GeneradorDeReportes {

    @Override
    public void run(ContadoresEstadisticos contadores) {
        ContadoresEstadisticosEjercicio1 c = (ContadoresEstadisticosEjercicio1) contadores;
        System.out.println("------------------------------------------------------");
        System.out.println("*** REPORTE FINAL");
        System.out.println("------------------------------------------------------");
        System.out.println("Solicitudes procesadas: " + c.getCantidadProcesadas());
    }
}
