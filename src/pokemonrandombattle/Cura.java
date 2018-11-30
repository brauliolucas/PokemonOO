package pokemonrandombattle;

public class Cura extends Movimento {


	public Cura(Movimento movimento) {
		super(movimento);
	}

	@Override
	public int executeMove(Movimento move, Pokemon atkr, Pokemon defr) {
		atkr.setHp(atkr.getHp()+move.getDanoBase());
		return 0;
	}
}
