


package pokemonrandombattle;

import java.util.Random;
import javax.swing.JOptionPane;

public class Game {
	Pokemon poke1;
	Pokemon poke2;
	
	
	
	
	
	/**
	 * checa se o hp � maior que zero e retorna booleano
	 * @param1 pokemon1
	 * @param2 pokemon2
	 * 
	 * @return booleano, true se hp maior que 0 e false caso contrario
	 */
        
        
	public boolean checkHP(Pokemon poke1, Pokemon poke2) {
		if(poke1.getHp() > 0 && poke2.getHp() > 0) {
			return true;
			
		}
		else
			return false;
	}
	
	
	/**
	 * altera o HP depois do calculo de dano
	 * @param1 quantidade de dano a ser causado
	 * @param2 pokemon recebera dano
	 * 
	 */
	public void alteraHP(int dano, Pokemon poke) {
		poke.setHp((poke.getHp()-dano));
	}
	
	
	
	
	
	/**
	 * gera um movimento aleatorio para ser usado
	 * @param1 pokemon que contem os movimentos
	 *
	 *@return retorna um movimento gerado aleatoriamente
	 */
	public Movimento geraMovimento(Pokemon poke) {
		Random gerador = new Random();
		
		
		return poke.moves[gerador.nextInt(4)];
	}

	
	/**
	 * batalha randomizada entre pokemons, continua enquanto o HP dos 2 for maior que 0
	 * @param1	pokemon1
	 * @param2 	pokemon2
	 * 
	 * 
	 */
	public void battle(Pokemon poke1, Pokemon poke2) {
		
		
		
		while(checkHP(poke1,poke2)) {
			if(poke1.getVel() > poke2.getVel()) {
				alteraHP(calculoDano(poke1,poke2),poke2);
				if(!checkHP(poke1,poke2)) {
					vencedor(poke1);
					break;
				}
				alteraHP(calculoDano(poke2,poke1),poke1);
                                if(!checkHP(poke1,poke2)) {
					vencedor(poke1);
					break;
				}
			}
			else {
				alteraHP(calculoDano(poke2,poke1),poke1);
				if(!checkHP(poke1,poke2)) {
					vencedor(poke2);
					break;
				}
				alteraHP(calculoDano(poke1,poke2),poke2);
                                if(!checkHP(poke1,poke2)) {
					vencedor(poke2);
					break;
				}
			}
		}
		
		
	}
	
	
	/**
	 *calcula o dano entre 2 pokemons utilizando modificadores de vantagem, desvantagem, ataque e defesa e arredonda para int evitando numeros decimais
	 *@param1 pokemon que est� desferindo ataque
	 *@param2 pokemon que est� recebendo ataque
	 * 
	 *@return retorna dano a ser causado
	 */
	
	public int calculoDano(Pokemon atkr, Pokemon defr) {

		
		Movimento move = geraMovimento(atkr);
                System.out.println("Movimento: " + move.getNome());
		int dano;
		
		dano = move.executeMove(move, atkr, defr);
		
                System.out.println( "Dano: " + dano + "Atk: " + atkr.getNome());
		return dano;
	}
	
	
	/**
	 * declara o vencedor da batalha pokemon
	 * @param1 pokemon
	 * 
	 */
	public void vencedor(Pokemon poke1) {
		
		
		System.out.println("Vencedor: " + poke1.getNome());
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
