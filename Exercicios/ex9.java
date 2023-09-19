import java.util.Random;
import java.util.Scanner;

public class BuscaLinear {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[25];
        
        for (int i = 0; i < 25; i++) {
            numeros[i] = random.nextInt(100); // Gere números aleatórios de 0 a 99
        }
        
        System.out.print("Digite um número para verificar se está no array: ");
        int numeroProcurado = scanner.nextInt();
        
        boolean encontrado = false;
        for (int i = 0; i < 25; i++) {
            if (numeros[i] == numeroProcurado) {
                encontrado = true;
                break; // O número foi encontrado, podemos sair do loop
            }
        }
        
        if (encontrado) {
            System.out.println("O número " + numeroProcurado + " está no array.");
        } else {
            System.out.println("O número " + numeroProcurado + " não está no array.");
        }
        
        scanner.close();
    }
}