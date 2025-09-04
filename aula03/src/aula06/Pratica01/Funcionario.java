package aula06.Pratica01;

public abstract class Funcionario{
    String nome;
    double salarioBase;

    abstract public double calcularSalarioFinal();
    abstract public void exibirDados();
}

class FuncionarioCLT extends Funcionario {

    public FuncionarioCLT(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalarioFinal() {
        return this.salarioBase - (this.salarioBase * 0.1);
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Salário base: " + salarioBase);
        System.out.println("O salário base com 10% de desconto é " + calcularSalarioFinal());
    }

}

class FuncionarioPJ extends Funcionario{
    public FuncionarioPJ(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalarioFinal() {
        return this.salarioBase + (this.salarioBase * 0.2);
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Salário base: " + salarioBase);
        System.out.println("O salário base com 20% a mais é " + calcularSalarioFinal());
    }
}

