package pokemonrandombattle;



public class pokemonrandombattle {
	public static void main(String[] args) {  
		Dados.Inicializar();
		
		for(Pokemon poke1 : Dados.pokemons) {
			PokeDex.showPoke(poke1);
		}
		
		
		
		
	}
	
}
