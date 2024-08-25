import java.util.Random;

public class ex1 {
    public static void main(String[] args) {
        Random random = new Random();
        
        int[] numeros = new int[10];
        
        for (int i = 0; i < 10; i++) {
            numeros[i] = random.nextInt(100);
        }
        
        System.out.println("Números pares: ");
        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }
    }
}