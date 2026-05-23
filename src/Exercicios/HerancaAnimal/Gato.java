package Exercicios.HerancaAnimal;

public class Gato extends Animal{
    @Override
    public void emitirSom(){
        System.out.println("Miado");
    }

    public void arranharMoveis(){
        System.out.println("Arranhou");
    }
}
