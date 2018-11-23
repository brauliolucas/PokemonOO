/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonrandombattle;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ice
 */
public class lerArq {
    
    
    public void lerArq () throws FileNotFoundException {
        Scanner input = new Scanner(new File("Database.txt"));
        
        Pokemon [] pokemons = new Pokemon [0];
        while(input.hasNext()){
            String nome = input.next();
            int hp = input.nextInt();
            int atk = input.nextInt();
            int spatk = input.nextInt();
            int def = input.nextInt();
            int spdef = input.nextInt();
            int vel = input.nextInt();
            Tipo tipo1 = input.next();
            Tipo tipo2 = input.nex();
            Movimento moves [] = null;

            for (int i = 0; i < 4; i++) {
                String nomeMove = input.next();
                int danoBase = input.nextInt();
                int precisao = input.nextInt();
                int tipo = input.nextInt();
                boolean moveFisico = Boolean.parseBoolean(input.next());

                moves[i] = new Movimento(precisao, danoBase, nomeMove, tipo, moveFisico);
            }
            int id = Integer.parseInt(input.next());
            
              //nome hp atk spatk def spdef vel tipo1 tipo2 moves ID
            pokemons[0] = new Pokemon (nome,hp,atk,spatk,def,spdef,vel,tipo1,tipo2,moves,id);
            
            


        }
        
    }
    
    
}
