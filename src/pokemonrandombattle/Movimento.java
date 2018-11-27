//classe caracterização movimentos


package pokemonrandombattle;

import java.io.Serializable;

public class Movimento implements Serializable{
	private int precisao;
	private int danoBase;
	private String nome;
	private int tipo;
	private boolean moveFisico;
	
	
    public int getDanoBase() {
		return danoBase;
	}

	public int getTipo() {
		return tipo;
	}
	
	public Movimento(int x) {
        precisao = 100;
        nome = "Choque";
        danoBase = 100;
        tipo = 8;
        moveFisico = false;
    }

	public int getPrecisao() {
		return precisao;
	}

	public String getNome() {
		return nome;
	}

	public boolean isMoveFisico() {
		return moveFisico;
	}
	
	/**
         * Calcula o dano
         * @param move
         * @param atkr
         * @param defr
         * @return dano
         */
	public int executeMove(Movimento move, Pokemon atkr, Pokemon defr) {
		int dano = (int) Math.floor(((move.getDanoBase()*(atkr.getAtk()/defr.getDef())/50)+2)*(defr.tipo1.fraquezas[move.getTipo()]*defr.tipo2.fraquezas[move.getTipo()]));
		return dano;
	}
	
	
}
