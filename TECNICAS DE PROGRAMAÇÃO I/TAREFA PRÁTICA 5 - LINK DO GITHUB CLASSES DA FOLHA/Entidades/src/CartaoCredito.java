public class CartaoCredito {
    String tipos;
    int senha;
    int CVC;
    float limite;

    boolean Cartao;

    void formaPagamento(){
        if(tipos != null && senha == 9999 && CVC == 999 && limite > 0){
            Cartao = true;
            System.out.println("Pague seus impostos.");
        }
    }
}
