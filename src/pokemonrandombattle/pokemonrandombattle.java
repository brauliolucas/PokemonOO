package pokemonrandombattle;

import InterfacesGraficas.*;
import java.util.*;
import javax.swing.*;
public class pokemonrandombattle {
	public static void main(String[] args) {  
		Dados.Inicializar();
		
                
                
		int escolha;
		do {
			escolha = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha uma opção" + "\n" +  "1 : PokeDex" + "\n" + "2 : Batalha" +"\n"+ "0 : Exit")); 
			switch (escolha) {
				case 0 : 
					System.exit(0);
				case 1 : 
					int id = Integer.parseInt(JOptionPane.showInputDialog("Escolha a ID do pokemon"));
					Pokemon poke = Dados.pokemons.get(id-1);
					PokeDex.showPoke(poke);
					break;
				case 2 : 
					TelaTitulo t1 = new TelaTitulo();
                                        t1.setVisible(true);
	            	
	                break;
	             
	           default:
	        	   JOptionPane.showMessageDialog(null,"Opcao errada! Tente novamente");
					
				
			}
		}while(escolha != 0 && escolha != 1 && escolha != 2);
		

	
		
		/*for (Pokemon poke1 : Dados.pokemons) {
            for (Pokemon poke2 : Dados.pokemons) {
            	Pokemon pok1 = new Pokemon(poke1);
        		Pokemon pok2 = new Pokemon(poke2);
        		pok1.setCurrentHp(pok1.getHp());
        		pok2.setCurrentHp(pok2.getHp());
                jogo.battle(pok1, pok2);
            }
        }
	*/
	}
}
