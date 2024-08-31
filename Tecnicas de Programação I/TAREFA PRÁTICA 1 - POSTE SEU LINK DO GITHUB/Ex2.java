import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    int n;
    int impares = 1;
    int soma = 0;

    System.out.print("Digite a quantidade de números impares: ");
    n = input.nextInt();

    for (int i = 0; i < n; i++) {
        soma += impares;
        System.out.print(impares + " + ");
        impares += 2;
    }

    System.out.println(" = " + soma);

}
}    