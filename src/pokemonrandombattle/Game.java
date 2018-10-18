/**
 * @author Braulio
 */



package pokemonrandombattle;

import java.util.Random;

public class Game {
	Pokemon poke1;
	Pokemon poke2;
	
	
	
	
	
	
	public boolean checkHP(Pokemon poke1, Pokemon poke2) {
		if(poke1.getHp() > 0 && poke2.getHp() > 0) {
			return true;
			
		}
		else
			return false;
	}
	
	
	
	public void alteraHP(int dano, Pokemon poke) {
		poke.setHp((poke.getHp()-dano));
	}
	
	
	
	
	
	public Movimento geraMovimento(Pokemon poke) {
		Random gerador = new Random();
		
		
		return poke.moves[gerador.nextInt(5)];
	}

	
	public void battle(Pokemon poke1, Pokemon poke2) {
		
		
		
		while(checkHP(poke1,poke2)) {
			if(poke1.getVel() > poke2.getVel()) {
				alteraHP(calculoDano(poke1,poke2),poke2);
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
			}
		}
		
		
	}
	
	
	
	public int calculoDano(Pokemon atkr, Pokemon defr) {

		
		Movimento move = geraMovimento(atkr);
		int dano;
		dano = (int) Math.floor(((move.getDanoBase()*(atkr.getAtk()/defr.getDef())/50)+2)*(Tipo.tipo[move.getTipo()][defr.tipo1])*(Tipo.tipo[move.getTipo()][defr.tipo2]));
		
		
		return dano;
	}
	
	
	
	public void vencedor(Pokemon poke1) {
		
		
		System.out.println();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
