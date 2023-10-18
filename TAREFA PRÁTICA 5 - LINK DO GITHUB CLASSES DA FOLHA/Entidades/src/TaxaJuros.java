public class TaxaJuros {
    String tipo;
    float valor;
    float porcentagem;

    float aumentarValor() {
        if (tipo != null && valor > 0 && porcentagem > 0);
        valor = valor + (valor * porcentagem) / 100;
        System.out.println("os juros aumentaram.");

        return valor;
    }

    float diminuirValor() {
        if (tipo != null && valor > 0 && porcentagem > 0);
        valor = valor - (valor * porcentagem) / 100;
        System.out.println("os juros diminuiram.");

        return valor;
    }

    float estabilizarValor() {
        if (tipo != null && valor > 0 && porcentagem > 0);
        valor = valor - (valor * 0.1f);
        System.out.println("os juros estabilizaram.");

        return valor;
    }
}
