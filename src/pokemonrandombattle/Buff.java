package pokemonrandombattle;

public class Buff extends Movimento {

	public Buff(int precisao, int danoBase, String nome, int tipo, boolean moveFisico) {
		super(precisao, danoBase, nome, tipo, moveFisico);
		// TODO Auto-generated constructor stub
	}
	private int Escalar;
	
	public int executeMove(Movimento move, Pokemon atkr, Pokemon defr) {
		int dano = (int) Math.floor(((move.getDanoBase()*(atkr.getAtk()/defr.getDef())/50)+2)*(defr.tipo1.fraquezas[move.getTipo()]*defr.tipo2.fraquezas[move.getTipo()]));
		return dano;
	}
}
