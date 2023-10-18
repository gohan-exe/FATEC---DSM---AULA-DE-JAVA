public class Smartwatch {
    float peso;
    String marca;
    String modelo;

    void mostrarHora(){
        if(peso > 0 && marca != null && modelo != null)
        System.out.println("O smartwatch está mostrando as horas");
    }
}
