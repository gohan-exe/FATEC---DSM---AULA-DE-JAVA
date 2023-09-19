import java.util.Random;

public class SimulacaoJogoDados {
    public static void main(String[] args) {
        Random random = new Random();
        
        int numeroLancamentos = 100;
        int contagemSete = 0;
        
        for (int i = 0; i < numeroLancamentos; i++) {
            // Simule o lançamento de dois dados (valores de 1 a 6)
            int dado1 = random.nextInt(6) + 1;
            int dado2 = random.nextInt(6) + 1;
            
            int soma = dado1 + dado2;
            
            if (soma == 7) {
                contagemSete++;
            }
        }
        
        System.out.println("Resultado da simulação:");
        System.out.println("Número de vezes que a soma foi 7: " + contagemSete);
    }
}