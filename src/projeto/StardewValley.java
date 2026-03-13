package projeto;

public class StardewValley extends Jogo {
	StardewValley(){
		super("Stardew Valley", "Simulação", 25.0f, 1.0f, 2016, "ConcernedApe", 6);
	}
	
	@Override
	public String exibirInfo() {
		return "Você herdou a antiga fazenda do seu avô, em Stardew"
				+ "Valley. Com ferramentas de segunda-mão e algumas"
				+ "moedas, você parte para dar início a sua nova vida. Será"
				+ "que você vai aprender a viver da terra, a transformar"
				+ "esse matagal em um próspero lar?";
	}
	
}
