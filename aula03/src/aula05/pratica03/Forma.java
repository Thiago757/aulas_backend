package aula05.pratica03;

public class Forma {
    void desenhar() {
        System.out.println("Desenhando uma forma genérica");
    }
}

class Circulo extends Forma {
    @Override
    void desenhar() {
        System.out.println("Desenhando um circulo");
    }
}

class Quadrado extends Forma {
    @Override
    void desenhar() {
        System.out.println("Desenhando um quadrado");
    }

}
