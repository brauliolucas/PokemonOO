package pokemonrandombattle;

public abstract class Debuff extends Movimento {
	private int Escalar;
	public int getEscalar() {
		return Escalar;
	}


	public void setEscalar(int escalar) {
		Escalar = escalar;
	}


	public Debuff(int precisao, int danoBase, String nome, int tipo, boolean moveFisico, int Escalar) {
		super(precisao, danoBase, nome, tipo, moveFisico);
		// TODO Auto-generated constructor stub
	}
	
	
	public abstract int executeMove(Movimento move, Pokemon atkr, Pokemon defr);
}