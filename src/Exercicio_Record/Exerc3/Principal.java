package Exercicio_Record.Exerc3;

import com.google.gson.Gson;

public class Principal {
    static void main() {
        String jsonLivro = """
        {
            "titulo": "The Boys",
            "autor": "Prime",
            "editora": {
                "nome": "Video",
                "cidade": "California"
            }
        }
        """;

        Gson gson = new Gson();
        Livro livro = gson.fromJson(jsonLivro, Livro.class);
        System.out.printf("Livro e editora " + livro);
    }
}
