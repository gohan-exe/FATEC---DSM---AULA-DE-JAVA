import pytest
from src.frete import CalculadoraFrete, ValorInvalidoError

def test_frete_normal():
    frete = CalculadoraFrete("normal")
    resultado = frete.calcular(100, 10, 5)
    assert resultado == 10 + (2*5) + (0.5*10)

def test_frete_expressa():
    frete = CalculadoraFrete("expressa")
    resultado = frete.calcular(100, 5, 5)
    assert resultado == 27.0  # (10 + 10 + 2.5) * 1.2

def test_frete_gratis():
    frete = CalculadoraFrete("normal")
    resultado = frete.calcular(350, 10, 20)
    assert resultado == 0.0

def test_tipo_entrega_case_insensitive():
    frete = CalculadoraFrete("ExPrEsSa")
    resultado = frete.calcular(100, 5, 5)
    assert resultado == 27.0

def test_tipo_entrega_invalido():
    frete = CalculadoraFrete("urgente")
    with pytest.raises(ValorInvalidoError):
        frete.calcular(100, 10, 5)

def test_valores_negativos():
    frete = CalculadoraFrete()
    with pytest.raises(ValorInvalidoError):
        frete.calcular(-100, 10, 5)

def test_valores_nao_numericos():
    frete = CalculadoraFrete()
    with pytest.raises(ValorInvalidoError):
        frete.calcular("cem", 10, 5)
