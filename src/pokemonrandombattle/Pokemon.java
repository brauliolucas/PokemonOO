package pokemonrandombattle;

import java.io.Serializable;


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
        private int currentHp;
    public Pokemon(String dadosPoke[], int ID) {
        nome = dadosPoke[0];
        moves = new Movimento[4];
        this.ID = ID;
        Hp = ManipuladorDeArquivos.strToInt(dadosPoke[1],nome);
        Atk = ManipuladorDeArquivos.strToInt(dadosPoke[2],nome);
        Def = ManipuladorDeArquivos.strToInt(dadosPoke[3],nome);
        spAtk = ManipuladorDeArquivos.strToInt(dadosPoke[4],nome);
        spDef = ManipuladorDeArquivos.strToInt(dadosPoke[5],nome);
        vel = ManipuladorDeArquivos.strToInt(dadosPoke[6],nome);
        for(int i = 0; i<4;i++){
        	int idMove = ManipuladorDeArquivos.strToInt(dadosPoke[7 + i],nome);
        	System.out.println(nome + " " + idMove);
            moves[i] = Dados.movimentos.get(idMove-1);
        }
        tipo1 = new Tipo(ManipuladorDeArquivos.strToInt(dadosPoke[11],nome));
        tipo2 = new Tipo(ManipuladorDeArquivos.strToInt(dadosPoke[12],nome));
        this.ID = ID;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Pokemon(Pokemon poke) {
        nome = poke.getNome();
        moves = poke.moves;
        
        Hp = poke.getHp();
        Atk = poke.getAtk();
        Def = poke.getDef();
        spAtk = poke.getSpAtk();
        spDef = poke.getSpDef();
        vel = poke.getVel();

        tipo1 = poke.tipo1;
        tipo2 = poke.tipo2;
        ID = poke.ID;
    }


    
	public int getCurrentHp() {
		return currentHp;
	}



	public void setCurrentHp(int currentHp) {
		if(currentHp < 0) {
			this.currentHp = 0;
		}
		else {
			this.currentHp = currentHp;
		}
	}

	public int getHp() {
		return Hp;
	}

	public void setHp(int hp) {
		Hp = hp;
	}

        public int getID() {
            return ID;
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
		if(atk <= 1)
			this.Atk = 1;
		else
			this.Atk = atk;
	}
		

	public void setSpAtk(int spAtk) {
		if(spAtk <= 1)
			this.spAtk = 1;
		else
			this.spAtk = spAtk;
	}

	public void setDef(int def) {
		if(def <= 1)
			this.Def = 1;
		else
			this.Def = def;
		
	}

	public void setSpDef(int spDef) {
		if(spDef <=1)
			this.spDef = 1;
		else
			this.spDef = spDef;

	}

	public void setVel(int vel) {
		if(vel <=1)
			this.vel = 1;
		else
			this.vel = vel;
	}




	
	
	
	

}
