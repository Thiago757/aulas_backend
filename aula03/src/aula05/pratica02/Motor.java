package aula05.pratica02;

public class Motor {

    private int potencia;
    private String tipo;

    public Motor (int potencia, String tipo){
        this.potencia = potencia;
        this.tipo = tipo;
    }

    public void ligar(){
        System.out.println("Motor ligado!");
    }

    public void desligado(){
        System.out.println("Motor desligado!");
    }

}
