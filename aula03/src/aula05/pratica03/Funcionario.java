package aula05.pratica03;

public class Funcionario {
    protected float salario;
    protected String nome;

    public Funcionario (String nome, float salario){
        this.salario = salario;
        this.nome = nome;
    }

    public void calcularBonus() {
        System.out.println(this.nome + " - Salário com bônus: R$ " + this.salario * 1.05);
    }

}

class Gerente extends Funcionario {
    public Gerente(String nome, float salario) {
        super(nome, salario);
    }

    @Override
    public void calcularBonus() {
        System.out.println(this.nome + " (Gerente) - Salário com bônus: R$ " + this.salario * 1.2);
    }
}

class Vendedor extends Funcionario {
    public Vendedor(String nome, float salario) {
        super(nome, salario);
    }

    @Override
    public void calcularBonus() {
        System.out.println(this.nome + " (Vendedor) - Salário com bônus: R$ " + this.salario * 1.05);
    }
}