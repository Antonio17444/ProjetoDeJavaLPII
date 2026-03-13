package projeto;
import java.util.ArrayList;
import java.util.Scanner;

public class Gerenciamento {
	
	// --------- Instancias ---------
	
	Jogo cyberpunk = new Cyberpunk();
	Jogo darksouls3 = new DarkSoulsIII();
	Jogo doom = new Doom();
	Jogo falloutNV = new FalloutNewVegas();
	Jogo gtavi = new GrandTheftAutoVI();
	Jogo halflife = new HalfLife();
	Jogo hollowknigth = new HollowKnigth();
	Jogo re4 = new ResidentEvil4();
	Jogo tes6 = new Skyrim();
	Jogo stardew = new StardewValley();
	
	ArrayList<Jogo> jogos = new ArrayList<>();
	ArrayList<Jogo> biblioteca = new ArrayList<>();
	
	static Scanner sc = new Scanner(System.in);
	Pessoa player;
	
	// --------- Funções ---------
	
	public void preencherBiblioteca() {
		biblioteca.add(cyberpunk);
		biblioteca.add(darksouls3);
		biblioteca.add(doom);
		biblioteca.add(falloutNV);
		biblioteca.add(gtavi);
		biblioteca.add(halflife);
		biblioteca.add(hollowknigth);
		biblioteca.add(re4);
		biblioteca.add(stardew);
		biblioteca.add(tes6);
	}
	
	public void listarBiblioteca() {
		preencherBiblioteca();
		System.out.println("----------- BIBLIOTECA -----------\n");
		for(Jogo i : biblioteca) {
			System.out.println(i);
		}
	}
	
	public void removerJogo(int num) {
		for(Jogo j : jogos) {
			if(j.id == num) {
				jogos.remove(j);
				System.out.println(j.nome+" foi removido da lista de jogos\n");
			} else {
				System.out.println("Não foi possível identificar o jogo!\n");
			}
		}
	}
	
	public void listarJogos() {
		System.out.println("\n======== Seus Jogos ========\n");
		for(Jogo j : jogos) {
			System.out.println(j);
		}
	}
	
	public void buscarJogo(int num) {
		for(Jogo j : biblioteca) {
			if(j.id == num) {
				System.out.println(j);
			}
		}
	}
	
	public void comprarJogo(Jogo jogo) {
		if(jogo.preco <= player.exibirSaldo()) {
			jogos.add(jogo);
			player.setDinheiro(-jogo.preco);
			biblioteca.remove(jogo);
		} else {
			System.out.println("Saldo insuficiente para esse jogo!");
		}
	}
	
	// (Executar) Loop principal pra deixar o Main limpo de lógica
	
	public void executar() {
		
		System.out.println("------------- Bem vindo -------------\n");
		System.out.println("Esse sistema tem como objetivo simular\n"
				+ "uma biblioteca simples de compra de Jogos usando\n"
				+ "os conteúdos vistos na disciplina de LPII ☕\n");
		
		System.out.println("------------- Grupo -------------\n");
		System.out.println("✔ Antonio Henrique\n"
				+ "✔ Jose Fernando\n"
				+ "✔ Jose Ian\n"
				+ "✔ Samuel de Almeida");
		
		System.out.println("\n---------------------------------------\n");
		
		System.out.println("Olá, Para que possamos prosseguir\n"
				+ "é necessario um cadastro!\n");
		System.out.println("✎ Me informe seu nome: ");
		String nome = sc.nextLine();
		System.out.println("⌛ Informe sua idade: ");
		int idade = sc.nextInt();
		sc.nextLine();
		System.out.print("⚔ Informe seu orçamento para comprar jogos: \nR$ ");
		double dinheiro = sc.nextDouble();
		sc.nextLine();
		
		Pessoa player = new Pessoa(nome, idade, dinheiro); 
		
		int op;
		
		// inicio do loop com menu de opções
		
		do {
			
			//➤
			System.out.println("\n============ Menu ============\n");
			System.out.println("➤ 1 - Listar Jogos");
			System.out.println("➤ 2 - Mostrar saldo disponivel");
			System.out.println("➤ 3 - Listar sua biblioteca de jogos");
			System.out.println("➤ 4 - Sair do menu e fechar o programa");
			System.out.println("\n✎ Informe a opção desejada: ");
			op = sc.nextInt();
			sc.nextLine();
			
			switch (op) {
				
			case 1: 
				
				listarBiblioteca();
				
				int op2;
				
				do {
					
					System.out.println("\n============ Menu ============\n");
					System.out.println("➤ 1 - Selecionar jogo");
					System.out.println("➤ 2 - Voltar");
					System.out.println("\nSelecione a opção desejada: ");
					op2 = sc.nextInt();
					sc.nextLine();
					
					switch (op2){
						
					case 1:
						
						System.out.println("Selecione o ID do jogo que deseja comprar: ");
						int selecionar = sc.nextInt();
						sc.nextLine();
						System.out.println("\nVocê selecionou: ");
						buscarJogo(selecionar);
						comprarJogo();
						break;
					}
					
					
					
				} while (op2 != 2);
				break;
				
			case 2:
				
				System.out.println("\nVocê ainda possui [ $"+player.exibirSaldo()+" ]\n");
				break;
				
			case 3:
				
				listarJogos();
				break;
				
			}
			
		} while (op != 4);
		
	}
		
}
