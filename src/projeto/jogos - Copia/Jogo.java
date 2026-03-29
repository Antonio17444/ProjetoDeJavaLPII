package projeto.jogos;

public abstract class Jogo {
	
	protected String nome;
	protected String genero;
	protected double preco;
	protected double tamanho;
	protected int anoLancamento;
	protected String publisher;
	protected int id;
	
	Jogo(String nome, String genero, double preco, double tamanho, int anoLancamento, String publisher, int id){
		this.nome = nome;
		this.genero = genero;
		this.preco = preco;
		this.tamanho = tamanho;
		this.anoLancamento = anoLancamento;
		this.publisher = publisher;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "========================\n"+
				"Game: "+nome+"\n"+
				"Gênero: "+genero+"\n"+
				"Preço: $"+preco+"\n"+
				"Ano de lançamento: "+anoLancamento+"\n"+
				"ID: "+id+"\n"+
				"Tamanho: "+tamanho+"gb\n"+
				"========================\n";
	}
	

}
