package aula03;

public class ConversorTeste {
    public static void main(String[] args) {
        Conversor conversor = new Conversor();

        double celsius1 = 25.0;
        double celsius2 = 0.0;
        System.out.println(celsius1 + "°C = " + conversor.converter(celsius1) + "°F");
        System.out.println(celsius2 + "°C = " + conversor.converter(celsius2) + "°F");

        int horas1 = 2, minutos1 = 30;
        int horas2 = 1, minutos2 = 45;
        System.out.println(horas1 + "h " + minutos1 + "min = " + conversor.converter(horas1, minutos1) + " minutos");
        System.out.println(horas2 + "h " + minutos2 + "min = " + conversor.converter(horas2, minutos2) + " minutos");
    }
}
