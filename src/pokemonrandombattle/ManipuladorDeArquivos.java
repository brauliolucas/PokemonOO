
package pokemonrandombattle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author ice
 */
public abstract class ManipuladorDeArquivos {

	/**
	 * Pega o ArrayList de dentro de um arquivo binario contendo todos os pokemons.
	 * 
	 * @return pokemons
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static ArrayList<Pokemon> getArrayListDeBinario() throws IOException, ClassNotFoundException {
		ArrayList<Pokemon> pokemons = null;
		try {

			FileInputStream ios = new FileInputStream("DataBase.bin");
			ObjectInputStream binario = new ObjectInputStream(ios);
			pokemons = (ArrayList<Pokemon>) binario.readObject();
			ios.close();
			binario.close();

		} catch (FileNotFoundException e) {
			System.out.println("Erro! " + e.getMessage() + " Verificando existencia de arquivo csv do banco de dados. ");
			converterCSVEmBinario();
			try {
				FileInputStream ios = new FileInputStream("DataBase.bin");
				ObjectInputStream binario = new ObjectInputStream(ios);
				pokemons = (ArrayList<Pokemon>) binario.readObject();
				ios.close();
				binario.close();
			} catch (FileNotFoundException x) {
				System.out.println("Nao localizado arquivo do banco de dados em nenhum formato valido.");
			}

		}
		return pokemons;
	}

	/**
	 * Cria um arquivo binario, que contem o ArrayList de Pokemons, a partir de um
	 * arquivo csv
	 * 
	 * @throws IOException
	 */
	public static void converterCSVEmBinario() throws IOException {

		String arquivoCSV = "DataBase.csv";

		try {

			ArrayList<Pokemon> arrayPokemons = new ArrayList<Pokemon>();
			BufferedReader dataBase = new BufferedReader(new FileReader(arquivoCSV));
			String linha = "";
			dataBase.readLine();
			int id = 1;
			while ((linha = dataBase.readLine()) != null) {

				String[] dadosPokemon = linha.split(";");
				Pokemon poke = new Pokemon(dadosPokemon, id);
				arrayPokemons.add(poke);
				id++;

			}
			File arquivoBin = new File("DataBase.bin");
			ObjectOutputStream arquivoBinario = new ObjectOutputStream(new FileOutputStream(arquivoBin));
			arquivoBinario.writeObject(arrayPokemons);
			arquivoBinario.flush();
			dataBase.close();
			arquivoBinario.close();

		} catch (FileNotFoundException e) {
			System.out.println("Erro! " + e.getMessage());
		}
	}

	public static ArrayList<Movimento> getArrayListDeBinarioMovimentos() throws IOException, ClassNotFoundException {
		ArrayList<Movimento> arrayMovimentos = null;

		try {

			FileInputStream ios = new FileInputStream("Movimento.bin");
			ObjectInputStream binario = new ObjectInputStream(ios);
			arrayMovimentos = (ArrayList<Movimento>) binario.readObject();
			ios.close();
			binario.close();

		} catch (FileNotFoundException e) {
			System.out.println("[Movimento] Erro! " + e.getMessage() + ". Verificando existencia de arquivo csv do banco de dados. ");
			converterCSVEmBinarioMovimento();
			try {
				FileInputStream ios = new FileInputStream("Movimento.bin");
				ObjectInputStream binario = new ObjectInputStream(ios);
				arrayMovimentos = (ArrayList<Movimento>) binario.readObject();
				ios.close();
				binario.close();
			} catch (FileNotFoundException x) {
				System.out.println("[Movimento] Nao localizado arquivo do banco de dados em nenhum formato valido.");
			}

		}

		return arrayMovimentos;
	}
	
	public static void converterCSVEmBinarioMovimento() throws IOException {

		String arquivoCSV = "movimento.csv";

		try {

			ArrayList<Movimento> arrayMovimentos = new ArrayList<Movimento>();
			BufferedReader dataBase = new BufferedReader(new FileReader(arquivoCSV));
			String linha = "";
			dataBase.readLine();
			while ((linha = dataBase.readLine()) != null) {

				String[] dadosMovimento = linha.split(";");
				Movimento move = new Movimento(dadosMovimento);
				arrayMovimentos.add(move);
			}
			File arquivoBin = new File("Movimento.bin");
			ObjectOutputStream arquivoBinario = new ObjectOutputStream(new FileOutputStream(arquivoBin));
			arquivoBinario.writeObject(arrayMovimentos);
			arquivoBinario.flush();
			dataBase.close();
			arquivoBinario.close();

		} catch (FileNotFoundException e) {
			System.out.println("[Movimento] Erro! " + e.getMessage());
		}
	}

	/**
	 * Converte os valores do CSV, que vem em string, para int
	 * 
	 * @param valor valor a se converter em int
	 * @param nome  nome do pokemon em que houve erro na conversao de algum atributo
	 * @return
	 */
	public static int strToInt(String valor, String nome) {
		try {
			return Integer.valueOf(valor);
		} catch (NumberFormatException e) {
			System.out.println("Erro! " + e.getMessage() + " nao foi possivel converter " + valor + "  em numero.Pokemon eh " + nome);
			return 0;
		}
	}
}
