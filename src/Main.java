import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        // 1. Inicializa as ferramentas que vamos usar
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>(); // Lista dinâmica para guardar os nomes
        String resposta; // Variável para guardar a resposta do usuário (S/N)

        System.out.println("--- Sistema de Cadastro de Nomes ---");

        // 2. Inicia um laço que executa pelo menos uma vez
        do {
            // Pede e lê um novo nome
            System.out.print("\nDigite um nome para adicionar à lista: ");
            String novoNome = scanner.nextLine();

            // Adiciona o nome lido à lista na memória
            nomes.add(novoNome);
            System.out.println("'" + novoNome + "' foi adicionado com sucesso!");

            // Pergunta ao usuário se deseja continuar
            System.out.print("Deseja adicionar outro nome? (Digite 'S' para sim ou qualquer outra tecla para não): ");
            resposta = scanner.nextLine();

        } while (resposta.equalsIgnoreCase("S")); // 3. O laço continua apenas se a resposta for "S" ou "s"

        // 4. Quando o laço termina, exibe os resultados
        System.out.println("\n--- Cadastro finalizado. ---");

        if (nomes.isEmpty()) {
            System.out.println("Nenhum nome foi adicionado.");
        } else {
            System.out.println("Nomes salvos na memória (" + nomes.size() + " no total):");
            // Itera pela lista e imprime cada nome salvo
            for (String nomeSalvo : nomes) {
                System.out.println("- " + nomeSalvo);
            }
        }

        // 5. Fecha o scanner para liberar recursos
        scanner.close();
    }
}