package pokemonrandombattle;

public class BuffVel extends Movimento {

	private static final long serialVersionUID = 1L;
	public BuffVel(Movimento movimento) {
		super(movimento);
	}
	/*
	 * execute um Buff no Vel do pokemon atacante
	 * @param1 movimento
	 * @param2 pokemon atacante
	 * @param3 pokemon defendendo
	 * @return 0
	 */
	@Override
	public int executeMove(Movimento move, Pokemon atkr, Pokemon defr) {
		atkr.setVel(atkr.getVel()*move.getDanoBase());
		return 0;
	}
	
}
