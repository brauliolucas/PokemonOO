package pokemonrandombattle;

public class BuffVel extends Movimento {

	public BuffVel(String[] dadosMovimento) {
		super(dadosMovimento);
		// TODO Auto-generated constructor stub
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
