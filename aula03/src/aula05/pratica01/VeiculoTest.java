package aula05.pratica01;

public class VeiculoTest {
    public static void main(String[] args) {
        Carro carro = new Carro("Corsa", 2002, 4);
        Moto moto = new Moto("CB 200", 2017, true);

        carro.Ligar();
        moto.Ligar();
        carro.AbrirPortas();
        moto.empinar();
        moto.TemBagageiro();

    }
}
