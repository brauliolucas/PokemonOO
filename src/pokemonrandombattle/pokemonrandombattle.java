package pokemonrandombattle;



public class pokemonrandombattle {
	public static void main(String[] args) {  
		Dados.Inicializar();
		Game jogo = new Game();
		
		for (Pokemon poke1 : Dados.pokemons) {
            for (Pokemon poke2 : Dados.pokemons) {
        		poke1.setCurrentHp(poke1.getHp());
        		poke2.setCurrentHp(poke2.getHp());
                jogo.battle(poke1, poke2);
            }
        }
		
		
		
		
	}
	
}
