package pokemonrandombattle;

public class DebuffAtk extends Movimento {

	private static final long serialVersionUID = 1L;
	public DebuffAtk(Movimento movimento) {
		super(movimento);
	}
	/*
	 * execute um DeBuff no Atk do pokemon defendendo
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
