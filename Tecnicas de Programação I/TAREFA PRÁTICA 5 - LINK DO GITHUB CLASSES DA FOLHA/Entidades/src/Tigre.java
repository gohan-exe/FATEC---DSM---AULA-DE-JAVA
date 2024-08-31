public class Tigre {
    Float tamanho;
    String tipo;
    Float peso;
    int idade;

    void Caçar(){
        if(tamanho > 0 && tipo != null && peso > 0 && idade > 0){
            System.out.println("O tigre está caçando.");
        }
    }
}
