package projeto.jogos;

public class Cyberpunk extends Jogo{
	public Cyberpunk(){
		super("Cyberpunk", "Open-Word", 199.0f, 70.0f, 2026, "CD Projekt RED", 0);
	}

	@Override
	public String exibirInfo() {
		return "Cyberpunk 2077 é um RPG de ação e aventura em "
				+ "mundo aberto que se passa em Night City, uma megalópole"
				+ "perigosa onde todos são obcecados por poder, glamour"
				+ "e alterações corporais.";
	}
	
}
