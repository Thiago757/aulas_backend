package aula03;

public class ProdutoTeste {
    public  static void main (String[] args) {

        Produto produto1 = new Produto();
        Produto produto2 = new Produto("Samsung s23");
        Produto produto3 = new Produto("Samsung s23", 1200);
        Produto produto4 = new Produto("Samsung s23", 1400, 2);

        produto1.exibir();
        produto2.exibir();
        produto3.exibir();
        produto4.exibir();

    }
}
