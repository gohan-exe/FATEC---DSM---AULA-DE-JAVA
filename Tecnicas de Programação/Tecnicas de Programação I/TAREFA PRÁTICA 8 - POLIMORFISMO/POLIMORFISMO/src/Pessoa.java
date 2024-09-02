public class Pessoa {
    public String nome;
    public int idade;
    public Endereco endereco;

    public Pessoa(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;

    }

    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome + " Idade: " + idade + " Endereço: " + endereco.rua + " , " + endereco.cidade + " , " + endereco.estado);
    }

    
}