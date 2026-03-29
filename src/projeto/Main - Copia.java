package projeto;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scString = new Scanner(System.in);
		Scanner scInt = new Scanner(System.in);

		Pessoa usuario = new Pessoa();

		usuario.preencherDados(scString);

		usuario.getHeroicConta().interfaceGraficaLojaJogos(scInt,usuario);

		scInt.close();
		scString.close();
	}
}
