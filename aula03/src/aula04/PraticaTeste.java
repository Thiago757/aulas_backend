package aula04;

public class PraticaTeste {

    public static void main(String[] args) {

        Pratica01 vetor = new Pratica01(7);

        vetor.inserir("R");
        vetor.inserir("O");
        vetor.inserir("D");
        vetor.inserir("R");
        vetor.inserir("I");
        vetor.inserir("G");
        vetor.inserir("O");

        System.out.println("--- Vetor Após Inserções ---");
        vetor.imprime();
        System.out.println("-----------------------------\n");

        System.out.println("--- Resultados da Pesquisa ---");
        int pesquisa_1 = vetor.pesquisa_linear("R");
        int pesquisa_2 = vetor.pesquisa_linear("D");
        int pesquisa_3 = vetor.pesquisa_linear("G");
        System.out.println("Posição de 'R': " + pesquisa_1);
        System.out.println("Posição de 'D': " + pesquisa_2);
        System.out.println("Posição de 'G': " + pesquisa_3);
        System.out.println("------------------------------\n");

        vetor.excluir("R");
        vetor.excluir("D");
        vetor.excluir("G");

        System.out.println("--- Vetor Após Exclusões ---");
        vetor.imprime();
        System.out.println("----------------------------");

    }
}