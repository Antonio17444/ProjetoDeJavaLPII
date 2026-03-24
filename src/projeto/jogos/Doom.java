package projeto.jogos;

public class Doom extends Jogo {
	public Doom(){
		super("Doom: The Dark Ages", "Ação", 349.0f, 100.0f, 2025, "Bethesda", 2);
	}
	
	@Override
	public String exibirInfo() {
		return "DOOM: The Dark Ages é a prequela dos aclamados"
				+ "títulos DOOM (2016) e DOOM Eternal que conta a"
				+ "história épica e cinematográfica da origem da fúria de"
				+ "DOOM Slayer. Os jogadores entrarão na pele calejada de"
				+ "DOOM Slayer em uma guerra medieval sinistra, sombria"
				+ "e inédita contra as forças do Inferno.";
	}
	
}
