package pokemonrandombattle;


public abstract class Pokemon {
	
	private String nome;
	private int Hp;
	private int Atk;
	private int spAtk;
	private int Def;
	private int spDef;
	private int vel;
	private int precisao;
	public int tipo1;
	public int tipo2;
	public Movimento moves[];




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

	public int getPrecisao() {
		return precisao;
	}



	
	
	
	

}
