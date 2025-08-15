package aula03;

public class GradeBookTeste {
    public static void main(String[] args) {
        GradeBook gradeBook = new GradeBook();

        String nome = gradeBook.getNome();
        String curso = gradeBook.getCurso();

        System.out.println("Meu nome é " + nome + " e estou cursando " + curso + ".");
    }
}
