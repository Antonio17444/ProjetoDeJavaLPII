package projeto.jogos;

public class HalfLife extends Jogo {
	public HalfLife(){
		super("Half Life 2", "Ação", 32.0f, 7.0f, 2004, "Valve", 5);
	}
	
	@Override
	public String exibirInfo() {
		return "Depois de despertar de um estado de estase na"
				+ "metrópole ocupada conhecida como Cidade 17, Gordon"
				+ "Freeman junta-se a Alyx Vance, que lidera o"
				+ "desesperado movimento de resistência humana.";
	}
	
}
