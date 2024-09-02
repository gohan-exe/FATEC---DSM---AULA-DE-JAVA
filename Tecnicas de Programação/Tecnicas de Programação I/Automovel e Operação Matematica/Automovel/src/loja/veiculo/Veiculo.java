package loja.veiculo;

public abstract class Veiculo {
	public String marca;
	public String modelo;
	public int ano;
	public String chassi;
	public String placa;
	
	public Veiculo(String marca, String modelo, int ano, String chassi, String placa) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.chassi = chassi;
		this.placa = placa;
	}
	void ligar() {
		System.out.println("Ligou");
	}
}
