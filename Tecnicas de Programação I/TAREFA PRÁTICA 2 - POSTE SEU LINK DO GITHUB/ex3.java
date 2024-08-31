import java.util.Random;

public class ex3 {
    public static void main(String[] args) {
        Random random = new Random();
        
        int[] numeros = new int[20];
        
        for (int i = 0; i < 20; i++) {
            numeros[i] = random.nextInt(100); // Gere números aleatórios de 0 a 99
        }
        
        int soma = 0;
        for (int i = 0; i < 20; i++) {
            soma += numeros[i];
        }
        
        double media = (double) soma / 20;
        
        System.out.println("Array de números:");
        for (int i = 0; i < 20; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println(); // Pule uma linha
        System.out.println("Média dos números: " + media);
    }
}