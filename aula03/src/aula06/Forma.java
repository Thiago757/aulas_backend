package aula06;

public abstract class Forma {
    abstract public double calcularArea();
}

class Quadrado extends Forma{
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public  double calcularArea(){
        return this.lado * this.lado;
    }

}

class Circulo extends Forma{
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double calcularArea(){
        return Math.PI *  this.raio * this.raio;
    }
}
