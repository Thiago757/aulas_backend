package aula06.Pratica02;

public interface Pagamento {
    void pagar(double valor);
    String getDescricao();
}

class CartaoCredito implements Pagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("O valor total a pagar no crédito é R$ " + valor);
    }

    @Override
    public String getDescricao() {
        return "Pagamento com Cartão de Crédito";
    }
}

class Boleto implements Pagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("O valor total a pagar no boleto é R$ " + valor);
    }

    @Override
    public String getDescricao() {
        return "Pagamento com Boleto Bancário";
    }
}

class Pix implements Pagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("O valor total a pagar no Pix é R$ " + valor);
    }

    @Override
    public String getDescricao() {
        return "Pagamento via Pix";
    }
}
