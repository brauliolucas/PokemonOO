package pokemonrandombattle;

public class Cura extends Movimento {

	private static final long serialVersionUID = 1L;
	public Cura(Movimento movimento) {
		super(movimento);
	}

	@Override
	public int executeMove(Movimento move, Pokemon atkr, Pokemon defr) {
		if(atkr.getCurrentHp()+move.getDanoBase()>atkr.getHp())
			atkr.setCurrentHp(atkr.getHp()); //seta pro hp maximo
		else
			atkr.setCurrentHp(atkr.getCurrentHp()+move.getDanoBase());
		return 0;
	}
}
