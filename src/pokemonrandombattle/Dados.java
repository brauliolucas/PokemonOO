package pokemonrandombattle;

import java.io.IOException;
import java.util.ArrayList;

public class Dados {
	public static ArrayList<Pokemon> pokemons = null;
	public static ArrayList<Movimento> movimentos = null;
	
	public static void Inicializar() {
		try {
			movimentos = ManipuladorDeArquivos.getArrayListDeBinarioMovimentos();
			pokemons = ManipuladorDeArquivos.getArrayListDeBinario();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
