package aula05.pratica02;

public class Carro {
    protected Motor motor;
    private String modelo;

    
    public Carro(String modelo){
        this.motor = new Motor(100, "3 cilindros");
        this.modelo = modelo;
    }

    public void ligarCarro(){
        this.motor.ligar();
        System.out.println("Carro ligado");
    }

    public void desligarCarro(){
        this.motor.desligado();
        System.out.println("Carro desligado");
    }

}
