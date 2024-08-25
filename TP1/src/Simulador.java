import java.util.EmptyStackException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Simulador {
    public static void main(String[] args) {
        // Crear un ExecutorService
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Crear fábricas de deportes
        DeporteFactory futbolFactory = new FutbolFactory();
        DeporteFactory basquetFactory = new BasquetFactory();
        DeporteFactory tenisFactory = new TenisFactory();

        // Crear deportes
        Deporte futbol = FutbolFactory.crearDeporte();
        Deporte basquet = BasquetFactory.crearDeporte();
        Deporte tenis = TenisFactory.crearDeporte();

        // Crear tareas para el fútbol
        Runnable futbolEstadisticas = new Estadisticas(futbol);

        // Crear tareas para el baloncesto
        Runnable basquetEstadisticas = new Estadisticas(basquet);

        // Crear tareas para el tenis
        Runnable tenisEstadisticas = new Estadisticas(tenis);

        // Enviar tareas al ExecutorService
        executorService.submit(futbolEstadisticas);

        executorService.submit(basquetEstadisticas);

        executorService.submit(tenisEstadisticas);

        // Cerrar el ExecutorService
        executorService.shutdown();
    }
}
