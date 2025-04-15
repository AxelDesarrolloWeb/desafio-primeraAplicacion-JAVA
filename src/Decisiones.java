public class Decisiones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = false;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";

        // código que prueba los operadores relacionales
        if (fechaDeLanzamiento >= 2022) {
            System.out.println("Peliculas más populares");
        } else {
            System.out.println("Película Retro que aún vale la pena ver");
        }

        if (incluidoEnElPlan && tipoPlan.equals("plus")) {
            System.out.println("Disfrute de su pelicula");
        } else {
            System.out.println("Película no disponible para su plan actual");
        }

        int dia = 10;
        switch (dia) {
            case 0:
                System.out.println("Es Domingo");
                break;
                case 1:
                    System.out.println("Es Lunes");
                    break;
                    case 2:
                        System.out.println("Es Miércoles");
                        break;
            default:
                System.out.println("\"El día especificado no es correcto\"");

        }
    }
}
