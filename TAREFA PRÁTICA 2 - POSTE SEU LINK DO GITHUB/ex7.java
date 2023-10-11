import java.util.Random;

public class ex7 {
    public static void main(String[] args) {

        Random random = new Random();
        
        int[] numeros = new int[50];
        
        for (int i = 0; i < 50; i++) {
            numeros[i] = random.nextInt(10) + 1; // Gere números aleatórios entre 1 e 10
        }
        
        int[] frequencia = new int[10]; // Índices de 1 a 10
        
        for (int i = 0; i < 50; i++) {
            int numero = numeros[i];
            frequencia[numero - 1]++; // Decrementamos 1 para usar o índice 0 para o número 1, índice 1 para o número 2 e assim por diante
        }
        
        for (int i = 0; i < 10; i++) {
            int numero = i + 1; // Incrementamos 1 para obter o número real
            int quantidade = frequencia[i];
            System.out.println("Número " + numero + " aparece " + quantidade + " vezes.");
        }
    }
}