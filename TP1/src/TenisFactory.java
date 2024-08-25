public class TenisFactory implements DeporteFactory {
    @Override
    public Deporte crearDeporte() {
        return new Tenis();
    }
}
