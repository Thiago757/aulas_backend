package aula04;

public class testando {
    public static void main(String[] args) {
        teste1 obj = new teste1();

        int media = 7;
        int faltas = 20;
        int numero = 32;

        if (media >= obj.getValor() && faltas <= obj.getFaltas()) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }

        if (media < obj.getValor() || faltas > obj.getFaltas()) {
            System.out.println("Reprovado!");
        } else {
            System.out.println("Aprovado!");
        }

String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";

        System.out.println("O número " + numero + " é " + resultado);

        for (int i = 0; i < 5; i++){
            System.out.println("Índice: " + i);
        }
    }
}