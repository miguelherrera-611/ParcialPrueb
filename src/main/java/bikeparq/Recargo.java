package bikeparq;

public final class Recargo {

    private Recargo() {
    }

    public static int aplicarRecargoNocturno(int tarifa, int horaEntrada) {
        if (horaEntrada < 0 || horaEntrada > 23) {
            throw new IllegalArgumentException("La hora debe estar entre 0 y 23");
        }
        if (horaEntrada >= 20 || horaEntrada <= 5) {
            return tarifa + 2000;
        }
        return tarifa;
    }
}
