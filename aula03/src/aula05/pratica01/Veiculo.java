package aula05.pratica01;

public class Veiculo {
    protected String modelo;
    protected  int ano;

    public Veiculo (String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;
    }

    public void Ligar() {
        System.out.println("O veículo " + modelo + " está ligado");
    }

}

class Carro extends Veiculo {

    private int portas;

    public Carro(String modelo, int ano, int portas) {
        super (modelo, ano);
        this.portas = portas;
    }

    public void AbrirPortas() {
        System.out.println("Abrindo " + portas + " portas do carro " + modelo);
    }
}

class Moto extends Veiculo {
    private boolean temBagageiro;

    public Moto(String modelo, int ano, boolean temBagageiro){
        super(modelo, ano);
        this.temBagageiro = temBagageiro;

    }

    public void empinar(){
        System.out.println("A moto " + modelo + " está empinando!");
    }

    public void TemBagageiro(){
        if (temBagageiro){
            System.out.println("A moto " + modelo + " tem bagageiro");
        } else {
            System.out.println("A moto " + modelo + " NÃO tem bagageiro");
        }
    }


}
