package pokemonrandombattle;

public class Cura extends Movimento {

	public Cura(String[] dadosMovimento) {
		super(dadosMovimento);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int executeMove(Movimento move, Pokemon atkr, Pokemon defr) {
		atkr.setHp(atkr.getHp()+move.getDanoBase());
		return 0;
	}
}
