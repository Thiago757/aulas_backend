package aula05.pratica03;

public class FuncionarioTeste {
    public static void main (String[] args){
        Funcionario funcionario = new Funcionario("Teste", 4000);
        Gerente gerente = new Gerente("Helem", 10000);
        Vendedor vendedor = new Vendedor("Thiago", 6000);

        funcionario.calcularBonus();
        gerente.calcularBonus();
        vendedor.calcularBonus();

    }
}
