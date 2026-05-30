package Exercicio_Record.Exerc1_2;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Principal {
    static void main() {

    String jsonPessoa = "{\"nome\":\"Luiz\",\"Idade\":20,\"cidade\":\"Guaiba\"}";

    Gson gson = new GsonBuilder().setLenient().create();
        // Mantive o setLenient() mas no GSON que estou usando, não é mais necessario |
        // GSON v2.14.0 já lida com campos ausentes e extras sem setLenient()
    Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.printf("Objeto Pessoa "+ pessoa);
    }
}
