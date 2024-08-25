public class Estadisticas implements Runnable {
    private final Deporte deporte;

    public Estadisticas(Deporte deporte) {
        this.deporte = deporte;
    }

    @Override
    public void run() {
        System.out.println("Calculando las estadísticas del partido de " + deporte);
    }
}
