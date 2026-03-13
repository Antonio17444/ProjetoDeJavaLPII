package projeto;

public class HollowKnigth extends Jogo {
	HollowKnigth(){
		super("Hollow Knigth", "Indie", 47.0f, 9.0f, 2017, "Team Cherry", 9);
	}
	
	@Override
	public String exibirInfo() {
		return "Forje seu caminho em Hollow Knight! Uma aventura de"
				+ "ação épica em um vasto reino arruinado de insetos e"
				+ "heróis. Explore cavernas serpenteantes, lute contra"
				+ "criaturas malignas e alie-se a insetos bizarros num estilo"
				+ "clássico 2D desenhado à mão.";
	}
	
}
