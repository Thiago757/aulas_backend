package aula04;

class No {
    public Object valor;
    public No proximo;

    public No(Object valor) {
        this.valor = valor;
        this.proximo = null;
    }

    public void mostraNo() {
        System.out.println(valor);
    }
}

public class Pratica02 {
    private No primeiro;

    public Pratica02() {
        this.primeiro = null;
    }

    public void insereInicio(Object valor) {
        No novo = new No(valor);
        novo.proximo = this.primeiro;
        this.primeiro = novo;
    }

    public void mostrar() {
        if (this.primeiro == null) {
            System.out.println("A lista está vazia");
            return;
        }
        No atual = this.primeiro;
        while (atual != null) {
            atual.mostraNo();
            atual = atual.proximo;
        }
    }

    public No pesquisa(Object valor) {
        if (this.primeiro == null) {
            System.out.println("A lista está vazia");
            return null;
        }
        No atual = this.primeiro;
        while (atual.valor != valor) {
            if (atual.proximo == null) {
                return null;
            } else {
                atual = atual.proximo;
            }
        }
        return atual;
    }

    public No excluirInicio() {
        if (this.primeiro == null) {
            System.out.println("A lista está vazia");
            return null;
        }
        No temp = this.primeiro;
        this.primeiro = this.primeiro.proximo;
        return temp;
    }

    public No excluirPosicao(Object valor) {
        if (this.primeiro == null) {
            System.out.println("A lista está vazia");
            return null;
        }

        No atual = this.primeiro;
        No anterior = this.primeiro;

        while (atual.valor != valor) {
            if (atual.proximo == null) {
                return null;
            } else {
                anterior = atual;
                atual = atual.proximo;
            }
        }

        if (atual == this.primeiro) {
            this.primeiro = this.primeiro.proximo;
        } else {
            anterior.proximo = atual.proximo;
        }

        return atual;
    }
}