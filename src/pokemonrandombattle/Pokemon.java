package pokemonrandombattle;

import java.io.Serializable;
import java.util.ArrayList;


public class Pokemon implements Serializable{
	
	private String nome;
	private int Hp;
	private int Atk;
	private int spAtk;
	private int Def;
	private int spDef;
	private int vel;
	public Tipo tipo1;
	public Tipo tipo2;
	public Movimento moves[];
        private int ID;

      
    public Pokemon(String dadosPoke[], int ID) {
        System.out.println(dadosPoke[0]);
        nome = dadosPoke[0];
        moves = new Movimento[4];
        
        Hp = ManipuladorDeArquivos.strToInt(dadosPoke[1],nome);
        Atk = ManipuladorDeArquivos.strToInt(dadosPoke[2],nome);
        Def = ManipuladorDeArquivos.strToInt(dadosPoke[3],nome);
        spAtk = ManipuladorDeArquivos.strToInt(dadosPoke[4],nome);
        spDef = ManipuladorDeArquivos.strToInt(dadosPoke[5],nome);
        vel = ManipuladorDeArquivos.strToInt(dadosPoke[6],nome);
        for(int i = 0; i<4;i++){
            moves[i] = new Movimento(0);
        }
        tipo1 = new Tipo(ManipuladorDeArquivos.strToInt(dadosPoke[11],nome));
        tipo2 = new Tipo(ManipuladorDeArquivos.strToInt(dadosPoke[12],nome));
        this.ID = ID;
    }



	public int getHp() {
		return Hp;
	}

	public void setHp(int hp) {
		Hp = hp;
	}

	public int getVel() {
		return vel;
	}


	public String getNome() {
		return nome;
	}

	public int getAtk() {
		return Atk;
	}

	public int getSpAtk() {
		return spAtk;
	}

	public int getDef() {
		return Def;
	}

	public int getSpDef() {
		return spDef;
	}

	public void setAtk(int atk) {
		Atk = atk;
	}

	public void setSpAtk(int spAtk) {
		this.spAtk = spAtk;
	}

	public void setDef(int def) {
		Def = def;
	}

	public void setSpDef(int spDef) {
		this.spDef = spDef;
	}

	public void setVel(int vel) {
		this.vel = vel;
	}




	
	
	
	

}
