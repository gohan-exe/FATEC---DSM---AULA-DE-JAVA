import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = ler.nextInt();

        if(idade >= 60) {
            System.out.println(idade + " - Você é idoso(a)!");
        }else if( idade >= 18){
            System.out.println(idade + " - Você é adulto(a)!");
        }else if( idade >= 12){
            System.out.println(idade + " - Você é adolescente!");
        }else{
           System.out.println(idade + " - Você é criança!");
        }
    }
}