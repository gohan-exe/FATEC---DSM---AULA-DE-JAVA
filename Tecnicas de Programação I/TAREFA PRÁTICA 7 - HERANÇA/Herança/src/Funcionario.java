public class Funcionario {
    String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public void baterOPonto() {
        System.out.println(nome + " bateu o ponto.");
    }

    public void fecharOCaixa() {
        System.out.println(nome + " fechou o caixa.");
    }
}

class Gerente extends Funcionario {
    public Gerente(String nome) {
        super(nome);
    }

    public void realizarVenda() {
        System.out.println(nome + " realizou uma venda.");
    }
}

class Vendedor extends Funcionario {
    public Vendedor(String nome) {
        super(nome);
    }

    public void realizarVenda() {
        System.out.println(nome + " realizou uma venda.");
    }
}

class Faxineiro extends Funcionario {
    public Faxineiro(String nome) {
        super(nome);
    }

    public void solicitarMaterial() {
        System.out.println(nome + " solicitou material de limpeza.");
    }
}

abstract class ExemploFuncionarios {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("João");
        Vendedor vendedor = new Vendedor("Maria");
        Faxineiro faxineiro = new Faxineiro("José");

        gerente.baterOPonto();
        gerente.fecharOCaixa();
        gerente.realizarVenda();

        vendedor.baterOPonto();
        vendedor.fecharOCaixa();
        vendedor.realizarVenda();

        faxineiro.baterOPonto();
        faxineiro.fecharOCaixa();
        faxineiro.solicitarMaterial();
    }
}
