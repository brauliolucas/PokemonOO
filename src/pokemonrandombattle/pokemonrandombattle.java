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
        
        Movimento m1 = new Movimento(4, 3, "mov1", 2, true);
        Movimento m2 = new Movimento(4, 3, "mov2", 2, true);
        
        for(int i=0;i<4;i++)
            move1[i] = m1;
        for(int i=0; i<4; i++)
            move2[i] = m2;
        
        Tipo t1 = new Tipo(1);
        Tipo t2 = new Tipo(2);
        
        Pokemon p1 = new Pokemon("XXX", 10, 10, 20, 10, 20, 5, t1, t2, move1, 1);
        Pokemon p2 = new Pokemon("YYY", 5, 10, 20, 10, 20, 10, t1, t2, move2, 2);
        Game jogo = new Game();
        jogo.battle(p1, p2);
    

	}

  

}
