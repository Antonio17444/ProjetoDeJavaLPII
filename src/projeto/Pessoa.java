package projeto;

import projeto.jogos.Jogo;

import java.util.Scanner;

public class Pessoa {

	private String nomeUsuario;
	private int idSteam;
	private Jogo[] jogosUsuario = new Jogo[10];

	public void preencherDados(Scanner sc, Scanner scInt){

		System.out.println("Insira o nome do usuario: ");
		nomeUsuario = sc.nextLine();

		System.out.println("Insira o idSteam: ");
		idSteam = scInt.nextInt();

	}
}
