package projeto;

public class ResidentEvil4 extends Jogo{
	ResidentEvil4(){
		super("Resident Evil 4", "Ação", 89.0f, 15.0f, 2005, "Capcom", 8);
	}
	
	@Override
	public String exibirInfo() {
		return "Sobrevivência é apenas o começo. Seis anos se"
				+ "passaram desde o desastre biológico em Raccoon City."
				+ "Leon S. Kennedy, um dos sobreviventes, segue o rastro"
				+ "da raptada filha do presidente até uma vila europeia"
				+ "isolada, onde há algo terrivelmente errado com os habitantes.";
	}
	
}
