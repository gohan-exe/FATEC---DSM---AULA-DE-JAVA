package test.java.br.edu.exemplo;

import main.java.br.edu.exemplo.AppUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class AppUtilsTest {

    @Test
    void testEhNumeroPar() {
        int num1 = 10;
        int num2 = 7;

        boolean resultado1 = AppUtils.ehNumeroPar(num1);
        boolean resultado2 = AppUtils.ehNumeroPar(num2);

        System.out.println(num1 + " é par? " + resultado1);
        System.out.println(num2 + " é par? " + resultado2);

        assertTrue(resultado1);
        assertFalse(resultado2);
    }

    @Test
    void testContemPalavra() {
        String frase1 = "O Dutra ama Java";
        String frase2 = "O Dutra ama Python";
        String palavra = "java";

        boolean resultado1 = AppUtils.contemPalavra(frase1, palavra);
        boolean resultado2 = AppUtils.contemPalavra(frase2, palavra);

        System.out.println("\"" + frase1 + "\" contém \"" + palavra + "\"? " + resultado1);
        System.out.println("\"" + frase2 + "\" contém \"" + palavra + "\"? " + resultado2);

        assertTrue(resultado1);
        assertFalse(resultado2);
    }

    @Test
    void testLoginValido() {
        boolean resultado1 = AppUtils.loginValido("admin", "1234");
        boolean resultado2 = AppUtils.loginValido("user", "senha");

        System.out.println("Login admin/1234 válido? " + resultado1);
        System.out.println("Login user/senha válido? " + resultado2);

        assertTrue(resultado1);
        assertFalse(resultado2);
    }

    @Test
    void testEhMaiorDeIdade() {
        int idade1 = 20;
        int idade2 = 15;

        boolean resultado1 = AppUtils.ehMaiorDeIdade(idade1);
        boolean resultado2 = AppUtils.ehMaiorDeIdade(idade2);

        System.out.println(idade1 + " é maior de idade? " + resultado1);
        System.out.println(idade2 + " é maior de idade? " + resultado2);

        assertTrue(resultado1);
        assertFalse(resultado2);
    }
}
