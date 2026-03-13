package projeto;

public class Pessoa {
	private String nome;
	private int idade;
	private double dinheiro;
	
	Pessoa(String nome, int idade, double dinheiro){
		this.nome = nome;
		this.idade = idade;
		this.dinheiro = dinheiro;
	}
	
	public double exibirSaldo() {
		return dinheiro;
	}
	
	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}
	
}
