import java.util.Scanner;
import java.util.ArrayList;

public class Desafio {
    public static void main(String[] args) {
        String nombreCliente = "Tony Stark";
        String tipoCuenta = "Corriente";
        double saldoDisponible = 1599.99;
        ArrayList<String> historial = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int opcionIngresada = 0;

        System.out.println(String.format(
                "**********************************\n" +
                        "Nombre del cliente: %s\n" +
                        "Tipo de cuenta: %s\n" +
                        "Saldo disponible: %.2f\n" +
                        "**********************************\n",
                nombreCliente, tipoCuenta, saldoDisponible
        ));

        while (true) {
            System.out.println("""
                    ** Escriba el número de la opción deseada **
                    1 - Consultar saldo
                    2 - Retirar
                    3 - Depositar
                    4 - Ver historial de movimientos
                    5 - Salir
                    """);

            if (scanner.hasNextInt()) {
                opcionIngresada = scanner.nextInt();
                scanner.nextLine(); // consumir salto de línea

                switch (opcionIngresada) {
                    case 1:
                        System.out.printf("El saldo actualizado es: %.2f $\n", saldoDisponible);
                        historial.add("Consultó saldo: " + saldoDisponible);
                        break;
                    case 2:
                        System.out.print("¿Cuál es el valor que deseas retirar? ");
                        if (scanner.hasNextDouble()) {
                            double valorRetirar = scanner.nextDouble();
                            scanner.nextLine(); // consumir salto de línea
                            if (valorRetirar > 0 && valorRetirar <= saldoDisponible) {
                                saldoDisponible -= valorRetirar;
                                System.out.printf("Saldo restante: %.2f\n", saldoDisponible);
                                historial.add("Retiró: -" + valorRetirar + " | Nuevo saldo: " + saldoDisponible);
                            } else {
                                System.out.println("Monto inválido o saldo insuficiente.");
                            }
                        } else {
                            System.out.println("Por favor, ingrese un número válido.");
                            scanner.nextLine(); // limpiar entrada incorrecta
                        }
                        break;
                    case 3:
                        System.out.print("¿Cuál es el valor que deseas depositar? ");
                        if (scanner.hasNextDouble()) {
                            double valorDepositar = scanner.nextDouble();
                            scanner.nextLine(); // consumir salto de línea
                            if (valorDepositar > 0) {
                                saldoDisponible += valorDepositar;
                                System.out.printf("Saldo actualizado: %.2f\n", saldoDisponible);
                                historial.add("Depositó: +" + valorDepositar + " | Nuevo saldo: " + saldoDisponible);
                            } else {
                                System.out.println("Debe ingresar un monto mayor a 0.");
                            }
                        } else {
                            System.out.println("Por favor, ingrese un número válido.");
                            scanner.nextLine(); // limpiar entrada incorrecta
                        }
                        break;
                    case 4:
                        System.out.println("=== Historial de movimientos ===");
                        if (historial.isEmpty()) {
                            System.out.println("Aún no hay movimientos registrados.");
                        } else {
                            for (String movimiento : historial) {
                                System.out.println(movimiento);
                            }
                        }
                        break;
                    case 5:
                        System.out.println("Gracias por utilizar nuestros servicios. ¡Hasta pronto!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Opción inválida. Por favor, elige entre 1 y 5.");
                }
            } else {
                System.out.println("Debes ingresar un número válido.");
                scanner.nextLine(); // limpiar entrada incorrecta
            }
        }
    }
}
