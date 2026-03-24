package projeto;

import projeto.jogos.Jogo;

import java.util.Scanner;

public class Pessoa {

	private String nomeUsuario;
	private int idSteam;
	private Jogo[] jogosUsuario = new Jogo[10];

	public Jogo[] getJogosUsuario() {
		return jogosUsuario;
	}

	public int getIdSteam() {
		return idSteam;
	}

	public void listaJogosUsuario(){

		for (int i = 0; i < jogosUsuario.length; i++ ){
			if (jogosUsuario[i] != null){
				System.out.println(jogosUsuario[i]);
			}
		}

	};

	public void preencherDados(Scanner sc, Scanner scInt){

		System.out.println("Insira o nome do usuario: ");
		nomeUsuario = sc.nextLine();

		System.out.println("Insira o idSteam: ");
		idSteam = scInt.nextInt();

	}
}
