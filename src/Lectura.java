import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el nombre de tu película favorita");
        String pelicula = teclado.nextLine();
        System.out.println("Ahora escribe la fecha de lanzamiento");
        int fechaDeLanzamiento = teclado.nextInt();
        System.out.println("Por último dinos que nota le das a la película");
        double nota = teclado.nextDouble();


        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(nota);

        System.out.println("¿Cuántos años tenés?");
        int edad = teclado.nextInt(); // <-- Lee solo el número.
        teclado.nextLine(); // <-- Limpia el Enter que quedó en el buffer.

        System.out.println("¿Cuál es tu nombre?");
        String nombre = teclado.nextLine(); // Ahora sí funciona bien.

        teclado.close();
    }
}