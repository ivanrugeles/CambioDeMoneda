public class COP extends Moneda {

    public COP(double cantidad) {
        super(cantidad, "COP");
    }

    @Override
    public double convertirAUSD() {
        double tasaDeCambio = ConvertidorDeMoneda.obtenerTasaDeCambio("COP");
        return cantidad * tasaDeCambio;
    }

    @Override
    public double convertirDeUSD() {
        double tasaDeCambio = ConvertidorDeMoneda.obtenerTasaDeCambio("COP");
        return cantidad/tasaDeCambio;
    }
}
