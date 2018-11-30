package pokemonrandombattle;

public class BuffSpAtk extends Movimento {

	private static final long serialVersionUID = 1L;
	public BuffSpAtk(Movimento movimento) {
		super(movimento);
	}
	/*
	 * execute um Buff no SpAtk do pokemon atacante
	 * @param1 movimento
	 * @param2 pokemon atacante
	 * @param3 pokemon defendendo
	 * @return 0
	 */
	@Override
	public int executeMove(Movimento move, Pokemon atkr, Pokemon defr) {
		atkr.setSpAtk(atkr.getSpAtk()*move.getDanoBase());
		return 0;
	}

}
