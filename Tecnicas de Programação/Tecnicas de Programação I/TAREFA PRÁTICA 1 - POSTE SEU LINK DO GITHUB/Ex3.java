import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] nomes = new String[5];

        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = input.nextLine();
        }
        System.out.println("Digite o nome que deseja: ");
        String novoNome = input.nextLine();

        for (int i = 0; i < nomes.length; i++) {
            if(nomes[i].equals(novoNome)) {
                System.out.println("O nome " + novoNome + "está na lista.");
                break;
            }else {
                if (i == nomes.length - 1) System.out.println("O nome " + novoNome + "não está na lista.");
            }
        }
    }
}