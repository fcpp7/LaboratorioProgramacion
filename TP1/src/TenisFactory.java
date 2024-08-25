public class TenisFactory implements DeporteFactory {
    @Override
    public Sport crearDeporte() {
        return new Tenis();
    }
}
