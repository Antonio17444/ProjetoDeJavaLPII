package projeto;

import projeto.jogos.*;

import java.util.Scanner;

public class LojaJogos {

    private Jogo[] jogosDisponiveis = new Jogo[10];

    public void adicionaJogosBibliotecas(){

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

        jogosDisponiveis[cyberpunk.getId()] = cyberpunk;
        jogosDisponiveis[darksouls3.getId()] = darksouls3;
        jogosDisponiveis[doom.getId()] = doom;
        jogosDisponiveis[falloutNV.getId()] = falloutNV;
        jogosDisponiveis[gtavi.getId()] = gtavi;
        jogosDisponiveis[halflife.getId()] = halflife;
        jogosDisponiveis[hollowknigth.getId()] = hollowknigth;
        jogosDisponiveis[re4.getId()] = re4;
        jogosDisponiveis[tes6.getId()] = tes6;
        jogosDisponiveis[stardew.getId()] = stardew;

    }

    public void imprimirGames(){
        for (int i = 0; i < jogosDisponiveis.length; i++ ){
            if (jogosDisponiveis[i] != null){
                System.out.println(jogosDisponiveis[i]);
            }
        }
    }
    
    public Jogo obterJogo(int id) {
        if (jogosDisponiveis[id] != null) {
            Jogo jogo = jogosDisponiveis[id];
            jogosDisponiveis[id] = null;
            return jogo;
        }
        return null;
    }
    
    public void interfaceGraficaLojaJogos(Scanner sc,Pessoa usuario){

        adicionaJogosBibliotecas();

        boolean condition = true;
        int opcoes;

        do {

            System.out.println("\n============ Menu ============\n");
            System.out.println("➤ 1 - Listar Jogos");
            System.out.println("➤ 2 - Listar sua biblioteca de jogos");
            System.out.println("➤ 3 - Sair do menu e fechar o programa");
            System.out.println("\n✎ Informe a opção desejada: ");

            opcoes = sc.nextInt();

            switch (opcoes) {

                case 1:
                    System.out.println("\n=== Lista de Jogos ===");

                    imprimirGames();

                    int subOpcao;
                    do {
                        System.out.println("\n============ Menu ============\n");
                        System.out.println("➤ 1 - Adicionar Jogo Biblioteca");
                        System.out.println("➤ 2 - Remover Jogo Biblioteca");
                        System.out.println("➤ 3 - Voltar");
                        System.out.println("\nSelecione a opção desejada: ");

                        subOpcao = sc.nextInt();

                        switch (subOpcao) {
                            case 1:
                                System.out.println("Selecione a id do jogo: ");
                                int idCompra = sc.nextInt();
                                Jogo jogo = obterJogo(idCompra);
                                usuario.comprarJogo(jogo);
                                break;
                                
                            case 2:
                                System.out.println("Selecione a id do jogo: ");
                                usuario.removerJogo(sc.nextInt());
                                break;
                            case 3:
                                System.out.println("Voltando...");
                                break;

                            default:
                                System.out.println("Opção inválida.");
                        }

                    } while (subOpcao != 3);

                    break;

                case 2:
                    System.out.println("\n=== Sua biblioteca ===");
                    usuario.listaJogosUsuario();
                    break;

                case 3:
                    System.out.println("Encerrando programa...");
                    condition = false;
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (condition);
    }

}
