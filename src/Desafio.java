import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nombreCliente = "Tony Stark";
        String tipoCuenta = "Corriente";
        Double saldoDisponible = 1599.99;



        System.out.println(String.format(
                "**********************************\n" +
                        "Nombre del cliente: %s\n" +
                        "Tipo de cuenta: %s\n" +
                        "Saldo disponible: %.2f\n" +
                        "**********************************\n",
                nombreCliente, tipoCuenta, saldoDisponible
        ));

        Scanner numero = new Scanner(System.in);
        System.out.print("** Escriba el número de la opción deseada **\n");
        String opciones = """
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                4 - Salir
                """;
        System.out.println(opciones);

        int opcionIngresada = numero.nextInt();

        switch (opcionIngresada) {
            case 1:
                System.out.println("El saldo actualizado es: " + saldoDisponible + " $");
                break;
                    case 2:
                            System.out.print("¿Cuál es el valor que deseas retirar?\n");
                            double valorRetirar = numero.nextDouble();
                        if (valorRetirar < saldoDisponible) {
                            Double retirarSaldo = saldoDisponible - valorRetirar;
                            System.out.println("Saldo restante: " + retirarSaldo);
                        } else {
                            System.out.println("Saldo insuficiente");
                        }
                        break;
                        case 3:
                            System.out.print("¿Cuál es el valor que deseas depositar?\n");
                            double valorDepositar = numero.nextDouble();

                            if (valorDepositar > 0 ) {
                                Double depositarSaldo = saldoDisponible + valorDepositar;
                                System.out.println("Saldo restante: " + depositarSaldo);
                            } else {
                                System.out.println("Valor insuficiente");
                            }

                            break;
                            case 4:
                                numero.close();
                                break;
            default:
                System.out.println("Debe escribir una opción válida");

        }
    }
}