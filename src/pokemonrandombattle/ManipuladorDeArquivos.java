
package pokemonrandomizerbattle;

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
    
public ArrayList getArrayListDeBinario() throws IOException, ClassNotFoundException{
    ArrayList<Pokemon> pokemons = null;
    try {
        
        FileInputStream ios = new FileInputStream("DataBase.bin");
        ObjectInputStream binario = new ObjectInputStream(ios);
        pokemons = (ArrayList<Pokemon>) binario.readObject();
        ios.close();
        binario.close();
        
    } catch (FileNotFoundException e){
        converterCSVEmBinario();
    } finally{
        
        return pokemons;
    } 
    
    
    
}

public void converterCSVEmBinario() throws IOException  {
    
    String arquivoCSV = "DataBase.csv";
    BufferedReader dataBase = null;
    String linha = "";
    dataBase.readLine();
    File arquivoBin = new File("DataBase.bin");
    ObjectOutputStream arquivoBinario = new ObjectOutputStream(new FileOutputStream(arquivoBin));
    
    try {
        
        ArrayList<Pokemon> arrayPokemons = new ArrayList();
        dataBase = new BufferedReader(new FileReader(arquivoCSV));
        
        while ((linha = dataBase.readLine()) != null) {
            
            
            String[] dadosPokemon = linha.split(";");
            ArrayList dadosInt = new ArrayList();
            for(int i = 1; i<13;i++){
                dadosInt.add(Integer.parseInt(dadosPokemon[i])); 
            }
            Pokemon poke = new Pokemon(dadosPokemon[0],dadosInt);
            arrayPokemons.add(poke);
            

        }
        arquivoBinario.writeObject(arrayPokemons);
        arquivoBinario.flush();
        
        
    } catch (FileNotFoundException e) {
        System.out.println("Erro! "+e.getMessage());
    } finally {
        if (dataBase != null) {
            try {
                dataBase.close();
                arquivoBinario.close();
            } catch (IOException e) {
                System.out.println("Erro! "+e.getMessage());
            }
        }
    }
}
}

