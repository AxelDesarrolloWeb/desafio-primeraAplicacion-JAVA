public class Temperaturas {
    public static void main(String[] args) {
        double temperaturaCelsius = 20.6;

        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        // double temperaturaFahrenheit = conversorTemperatura; no hace falta

        System.out.println(String.format("La temperatura en Celsius es %.1f°C, por lo tanto la conversión a Fahrenheit es %.1f°F", temperaturaCelsius ,temperaturaFahrenheit));

        int temperaturaFarenheitEntera = (int) temperaturaFahrenheit;
        System.out.println("La temperatura en Fahrenheit entera es: " + temperaturaFarenheitEntera + "°F");


    }
}