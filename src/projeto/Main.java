package projeto;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scString = new Scanner(System.in);
		Scanner scInt = new Scanner(System.in);

		Steam steam = new Steam();

		steam.sistemaCompraVendaBiblioteca(scInt,scString);

	}
}
