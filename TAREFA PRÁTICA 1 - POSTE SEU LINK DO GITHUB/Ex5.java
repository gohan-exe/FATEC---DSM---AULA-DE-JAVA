import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

    System.out.print("Digite a quantidade de materias do semestre: ");
    int materias = input.nextInt();

    System.out.print("Digite a nota minima para aprovação: ");
    int notaMinima = input.nextInt();

    String[][] materiasArray = new String[materias][6];

    for (int i = 0; i < materias; i++) {
      System.out.print("Digite a materia " + (i + 1) + ": ");
      materiasArray[i][0] = input.next();
    }

    for (int i = 0; i < materias; i++) {
      for (int j = 1; j < 4; j++) {
        System.out.print(
          "Digite a nota" + j + " da materia " + (materiasArray[i][0]) + ": "
        );
        materiasArray[i][j] = input.next();
      }
    }

    for (int i = 0; i < materias; i++) {
      double media = 0;
      for (int j = 1; j < 4; j++) {
        media += Double.parseDouble(materiasArray[i][j]);
      }
      media = media / 3;
      materiasArray[i][4] = String.valueOf(media);
      if (media >= notaMinima) {
        materiasArray[i][5] = "Aprovado";
      } else {
        materiasArray[i][5] = "Reprovado";
      }
    }

    System.out.println("DISIPLINA - NOTA1 - NOTA2 - NOTA3 - MÉDIA - APROVAÇAO");
    System.out.println("NOTA MÍNIMA: " + notaMinima);

    for (int i = 0; i < materias; i++) {
      System.out.println(
        materiasArray[i][0] +
        " - " +
        materiasArray[i][1] +
        " - " +
        materiasArray[i][2] +
        " - " +
        materiasArray[i][3] +
        " - " +
        materiasArray[i][4] +
        " - " +
        materiasArray[i][5]
      );
    }
  }
}