public class Computador {
    int memoriaRam;
    String Processador;
    String placaMae;
    int fonte;

    boolean Ligado;

    void Ligar(){
        if(memoriaRam > 0 && Processador != null && placaMae != null && fonte > 0){
            System.out.println("Ligando Computador...");
            Ligado = true;
        }   
        
    }
    void Desligar(){
        if(Ligado){
            Ligado = false;
        }
    }
    void Reiniciar(){
        if(Ligado){
            System.out.println("Reiniciando computador...");
            Ligado = false;
            Ligar();
        }
    }
}