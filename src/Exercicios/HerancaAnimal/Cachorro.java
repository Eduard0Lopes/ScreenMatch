package Exercicios.HerancaAnimal;

public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Latido");
    }

    public void abanarRabo() {
        System.out.println("Abanou rabo");
    }
}
