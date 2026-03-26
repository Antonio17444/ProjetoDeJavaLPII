package projeto;

import projeto.jogos.Jogo;

import java.util.Scanner;

public class Pessoa {

	private String nomeUsuario;
	private Jogo[] jogosUsuario = new Jogo[10];
	private LojaJogos heroicConta = new LojaJogos();

	public Jogo[] getJogosUsuario() {
		return jogosUsuario;
	}

	public LojaJogos getHeroicConta() {
		return heroicConta;
	}

	public void listaJogosUsuario(){

		for (int i = 0; i < jogosUsuario.length; i++ ){
			if (jogosUsuario[i] != null){
				System.out.println(jogosUsuario[i]);
			}
		}

	};

	public void preencherDados(Scanner sc){

		System.out.println("Preencha os Dados do usuario");

		System.out.println("Insira o nome do usuario: ");
		nomeUsuario = sc.nextLine();

	}
}
