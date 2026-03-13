package projeto;

public class GrandTheftAutoVI extends Jogo {
	GrandTheftAutoVI(){
		super("Grand Theft Auto VI", "Open-Word", 999.0f, 210.0f, 2026, "Rockstar Games", 2);
	}
	
	@Override
	public String exibirInfo() {
		return "Aproveite os fenômenos do entretenimento Grand Theft"
				+ "Auto VI e Grand Theft Auto Online melhorados para uma"
				+ "nova geração, com gráficos deslumbrantes, tempos de"
				+ "carregamento mais rápidos, áudio 3D e mais, além de"
				+ "conteúdo exclusivo para jogadores do GTA Online.";
	}
	
}
