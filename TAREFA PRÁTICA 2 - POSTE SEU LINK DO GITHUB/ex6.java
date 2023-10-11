import java.util.Random;

public class ex6 {
    public static void main(String[] args) {

        Random random = new Random();
        
        int[] numeros = new int[10];
        
        for (int i = 0; i < 10; i++) {
            numeros[i] = random.nextInt(100); // Gere números aleatórios de 0 a 99
        }
        
        System.out.println("Array original:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println(); // Pule uma linha
        
        System.out.println("Array em ordem reversa:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println(); // Pule uma linha
    }
}