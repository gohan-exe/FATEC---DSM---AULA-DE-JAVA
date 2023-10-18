public class Telescopio {
    String lente;
    String tripe;
    String material;
    float distancia;

    boolean inteiro;

    void ver(){
        if(lente != null && tripe != null && material != null && distancia > 0){
            inteiro = true;
            System.out.println("vendo pelo telescópio.");
        }
    }
}
