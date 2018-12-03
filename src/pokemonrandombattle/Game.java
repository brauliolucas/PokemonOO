


package pokemonrandombattle;

import InterfacesGraficas.InterfaceBatalha;
import java.io.IOException;
import java.util.Random;

public class Game {
	Pokemon poke1;
	Pokemon poke2;
        public InterfaceBatalha batalha;
        protected static String logDeBatalha;
	
	/**
	 * checa se o hp � maior que zero e retorna booleano
	 * @return booleano, true se hp maior que 0 e false caso contrario
	 */
	public boolean checkHP() {
		return (poke1.getCurrentHp() > 0 && poke2.getCurrentHp() > 0);
	}
	
	
	
	/**
	 * altera o HP depois do calculo de dano
	 * @param1 quantidade de dano a ser causado
	 * @param2 pokemon recebera dano
	 * 
	 */
	public void alteraHP(int dano, Pokemon poke) {
		poke.setCurrentHp((poke.getCurrentHp()-dano));

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
				dano = 30*move.executeMove(move, atkr, defr);
				logDeBatalha = logDeBatalha + "Pokemon " + atkr.getNome() +  " executou movimento : " + move.getNome()+"\n";
				logDeBatalha = logDeBatalha + "Causou : " + dano +  " de dano em " + defr.getNome()+"\n";
				break;
			case 2: //movimento de cura
				Cura aux = new Cura(move);
				dano = aux.executeMove(aux, atkr, defr);
				logDeBatalha = logDeBatalha + "Pokemon " + atkr.getNome() +  " executou movimento : " + aux.getNome()+"\n";
				logDeBatalha = logDeBatalha + atkr.getNome() + " Se curou em : " + move.getDanoBase()+"\n";
				break;
			case 3: //movimento de buffAtk
				BuffAtk aux2 =  new BuffAtk(move);
				dano = aux2.executeMove(aux2, atkr, defr);
				logDeBatalha = logDeBatalha + "Pokemon " + atkr.getNome() +  " executou movimento : " + aux2.getNome()+"\n";
				logDeBatalha = logDeBatalha + atkr.getNome() + " Aumentou seu Atk "+"\n";
				break;
				
			case 4: //movimento buffspatk
				BuffSpAtk aux3 = new BuffSpAtk(move);
				dano = aux3.executeMove(aux3, atkr, defr);
				logDeBatalha = logDeBatalha + "Pokemon " + atkr.getNome() +  " executou movimento : " + aux3.getNome()+"\n";
				logDeBatalha = logDeBatalha + atkr.getNome() + " Aumentou seu SpAtk "+"\n";
				break;
				
			case 5: //movimento buffdef
				BuffDef aux4 = new BuffDef(move);
				dano = aux4.executeMove(aux4, atkr, defr);
				logDeBatalha = logDeBatalha + "Pokemon " + atkr.getNome() +  " executou movimento : " + aux4.getNome()+"\n";
				logDeBatalha = logDeBatalha + atkr.getNome() + " Aumentou sua Def "+"\n";
				break;
				
			case 6: //movimento buffspdef
				BuffSpDef aux5 = new BuffSpDef(move);
				dano = aux5.executeMove(aux5, atkr, defr);
				logDeBatalha = logDeBatalha + "Pokemon " + atkr.getNome() +  " executou movimento : " + aux5.getNome()+"\n";
				logDeBatalha = logDeBatalha + atkr.getNome() + " Aumentou sua SpDef "+"\n";
				break;
				
			case 7: //movimento buffvel
				BuffVel aux6 = new BuffVel(move);
				dano = aux6.executeMove(aux6, atkr, defr);
				logDeBatalha = logDeBatalha + "Pokemon " + atkr.getNome() +  " executou movimento : " + aux6.getNome()+"\n";
				logDeBatalha = logDeBatalha + atkr.getNome() + " Aumentou sua Vel"+"\n";
				break;
				
			case 8: //movimento debuffatk
				DebuffAtk aux7 = new DebuffAtk(move);
				dano = aux7.executeMove(aux7, atkr, defr);
				logDeBatalha = logDeBatalha + "Pokemon " + atkr.getNome() +  " executou movimento : " + aux7.getNome()+"\n";
				logDeBatalha = logDeBatalha + atkr.getNome() + " Reduziu o Atk de " + defr.getNome()+"\n";
				break;
				
			case 9: //movimento debuffvel
				DebuffVel aux8 = new DebuffVel(move);
				dano = aux8.executeMove(aux8, atkr, defr);
				logDeBatalha = logDeBatalha + "Pokemon " + atkr.getNome() +  " executou movimento : " + aux8.getNome()+"\n";
				logDeBatalha = logDeBatalha + atkr.getNome() + " Reduziu a Vel de " + defr.getNome()+"\n";
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
	public void battle(int n1, int n2) throws IOException, ClassNotFoundException {
                
		poke1 = new Pokemon(Dados.pokemons.get(n1));
                poke2 = new Pokemon(Dados.pokemons.get(n2));
                poke1.setCurrentHp(poke1.getHp());
                poke2.setCurrentHp(poke2.getHp());
                if(poke1.getNome().equals(poke2.getNome())){
                    poke1.setNome(poke1.getNome()+" A");
                    poke2.setNome(poke2.getNome()+" B");
                }
                logDeBatalha = "Começa o combate!"+poke1.getNome()+" contra "+poke2.getNome()+"!\n";
                batalha = new InterfaceBatalha(poke1, poke2);
                
                batalha.setVisible(true);
		
		do {
			if(poke1.getVel() > poke2.getVel()) {
				alteraHP(calculoDano(poke1,poke2),poke2);
				if(!checkHP()) {
					break;
				}
				alteraHP(calculoDano(poke2,poke1),poke1);
				if(!checkHP()) {
					break;
				}
			}
			else {
				alteraHP(calculoDano(poke2,poke1),poke1);
				if(!checkHP()) {
					break;
				}
				alteraHP(calculoDano(poke1,poke2),poke2);
				if(!checkHP()) {
					break;
				}
			}
			
			logDeBatalha = logDeBatalha +"======================================================\n"+
                                "[Fim Da Rodada]" + poke1.getNome() + " com HP = " + poke1.getCurrentHp() + " e " + poke2.getNome() + " com HP = " + poke2.getCurrentHp()+"\n"+
                                "======================================================\n";
		}while(checkHP());
		
		vencedor();
	}
	
	/**
	 * declara o vencedor da batalha pokemon 
	 */
	public void vencedor() {
		if(poke1.getCurrentHp() > 0) {
                        logDeBatalha = logDeBatalha +"======================================================\n"+
                        "[Fim Da Rodada]" + poke1.getNome() + " com HP = " + poke1.getCurrentHp() + " e " + poke2.getNome() + " com HP = 0\n"+
                        "======================================================\n";
			logDeBatalha = logDeBatalha + "!!!!! O vencedor foi : " + poke1.getNome() + "!!!!!!"+"\n";
			logDeBatalha = logDeBatalha + "Restando com : " + poke1.getCurrentHp() + " de HP";
		}
		else {
                        logDeBatalha = logDeBatalha +"======================================================\n"+
                        "[Fim Da Rodada]" + poke1.getNome() + " com HP = 0 e " + poke2.getNome() + " com HP = " + poke2.getCurrentHp()+"\n"+
                        "======================================================\n";
			logDeBatalha = logDeBatalha + "!!!!! O vencedor foi : " + poke2.getNome() + "!!!!!!\n";
			logDeBatalha = logDeBatalha + "Restando com : " + poke2.getCurrentHp() + " de HP";
		}
                batalha.setLogDeBatalha(logDeBatalha);

	}
}
