import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        String resposta;

        System.out.println("--- Sistema de Cadastro de Nomes ---");

        do {
            System.out.print("\nDigite um nome para adicionar à lista: ");
            String novoNome = scanner.nextLine();

            nomes.add(novoNome);
            System.out.println("'" + novoNome + "' foi adicionado com sucesso!");

            System.out.print("Deseja adicionar outro nome? (Digite 'S' para sim ou qualquer outra tecla para não): ");
            resposta = scanner.nextLine();

        } while (resposta.equalsIgnoreCase("S"));

        System.out.println("\n--- Cadastro finalizado. ---");

        if (nomes.isEmpty()) {
            System.out.println("Nenhum nome foi adicionado.");
        } else {
            System.out.println("Nomes salvos na memória (" + nomes.size() + " no total):");
            for (String nomeSalvo : nomes) {
                System.out.println("- " + nomeSalvo);
            }
        }

        scanner.close();
    }
}