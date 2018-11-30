package pokemonrandombattle;

public class BuffDef extends Movimento {

	private static final long serialVersionUID = 1L;
	
	public BuffDef(Movimento movimento) {
		super(movimento);
	}
	/*
	 * execute um Buff no Def do pokemon atacante
	 * @param1 movimento
	 * @param2 pokemon atacante
	 * @param3 pokemon defendendo
	 * @return 0
	 */
	@Override
	public int executeMove(Movimento move, Pokemon atkr, Pokemon defr) {
		atkr.setDef(atkr.getDef()*move.getDanoBase());
		return 0;
	}

}
