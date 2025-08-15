package aula03;

public class PessoaTest {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("Thiago");
        Pessoa pessoa3 = new Pessoa("Helem", 19);

        pessoa1.exibir();
        pessoa2.exibir();
        pessoa3.exibir();
    }

}
