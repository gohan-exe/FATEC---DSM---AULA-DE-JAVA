import java.util.Random;

public class ContandoImpares {
    public static void main(String[] args) {

        Random random = new Random();
        
        int[] numeros = new int[30];
        
        for (int i = 0; i < 30; i++) {
            numeros[i] = random.nextInt(100); // Gere números aleatórios de 0 a 99
        }
        
        int contadorImpares = 0;
        
        for (int i = 0; i < 30; i++) {
            if (numeros[i] % 2 != 0) {
                contadorImpares++;
            }
        }
        
        System.out.println("Array de números:");
        for (int i = 0; i < 30; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println(); // Pule uma linha
        System.out.println("Quantidade de números ímpares: " + contadorImpares);
    }
}