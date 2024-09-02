package loja.veiculo;

public class Carro extends Veiculo {
	boolean vidroEletrico = true;
	int capacidadePortaMala;
	
	public Carro(int capacidadePortaMala, String marca, String modelo, int ano, String chassi, String placa, int cPM) {
		
		super(marca,modelo,ano,chassi,placa);
		this.capacidadePortaMala = cPM;
	}
	
	void darCavaloDePau() {
		System.out.println("Marcou o chão");
	}
}
