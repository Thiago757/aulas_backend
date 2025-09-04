package aula06.Pratica02;

public class PagamentoTest {
    public static void main(String[] args) {
        Pagamento cartaoCredito = new CartaoCredito();
        Pagamento boleto = new Boleto();
        Pagamento pix = new Pix();

        cartaoCredito.pagar(200.0);
        System.out.println(cartaoCredito.getDescricao());

        boleto.pagar(350.5);
        System.out.println(boleto.getDescricao());

        pix.pagar(99.9);
        System.out.println(pix.getDescricao());
    }
}
