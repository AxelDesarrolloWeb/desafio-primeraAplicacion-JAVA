import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nombreCliente = "Tony Stark";
        String tipoCuenta = "Corriente";
        double saldoDisponible = 1599.99;

        System.out.println(String.format(
                "**********************************\n" +
                        "Nombre del cliente: %s\n" +
                        "Tipo de cuenta: %s\n" +
                        "Saldo disponible: %.2f\n" +
                        "**********************************\n",
                nombreCliente, tipoCuenta, saldoDisponible
        ));

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n** Escriba el número de la opción deseada **");
            String opciones = """
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                4 - Salir
                """;
            System.out.println(opciones);

            String entrada = scanner.nextLine();

            if (entrada.isEmpty()) {
                System.out.println("⚠️  Debe ingresar al menos una opción.");
                continue;
            }

            int opcion;
            try {
                opcion = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("❌ Opción inválida. Ingrese un número válido.");
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.println("💰 El saldo actualizado es: $" + saldoDisponible);
                    break;

                case 2:
                    System.out.print("¿Cuál es el valor que deseas retirar?\n");
                    String retiroTexto = scanner.nextLine();
                    try {
                        double valorRetirar = Double.parseDouble(retiroTexto);
                        if (valorRetirar <= 0) {
                            System.out.println("❌ El valor debe ser mayor que 0.");
                        } else if (valorRetirar <= saldoDisponible) {
                            saldoDisponible -= valorRetirar;
                            System.out.println("✅ Retiro exitoso. Saldo restante: $" + saldoDisponible);
                        } else {
                            System.out.println("❌ Saldo insuficiente.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("❌ Ingrese un número válido para retirar.");
                    }
                    break;

                case 3:
                    System.out.print("¿Cuál es el valor que deseas depositar?\n");
                    String depositoTexto = scanner.nextLine();
                    try {
                        double valorDepositar = Double.parseDouble(depositoTexto);
                        if (valorDepositar <= 0) {
                            System.out.println("❌ El valor debe ser mayor que 0.");
                        } else {
                            saldoDisponible += valorDepositar;
                            System.out.println("✅ Depósito exitoso. Saldo actualizado: $" + saldoDisponible);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("❌ Ingrese un número válido para depositar.");
                    }
                    break;

                case 4:
                    System.out.println("👋 ¡Hasta luego!");
                    continuar = false;
                    break;

                default:
                    System.out.println("⚠️  Opción fuera de rango. Elija una entre 1 y 4.");
            }
        }

        scanner.close();
    }
}
