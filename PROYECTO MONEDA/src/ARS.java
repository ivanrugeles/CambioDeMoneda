public class ARS extends Moneda {

    public ARS(double cantidad) {
        super(cantidad, "ARS");
    }

    @Override
    public double convertirAUSD() {
        double tasaDeCambio = ConvertidorDeMoneda.obtenerTasaDeCambio("ARS");
        return  cantidad*tasaDeCambio;
    }

    @Override
    public double convertirDeUSD() {
        double tasaDeCambio = ConvertidorDeMoneda.obtenerTasaDeCambio("ARS");
        return  cantidad/tasaDeCambio;
    }
}
