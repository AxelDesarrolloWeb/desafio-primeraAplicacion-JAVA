public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido(a) a Screen Match");
        System.out.println("Película: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3;
        // int valor = 10;
        // valor+= 5;

        System.out.println(media);
        // System.out.println(valor);

        String sinopsis = """
                Matrix es una paradoja
                La mejor película del fin del milenio
                Fué lanzada en:
                """ + fechaDeLanzamiento;
        System.out.println(sinopsis);



        String texto = "Joker ahahah!!!";
        if (texto.equals("kkpasomano")) {
            System.out.println("Acceso autorizado!");
        } else {
            System.out.println("texto incorrecto...");
        }


        String nombre = "Axel";
        int edad = 20;
        double valor = 77.9999;
        System.out.println(String.format("Mi nombre es %s, tengo %d años y hoy gasté %.2f dolares", nombre, edad, valor ));

        int aulas = 4;

        String mensaje = """
                Hola, %s
                Bienvenido al curso de Java
                Tendremos %d aulas para mostrarte lo que es necesario para que puedas dar tus primeros pasos en este lenguaje
                """.formatted(nombre, aulas);
        System.out.println(mensaje);

        int x = 10;
        double y = x; // casting implícito
        System.out.println(y);

        double c = 10.5;
        int v = (int) c; // casting explícito
        System.out.println(v);

        int clasificacion = (int) media / 2;
        System.out.println(clasificacion);


        String saludo = "Hola, mi nombre es";
        String nombre2 = "Axel";
        String continuacion = "y mi edad es";
        int edad2 = 20;

        String mensaje2 = """
                			%s %s %s %d
                """.formatted(saludo, nombre2, continuacion, edad2);
        System.out.println(mensaje2);

    }
}