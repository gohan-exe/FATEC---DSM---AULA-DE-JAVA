import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String password = "Miyamoto";

        System.out.print("Digite a senha: ");
        String userPassword = input.nextLine();

        while (!userPassword.equals(password)) {
            System.out.println("Senha incorreta! Tente novamente.");
            System.out.println("Digite a senha: ");
            userPassword = input.nextLine();
        }

        System.out.println("Acesso permitido!");
    }
}
