public abstract class Moneda {
    protected double cantidad;
    protected String nombre;

    public Moneda(double cantidad, String nombre) {
        this.cantidad = cantidad;
        this.nombre = nombre;
    }


    public abstract double convertirAUSD();


    public abstract double convertirDeUSD();


    public void imprimirConversion() {
        System.out.println(cantidad + " " + nombre + " equivale a " + convertirAUSD() + " USD.");

    }


    public void imprimirConversionDeUSD() {
        System.out.println(cantidad + " USD equivale a " + convertirDeUSD() + " " + nombre + ".");
    }
}

