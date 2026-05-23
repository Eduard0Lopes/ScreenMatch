package Exercicios.Heranca.HerancaAnimal;

public class TestarAnimais {
    static void main() {
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        Gato gato = new Gato();
        gato.arranharMoveis();
        gato.emitirSom();
    }
}
