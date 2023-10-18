public class Roteador {
    Boolean transmiteWifi;
    String modelo;
    int portas;
    String marca;

    void restribuiSinalWifi(){
        if(transmiteWifi && modelo != null && portas > 0 && marca != null){
            System.out.println("O roteador está restribuindo sinal de WI-FI.");
        }
    }
}
