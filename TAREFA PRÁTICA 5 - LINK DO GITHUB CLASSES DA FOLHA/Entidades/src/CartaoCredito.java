public class CartaoCredito {
    String tipos;
    int senha;
    int CVC;
    float limite;

    boolean Cartao;

    void formaPagamento(){
        if(tipos != null && senha == 4 && CVC == 3 && limite > 0){
            Cartao = true;
            System.out.println("Pague seus impostos.");
        }
    }
}
