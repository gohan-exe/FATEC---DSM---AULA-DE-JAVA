public class Girafa {
    float peso;
    float altura;
    String pescoco;
    String sexo;

    boolean Animal;

    void comerAlto(){
        if(peso > 0 && altura > 0 && pescoco != null && sexo != null){
            Animal = true;
            System.out.println("A girafa está comendo no alto.");
        }
    }
}
