package Exercicios.exerciciosScreenMatch.exercicioIdadePessoa;

public class IdadePessoa {

    private String nome;
    private int idade;



    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade) {
       this.idade = idade;
    }

    public void maiorIdade() {
        if (idade >= 18) {
            System.out.println("É maior de idade");
        } else {
            System.out.println("É Menor de idade");
        }
    }
}
