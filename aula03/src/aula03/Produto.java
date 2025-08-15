package aula03;

public class Produto {
        String nomeproduto;
        float preco;
        int quantidade;


        public Produto () {
            this.nomeproduto = "Desconhecido";
            this.preco = 0;
            this.quantidade = 0;
        }

        public Produto(String nomeproduto){
            this.nomeproduto = nomeproduto;
            this.preco = 0;
            this.quantidade = 0;
        }

        public Produto(String nomeproduto, float preco) {
            this.nomeproduto = nomeproduto;
            this.preco = preco;
            this.quantidade = 0;
        }

        public Produto(String nomeproduto, float preco, int quantidade) {
            this.nomeproduto = nomeproduto;
            this.preco = preco;
            this.quantidade = quantidade;
        }

        public void exibir() {
            System.out.println("Foi vendido " + quantidade + " do produto: " + nomeproduto + " pelo valor de " + preco);
        }
    }



