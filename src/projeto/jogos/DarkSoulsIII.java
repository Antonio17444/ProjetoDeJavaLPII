package projeto.jogos;

public class DarkSoulsIII extends Jogo {
	public DarkSoulsIII(){
		super("Dark Souls", "Soulslike", 229.0f, 25.0f, 2016, "FromSoftware", 1);
	}
	
	@Override
	public String exibirInfo() {
		return "DARK SOULS™ continua a ultrapassar seus próprios"
				+ "limites em um ambicioso novo capítulo da série que"
				+ "definiu um gênero e que é aclamada pela crítica."
				+ "Prepare-se para abraçar a escuridão!";
	}
	
}
