package projeto.jogos;

public class FalloutNewVegas extends Jogo {
	public FalloutNewVegas(){
		super("Fallout New Vegas", "RPG", 39.0f, 3.0f, 2010, "Bethesda", 3);
	}
	
	@Override
	public String exibirInfo() {
		return "Welcome to Vegas. New Vegas. Enjoy your stay!";
	}
	
}