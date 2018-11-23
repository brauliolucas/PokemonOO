package pokemonrandombattle;


public class Pokemon {
	
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

      
    public Pokemon(String nome, int Hp, int Atk, int spAtk, int Def, int spDef, int vel,Tipo tipo1, Tipo tipo2, Movimento[] moves, int ID) {
        this.nome = nome;
        this.Hp = Hp;
        this.Atk = Atk;
        this.spAtk = spAtk;
        this.Def = Def;
        this.spDef = spDef;
        this.vel = vel;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        this.moves = moves;
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




	
	
	
	

}
