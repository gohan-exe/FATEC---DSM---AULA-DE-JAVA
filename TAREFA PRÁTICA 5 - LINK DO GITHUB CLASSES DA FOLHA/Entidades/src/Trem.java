public class Trem {
    String trilhos;
    Boolean combustão;
    Boolean eletrico;
    String tipo;

    void tranporteCombustao() {
        if (trilhos != null && combustão && tipo != null) {
            System.out.println("O trem em combustão está transportando.");
        }
    }

    void tranporteEletrico() {
        if (trilhos != null && eletrico && tipo != null) {
            System.out.println("O trem eletrico está transportando.");
        }
    }
}
