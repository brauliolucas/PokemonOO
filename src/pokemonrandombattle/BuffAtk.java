package pokemonrandombattle;

public class BuffAtk extends Movimento {

	public BuffAtk(String[] dadosMovimento) {
		super(dadosMovimento);
		// TODO Auto-generated constructor stub
	}
	/*
	 * execute um Buff no Atk do pokemon atacante
	 * @param1 movimento
	 * @param2 pokemon atacante
	 * @param3 pokemon defendendo
	 * @return 0
	 */
	@Override
	public int executeMove(Movimento move, Pokemon atkr, Pokemon defr) {
		atkr.setAtk(atkr.getAtk()*move.getDanoBase());
		return 0;
	}

}
