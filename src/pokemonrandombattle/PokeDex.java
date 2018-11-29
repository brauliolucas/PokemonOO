package pokemonrandombattle;

public class PokeDex {
	
	
	
	/**
	 * imprime as informações do pokemon e movimentos
	 * @param1 pokemon
	 * 
	 *
	 */
	public static void showPoke(Pokemon poke) {
		System.out.println("Nome : " + poke.getNome());
		System.out.println("HP : " + poke.getHp());
		System.out.println("Atk : " + poke.getAtk());
		System.out.println("spAtk : " + poke.getSpAtk());
		System.out.println("Def : " + poke.getDef());
		System.out.println("spDef : " + poke.getSpDef());
		System.out.println("Vel : " + poke.getVel());
		System.out.println("Tipo 1 : " + poke.tipo1.nome);
		System.out.println("Tipo 2 : " + poke.tipo2.nome);
		System.out.println("Movimentos ");
		for(int i=0;i<4;i++) {
			if(poke.moves[i]!= null) {
				System.out.println("	Nome : " + poke.moves[i].getNome());
				System.out.println("	Dano Base : " + poke.moves[i].getDanoBase());
				System.out.println("	Tipo : " + poke.moves[i].getTipo());
				System.out.println("");
			}
		}
		
	}
	
	
	


}
