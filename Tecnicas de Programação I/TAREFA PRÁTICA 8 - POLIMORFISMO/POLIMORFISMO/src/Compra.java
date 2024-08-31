public class Compra {
    public String descricao;
    public double valor;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public void gerarCupom(Cupom cupom) {
        System.out.println("Cupom gerado: " + cupom.getNumeroCupom());
    }

    public void finalizar(Cupom cupom){
        System.out.println("Cupom finalizado");
    }

}

