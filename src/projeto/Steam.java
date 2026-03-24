package projeto;

import projeto.jogos.*;

public class Steam {

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
            System.out.println(jogosDisponiveis[i]);
        }
    }

    public void compraJogos(Pessoa[] jogosUsuario,int id){




    }


}
