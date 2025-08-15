package aula03;

public class ContaCorrente {
    private String titular;
    private Integer numero;
    private float saldo;

    public ContaCorrente(String titular) {
        this.titular = titular;
    }

    public ContaCorrente(String titular, Integer numero, float saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void emiteSaldo() {
        System.out.println("Seu saldo é R$" + getSaldo());
    }

    public void sacarValor(float valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para sacar R$" + valor);
        }
    }

    public void depositarValor(float valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito: R$" + valor);
        }
    }

    public void mostrarInfo() {
        System.out.println("Titular: " + getTitular());
        System.out.println("N° conta: " + getNumero());
        System.out.println("Saldo: R$" + getSaldo());
    }
}
