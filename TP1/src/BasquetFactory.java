public class BasquetFactory implements DeporteFactory {
    @Override
    public Sport crearDeporte() {
        return new Basquet();
    }
}
