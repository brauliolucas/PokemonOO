package pokemonrandombattle;

///to-do list

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


///->selecionar entre pokedex e batalha
///-> escolher 2 pokemons
///->fRead
///->fWrite





public class pokemonrandombattle {
        


	public static void main(String[] args) {
             
        Movimento move1 [] = new Movimento[4];
        Movimento move2 [] = new Movimento[4];
        Movimento m = new Movimento(5, 5, "0", 1, true);
        Movimento m1 = new Movimento(5, 5, "1", 1, true);
        Movimento m2 = new Movimento(5, 5, "2", 1, true);
        Movimento m3 = new Movimento(5, 5, "3", 1, true);
        Movimento mn = new Movimento(4, 3, "hfdxh", 2, true);
        move1[0] = m;
        move1[1] = m1;
        move1[2] = m2;
        move1[3] = m3;
        for(int i=0; i<4; i++)
            move2[i] = mn;
        Tipo t1 = new Tipo(1);
        Tipo t2 = new Tipo(2);
        Pokemon p1 = new Pokemon("fmgve", 10, 10, 20, 10, 20, 5, t1, t2, move1, 1);
        Pokemon p2 = new Pokemon("ghraw", 10, 10, 20, 10, 20, 5, t1, t2, move2, 2);
        Game jogo = new Game();
        jogo.battle(p1, p2);
    

	}

  

}
