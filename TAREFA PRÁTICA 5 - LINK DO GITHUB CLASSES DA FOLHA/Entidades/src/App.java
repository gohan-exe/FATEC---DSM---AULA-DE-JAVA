public class App {
    public static void main(String[] args) throws Exception {
        Computador PC = new Computador();
        PC.memoriaRam = 32;
        PC.fonte = 600;
        PC.Processador = "Processor intel 9400f";
        PC.placaMae = "H310 Motherboard";

        Telescopio TL = new Telescopio();
        TL.distancia = 30.000f;
        TL.tripe = "Tripe aluminio";
        TL.lente = "Lente";
        TL.material = "Aluminio";

        Girafa GI = new Girafa();
        GI.altura = 4.2f;
        GI.pescoco = "pescoço da girafa";
        GI.peso = 150.94f;
        GI.sexo = "Macho";
        
        CartaoCredito CC = new CartaoCredito();
        CC.CVC = 842;
        CC.tipos = "Debito";
        CC.limite = 10.000f;
        CC.senha = 6969;

        TaxaJuros TJ = new TaxaJuros();
        TJ.porcentagem = 10.5f;
        TJ.tipo = "Juros";
        TJ.valor = 10.5f;

        Hulk HU = new Hulk();
        HU.Fisico = true;
        HU.fatorRegenerativo = true;
        HU.radiacaoGamma = true;
        HU.superForca = true;

        Trem TR = new Trem();
        TR.combustão = true;
        TR.eletrico = true;
        TR.tipo = "Trem de carga convencional";
        TR.trilhos = "trilhos pesados";

        Tigre TI = new Tigre();
        TI.idade = 10;
        TI.peso = 85.7f;
        TI.tamanho = 80.3f;
        TI.tipo = "Tigre de Bengala";

        Roteador RO = new Roteador();
        RO.marca = "AC 1350";
        RO.modelo = "TP-Link";
        RO.portas = 1;
        RO.transmiteWifi = true;

        Smartwatch SW = new Smartwatch();
        SW.marca = "Xiaomi";
        SW.modelo = "Mi Watch Lite Global";
        SW.peso = 35.0f;
    }
}
