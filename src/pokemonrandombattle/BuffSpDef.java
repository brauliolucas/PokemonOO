package pokemonrandombattle;

public class BuffSpDef extends Movimento {

	private static final long serialVersionUID = 1L;
	public BuffSpDef(Movimento movimento) {
		super(movimento);
	}
	
	/*
	 * execute um Buff no SpDef do pokemon atacante
	 * @param1 movimento
	 * @param2 pokemon atacante
	 * @param3 pokemon defendendo
	 * @return 0
	 */
	@Override
	public int executeMove(Movimento move, Pokemon atkr, Pokemon defr) {
		atkr.setSpDef(atkr.getSpDef()*move.getDanoBase());
		return 0;
	}

}
