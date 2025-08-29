package aula04;

public class Pratica01 {
    private int capacidade;
    private int ultima_posicao;
    private String[] valores;

    public Pratica01(int capacidade) {
        this.capacidade = capacidade;
        this.ultima_posicao = -1;
        this.valores = new String[capacidade];
    }

    public void imprime() {
        if (this.ultima_posicao == -1) {
            System.out.println("O vetor está vazio");
        } else {
            for (int i = 0; i <= this.ultima_posicao; i++) {
                System.out.println(i + " - " + this.valores[i]);
            }
        }
    }

    public void inserir(String valor) {
        if (this.ultima_posicao == this.capacidade - 1) {
            System.out.println("Capacidade máxima atingida");
            return;
        }

        int posicao = 0;
        while (posicao <= this.ultima_posicao && this.valores[posicao].compareTo(valor) < 0) {
            posicao++;
        }

        for (int i = this.ultima_posicao; i >= posicao; i--) {
            this.valores[i + 1] = this.valores[i];
        }

        this.valores[posicao] = valor;
        this.ultima_posicao++;
    }

    public int pesquisa_linear(String valor) {
        for (int i = 0; i <= this.ultima_posicao; i++) {
            if (this.valores[i].equals(valor)) {
                return i;
            }
            if (this.valores[i].compareTo(valor) > 0) {
                return -1;
            }
        }
        return -1;
    }

    public int pesquisa_binaria(String valor) {
            int limite_inferior = 0;
        int limite_superior = this.ultima_posicao;

        while (limite_inferior <= limite_superior) {
            int posicao_atual = (limite_inferior + limite_superior) / 2;
            int comparacao = this.valores[posicao_atual].compareTo(valor);

            if (comparacao == 0) {
                return posicao_atual;
            } else if (comparacao < 0) {
                limite_inferior = posicao_atual + 1;
            } else {
                limite_superior = posicao_atual - 1;
            }
        }
        return -1;
    }

    public void excluir(String valor) {
        int posicao = this.pesquisa_linear(valor);
        if (posicao != -1) {
            for (int i = posicao; i < this.ultima_posicao; i++) {
                this.valores[i] = this.valores[i + 1];
            }
            this.ultima_posicao--;
        }
    }
}