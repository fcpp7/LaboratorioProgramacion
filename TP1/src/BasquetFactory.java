public class BasquetFactory implements DeporteFactory {
    @Override
    public Deporte crearDeporte() {
        return new Basquet();
    }
}
