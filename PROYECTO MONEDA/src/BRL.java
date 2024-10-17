public class BRL extends Moneda {

    public BRL(double cantidad) {
        super(cantidad, "BRL");
    }

    @Override
    public double convertirAUSD() {
        double tasaDeCambio = ConvertidorDeMoneda.obtenerTasaDeCambio("BRL");
        return cantidad * tasaDeCambio;
    }

    @Override
    public double convertirDeUSD() {
        double tasaDeCambio = ConvertidorDeMoneda.obtenerTasaDeCambio("BRL");
        return cantidad/tasaDeCambio;
    }
}

