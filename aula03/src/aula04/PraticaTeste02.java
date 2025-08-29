package aula04;

public class PraticaTeste02 {
    public static void main(String[] args) {
        Pratica02 lista = new Pratica02();

        System.out.println("--- 1. Mostrando a lista vazia ---");
        lista.mostrar();
        System.out.println("----------------------------------\n");

        System.out.println("--- 2. Inserindo 'r', 'o', 'd', 'r', 'i', 'g', 'o' ---");
        lista.insereInicio('r');
        lista.insereInicio('o');
        lista.insereInicio('d');
        lista.insereInicio('r');
        lista.insereInicio('i');
        lista.insereInicio('g');
        lista.insereInicio('o');
        lista.mostrar();
        System.out.println("----------------------------------------------------\n");

        System.out.println("--- 3. Excluindo a primeira ocorrência de 'r' ---");
        lista.excluirPosicao('r');
        lista.mostrar();
        System.out.println("--------------------------------------------------\n");

        System.out.println("--- 4. Excluindo o elemento do início ---");
        lista.excluirInicio();
        lista.mostrar();
        System.out.println("------------------------------------------\n");

        System.out.println("--- 5. Pesquisando pelo elemento 'o' ---");
        No pesquisa = lista.pesquisa('o');
        if (pesquisa != null) {
            System.out.print("Nó encontrado: ");
            pesquisa.mostraNo();
        } else {
            System.out.println("Nó não encontrado");
        }
        System.out.println("---------------------------------------\n");

        System.out.println("--- 6. Excluindo o elemento 'd' ---");
        lista.excluirPosicao('d');
        lista.mostrar();
        System.out.println("------------------------------------\n");

        System.out.println("--- 7. Inserindo 1, 4, 7 ---");
        lista.insereInicio(1);
        lista.insereInicio(4);
        lista.insereInicio(7);
        lista.mostrar();
        System.out.println("----------------------------\n");

        System.out.println("--- 8. Pesquisando pelo elemento 1 ---");
        No v = lista.pesquisa(1);
        if (v != null) {
            System.out.print("Nó encontrado com valor: " + v.valor);
            System.out.println();
        } else {
            System.out.println("Nó não encontrado");
        }
        System.out.println("--------------------------------------\n");

        System.out.println("--- 9. Excluindo o elemento do início ---");
        lista.excluirInicio();
        lista.mostrar();
        System.out.println("------------------------------------------\n");
    }
}