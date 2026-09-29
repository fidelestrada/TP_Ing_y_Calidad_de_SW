package ejercicio1.componentespropios;

import des.ContadoresEstadisticos;

public class ContadoresEstadisticosEjercicio1 extends ContadoresEstadisticos {

    private int cantidadProcesadas;

    @Override
    public void inicializar() {
        cantidadProcesadas = 0;
    }

    public void actualizarCantProcesadas() {
        cantidadProcesadas++;
    }

    public int getCantidadProcesadas() {
        return cantidadProcesadas;
    }

    public void setCantidadProcesadas(int cantidadProcesadas) {
        this.cantidadProcesadas = cantidadProcesadas;
    }
}
// correccion bug