package projeto;

public class FalloutNewVegas extends Jogo {
	FalloutNewVegas(){
		super("Fallout New Vegas", "RPG", 39.0f, 3.0f, 2010, "Bethesda", 5);
	}
	
	@Override
	public String exibirInfo() {
		return "Welcome to Vegas. New Vegas. Enjoy your stay!";
	}
	
}