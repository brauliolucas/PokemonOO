package pokemonrandombattle;

public class DebuffVel extends Movimento {

	private static final long serialVersionUID = 1L;
	public DebuffVel(Movimento movimento) {
		super(movimento);
	}
	/*
	 * execute um DeBuff no Vel do pokemon defendendo
	 * @param1 movimento
	 * @param2 pokemon atacante
	 * @param3 pokemon defendendo
	 * @return 0
	 */
	@Override
	public int executeMove(Movimento move, Pokemon atkr, Pokemon defr) {
		defr.setAtk(defr.getAtk()/move.getDanoBase());
		return 0;
	}

}
