


package pokemonrandombattle;

import java.util.Random;

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
	 *calcula o dano entre 2 pokemons utilizando modificadores de vantagem, desvantagem, ataque e defesa e arredonda para int evitando numeros decimais
	 *@param1 pokemon que est� desferindo ataque
	 *@param2 pokemon que est� recebendo ataque
	 * 
	 *@return retorna dano a ser causado
	 */
	
	public int calculoDano(Pokemon atkr, Pokemon defr) {

		Movimento move = geraMovimento(atkr);
		int dano;
		
		switch(move.getClasse()) {
			case 1: //movimento de dano
				dano = move.executeMove(move, atkr, defr);
				System.out.println("Pokemon " + atkr.getNome() +  " executou movimento : " + move.getNome() );
				System.out.println("Causou : " + dano +  " de dano em " + defr.getNome());
				break;
			case 2: //movimento de cura
				Cura aux = (Cura) move;
				dano = aux.executeMove(move, atkr, defr);
				System.out.println("Pokemon " + atkr.getNome() +  " executou movimento : " + move.getNome() );
				System.out.println(atkr.getNome() + "Se curou em : " + move.getDanoBase());
				break;
			case 3: //movimento de buffAtk
				BuffAtk aux2 = (BuffAtk) move;
				dano = aux2.executeMove(move, atkr, defr);
				System.out.println("Pokemon " + atkr.getNome() +  " executou movimento : " + move.getNome() );
				System.out.println(atkr.getNome() + "Aumentou seu Atk");
				break;
				
			case 4: //movimento buffspatk
				BuffSpAtk aux3 = (BuffSpAtk) move;
				dano = aux3.executeMove(move, atkr, defr);
				System.out.println("Pokemon " + atkr.getNome() +  " executou movimento : " + move.getNome() );
				System.out.println(atkr.getNome() + "Aumentou seu SpAtk");
				break;
				
			case 5: //movimento buffdef
				BuffDef aux4 = (BuffDef) move;
				dano = aux4.executeMove(move, atkr, defr);
				System.out.println("Pokemon " + atkr.getNome() +  " executou movimento : " + move.getNome() );
				System.out.println(atkr.getNome() + "Aumentou sua Def");
				break;
				
			case 6: //movimento buffspdef
				BuffSpDef aux5 = (BuffSpDef) move;
				dano = aux5.executeMove(move, atkr, defr);
				System.out.println("Pokemon " + atkr.getNome() +  " executou movimento : " + move.getNome() );
				System.out.println(atkr.getNome() + "Aumentou sua SpDef");
				break;
				
			case 7: //movimento buffvel
				BuffVel aux6 = (BuffVel) move;
				dano = aux6.executeMove(move, atkr, defr);
				System.out.println("Pokemon " + atkr.getNome() +  " executou movimento : " + move.getNome() );
				System.out.println(atkr.getNome() + "Aumentou sua Vel");
				break;
				
			case 8: //movimento debuffatk
				DebuffAtk aux7 = (DebuffAtk) move;
				dano = aux7.executeMove(move, atkr, defr);
				System.out.println("Pokemon " + atkr.getNome() +  " executou movimento : " + move.getNome() );
				System.out.println(atkr.getNome() + "Reduziu o Atk de " + defr.getNome());
				break;
				
			case 9: //movimento debuffvel
				DebuffVel aux8 = (DebuffVel) move;
				dano = aux8.executeMove(move, atkr, defr);
				System.out.println("Pokemon " + atkr.getNome() +  " executou movimento : " + move.getNome() );
				System.out.println(atkr.getNome() + "Reduziu a Vel de " + defr.getNome());
				break;
			default:
				dano = 0;
				break;
		}

		
		return dano;
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
					vencedor(poke1);
                                        status(poke1);
					break;
				}
			}
		}
		
		
	}
	
	/**
	 * declara o vencedor da batalha pokemon
	 * @param1 pokemon
	 * 
	 */
	public void vencedor(Pokemon poke1) {
		System.out.println("O vencedor foi : " + poke1.getNome());
	}
	/**
         * Status do HP após batalha
         * @param poke 
         */
        public void status(Pokemon poke){
            System.out.println("HP: " + poke.getHp());
        }
}
