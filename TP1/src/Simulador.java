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

        // Crear deportes usando las fábricas
        Deporte futbol = futbolFactory.crearDeporte();
        Deporte basquet = basquetFactory.crearDeporte();
        Deporte tenis = tenisFactory.crearDeporte();

        // Crear tareas para los deportes
        Runnable futbolEstadisticas = new Estadisticas(futbol);
        Runnable basquetEstadisticas = new Estadisticas(basquet);
        Runnable tenisEstadisticas = new Estadisticas(tenis);

        // Enviar tareas al ExecutorService
        executorService.submit(futbolEstadisticas);
        executorService.submit(basquetEstadisticas);
        executorService.submit(tenisEstadisticas);

        // Cerrar el ExecutorService
        executorService.shutdown();
    }
}

