public class FutbolFactory implements DeporteFactory {
    @Override
    public Sport crearDeporte() {
        return new Futbol();
    }
}
