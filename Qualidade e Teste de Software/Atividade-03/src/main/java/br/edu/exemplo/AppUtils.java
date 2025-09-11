package main.java.br.edu.exemplo;

public class AppUtils {

    // Método 1: verifica se número é par
    public static boolean ehNumeroPar(int n) {
        return n % 2 == 0;
    }

    // Método 2: verifica se a frase contém uma palavra
    public static boolean contemPalavra(String frase, String palavra) {
        if (frase == null || palavra == null) return false;
        return frase.toLowerCase().contains(palavra.toLowerCase());
    }

    // Método 3: valida login simples
    public static boolean loginValido(String usuario, String senha) {
        return "admin".equals(usuario) && "1234".equals(senha);
    }

    // Método 4: verifica maioridade
    public static boolean ehMaiorDeIdade(int idade) {
        return idade >= 18;
    }
}
