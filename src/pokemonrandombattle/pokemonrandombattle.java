package pokemonrandombattle;



public class pokemonrandombattle {
	public static void main(String[] args) {  
		Dados.Inicializar();
		Game jogo = new Game();
		
		for (Pokemon poke1 : Dados.pokemons) {
            for (Pokemon poke2 : Dados.pokemons) {
                jogo.battle(poke1, poke2);
            }
        }
		
		
		
		
	}
	
}
