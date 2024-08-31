import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Endereco end = new Endereco("Rua dos Join", "PG", "SP");
        Pessoa pes = new Pessoa("Marlon", 20, end);
        Compra com = new Compra("Dutra joins", 45);
        Cupom cu = new Cupom(3);
        Disciplina dis = new Disciplina("DSM");
        Aluno al = new Aluno("Marlon", 2);


    dis.mostrarDisiplina();
    pes.mostrarInformacoes();
    com.gerarCupom(cu);
    com.finalizar(cu);
    
    }
    
}