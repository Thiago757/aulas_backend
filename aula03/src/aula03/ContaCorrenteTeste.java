package aula03;

public class ContaCorrenteTeste {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("Thiago");
        conta1.setNumero(12345);
        conta1.setSaldo(1000.0f);

        conta1.mostrarInfo();
        conta1.emiteSaldo();

        conta1.setTitular("Pedro");
        conta1.mostrarInfo();

        ContaCorrente conta2 = new ContaCorrente("Ana", 54321, 500.0f);
        conta2.mostrarInfo();
        conta2.emiteSaldo();
    }
}
