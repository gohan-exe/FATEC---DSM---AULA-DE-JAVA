import java.util.Random;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Random random = new Random();
        
        int numeroAleatorio = random.nextInt(100) + 1;
        
        Scanner scanner = new Scanner(System.in);
        
        int tentativas = 0;
        boolean acertou = false;
        
        System.out.println("Bem-vindo ao jogo Adivinhe o Número!");
        
        while (!acertou) {
            System.out.print("Tente adivinhar o número (entre 1 e 100): ");
            int palpite = scanner.nextInt();
            
            tentativas++;
            
            if (palpite < numeroAleatorio) {
                System.out.println("Seu palpite está baixo. Tente novamente.");
            } else if (palpite > numeroAleatorio) {
                System.out.println("Seu palpite está alto. Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
                acertou = true;
            }
        }
        
        scanner.close();
    }
}