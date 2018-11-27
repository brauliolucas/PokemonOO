package pokemonrandombattle;

public class BuffAtk extends Buff {

	public BuffAtk(int precisao, int danoBase, String nome, int tipo, boolean moveFisico, int Escalar) {
		super(precisao, danoBase, nome, tipo, moveFisico, Escalar);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int executeMove(Movimento move, Pokemon atkr, Pokemon defr) {
		int dano = (int) Math.floor(((move.getDanoBase()*(atkr.getAtk()/defr.getDef())/50)+2)*(defr.tipo1.fraquezas[move.getTipo()]*defr.tipo2.fraquezas[move.getTipo()]));
		atkr.setAtk(atkr.getAtk()*getEscalar());
		return dano;
	}



}
