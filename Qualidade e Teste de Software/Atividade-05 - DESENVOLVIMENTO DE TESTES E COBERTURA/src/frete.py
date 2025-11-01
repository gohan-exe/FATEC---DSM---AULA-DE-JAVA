class ValorInvalidoError(Exception):
    """Exceção lançada quando um valor inválido é informado no cálculo de frete."""
    pass


class CalculadoraFrete:
    def __init__(self, tipo_entrega="normal"):
        self.tipo_entrega = tipo_entrega.lower().strip()

    def calcular(self, valor_pedido: float, peso: float, distancia: float) -> float:
        """
        Calcula o valor do frete com base nas seguintes regras:
        - Frete base: R$10,00
        - + R$2,00 por km
        - + R$0,50 por kg
        - Frete grátis se o valor do pedido for >= R$300,00
        - Entrega expressa adiciona +20% no valor final

        Lança exceção se algum valor for inválido (negativo ou tipo errado).
        """

        # Validações
        if not all(isinstance(v, (int, float)) for v in [valor_pedido, peso, distancia]):
            raise ValorInvalidoError("Todos os valores devem ser numéricos.")

        if valor_pedido < 0 or peso < 0 or distancia < 0:
            raise ValorInvalidoError("Valores negativos não são permitidos.")

        if valor_pedido >= 300:
            return 0.0

        frete = 10 + (2 * distancia) + (0.5 * peso)

        if self.tipo_entrega == "expressa":
            frete *= 1.2
        elif self.tipo_entrega != "normal":
            raise ValorInvalidoError(f"Tipo de entrega '{self.tipo_entrega}' inválido.")

        return round(frete, 2)
