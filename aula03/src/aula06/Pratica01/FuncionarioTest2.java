package aula06.Pratica01;

public class FuncionarioTest2 {
    public static void main(String[] args) {
        FuncionarioCLT funcionarioCLT = new FuncionarioCLT("Thiago", 6000);
        FuncionarioPJ funcionarioPJ = new FuncionarioPJ("Guilherme", 5000);

        funcionarioCLT.calcularSalarioFinal();
        funcionarioCLT.exibirDados();
        funcionarioPJ.calcularSalarioFinal();
        funcionarioPJ.exibirDados();

    }
}
