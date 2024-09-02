public class CartaoCredito {
    String tipos;
    int senha;
    int CVC;
    float limite;

    void formaPagamento(){
        if(tipos != null && senha == 9999 && CVC == 999 && limite > 0){
            System.out.println("Pague seus impostos.");
        }
    }
}
