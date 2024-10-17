import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Convertidor de Moneda ---");
            System.out.println("1. Convertir de Peso Argentino(ARS) -------> Dólar(USD)");
            System.out.println("2. Convertir de Real Brazileño(BRL) -------> Dólar(USD)");
            System.out.println("3. Convertir de Peso Colombiano(COP) ------> Dólar(USD)");
            System.out.println("4. Convertir de Dólar(USD) ========> Peso Argentino(ARS)");
            System.out.println("5. Convertir de Dólar(USD) ========> Brazileño(BRL)");
            System.out.println("6. Convertir de Dólar(USD) ========> Peso Colombiano(COP)");
            System.out.println("7. Salir");
            System.out.print("Selecciona una opción: ");

            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa la cantidad en ARS: ");
                    double cantidadARS = sc.nextDouble();
                    ARS pesosArgentinos = new ARS(cantidadARS);
                    pesosArgentinos.imprimirConversion();
                    break;

                case 2:
                    System.out.print("Ingresa la cantidad en BRL: ");
                    double cantidadBRL = sc.nextDouble();
                    BRL realesBrasileños = new BRL(cantidadBRL);
                    realesBrasileños.imprimirConversion();
                    break;

                case 3:
                    System.out.print("Ingresa la cantidad en COP: ");
                    double cantidadCOP = sc.nextDouble();
                    COP pesosColombianos = new COP(cantidadCOP);
                    pesosColombianos.imprimirConversion();
                    break;

                case 4:
                    System.out.print("Ingresa la cantidad en USD: ");
                    double cantidadUSD = sc.nextDouble();
                    ARS pesosArgentinosDeUSD = new ARS(cantidadUSD);
                    pesosArgentinosDeUSD.imprimirConversionDeUSD();
                    break;

                case 5:
                    System.out.print("Ingresa la cantidad en USD: ");
                    cantidadUSD = sc.nextDouble();
                    BRL realesBrasileñosDeUSD = new BRL(cantidadUSD);
                    realesBrasileñosDeUSD.imprimirConversionDeUSD();
                    break;

                case 6:
                    System.out.print("Ingresa la cantidad en USD: ");
                    cantidadUSD = sc.nextDouble();
                    COP pesosColombianosDeUSD = new COP(cantidadUSD);
                    pesosColombianosDeUSD.imprimirConversionDeUSD();
                    break;

                case 7:
                    System.out.println("¡Hasta luego!");
                    sc.close();
                    return;

                default:
                    System.out.println("Opción inválida. Intenta nuevamente.");
                    break;
            }
        }
    }
}
