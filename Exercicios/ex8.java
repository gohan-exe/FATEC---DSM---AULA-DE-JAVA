import java.util.Scanner;

public class ValorMaisFrequente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Insira o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }
        
        int[] frequencia = new int[101]; // Assumindo que os números podem ser de 0 a 100
        
        for (int i = 0; i < 10; i++) {
            frequencia[numeros[i]]++;
        }
        
        int valorMaisFrequente = 0;
        int frequenciaMaxima = 0;
        
        for (int i = 0; i < frequencia.length; i++) {
            if (frequencia[i] > frequenciaMaxima) {
                frequenciaMaxima = frequencia[i];
                valorMaisFrequente = i;
            }
        }
        
        System.out.println("Valor mais frequente: " + valorMaisFrequente);
        System.out.println("Frequência: " + frequenciaMaxima);
        
        scanner.close();
    }
}