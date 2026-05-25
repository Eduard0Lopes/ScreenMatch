package Exercicios.ArrayList_Casting_instanceOf.exer_2_e_3;

public class Animal {
    static void main(String[] args) {
        Animal animal = new Cachorro();

        if(animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
        } else {
            System.out.println("Nao é um cachorro");
        }
    }
}
