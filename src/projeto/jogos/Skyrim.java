package projeto.jogos;

public class Skyrim extends Jogo {
	public Skyrim(){
		super("The Elder Scrolls V: Skyrim", "RPG", 149.0f, 12.0f, 2016, "Bethesda", 8);
	}
	
	@Override
	public String exibirInfo() {
		return "Vencedor de mais de 200 prémios de Jogo do Ano, The"
				+ "Elder Scrolls V: Skyrim Special Edition dá vida à fantasia"
				+ "épica com um nível de detalhe espantoso. A Special"
				+ "Edition inclui o jogo aclamado pela crítica e suplementos"
				+ "com novas funcionalidades.";
	}
	
}
