public class FutbolFactory implements DeporteFactory {
    @Override
    public Deporte crearDeporte() {
        return new Futbol();
    }
}
