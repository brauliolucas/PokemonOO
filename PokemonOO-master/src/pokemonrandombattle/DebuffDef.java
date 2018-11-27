package pokemonrandombattle;

public class DebuffDef extends Debuff {

	public DebuffDef(int precisao, int danoBase, String nome, int tipo, boolean moveFisico, int Escalar) {
		super(precisao, danoBase, nome, tipo, moveFisico, Escalar);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int executeMove(Movimento move, Pokemon atkr, Pokemon defr) {
		// TODO Auto-generated method stub
		return 0;
	}

}
