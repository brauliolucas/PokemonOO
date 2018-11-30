//classe caracterização movimentos


package pokemonrandombattle;

import java.io.Serializable;

public class Movimento implements Serializable{
	private String nome;
	private int ID;
	private int danoBase;
	private int tipo;
	private int classe;
	private static final long serialVersionUID = 1L;
	
    public int getDanoBase() {
		return danoBase;
	}

	public int getTipo() {
		return tipo;
	}
	
	public int getId() {
		return ID;
	}
	
	public Movimento(String[] dadosMovimento) {
        nome = dadosMovimento[0];
        ID = ManipuladorDeArquivos.strToInt(dadosMovimento[1], nome);
        danoBase = ManipuladorDeArquivos.strToInt(dadosMovimento[2], nome);
        tipo = ManipuladorDeArquivos.strToInt(dadosMovimento[3], nome);
        classe = ManipuladorDeArquivos.strToInt(dadosMovimento[4], nome);
        
    }
	public Movimento(Movimento movimento) {
		nome = movimento.getNome();
        ID = movimento.getId();
        danoBase = movimento.getDanoBase();
        tipo = movimento.getTipo();
        classe = movimento.getClasse();
	}

	public String getNome() {
		return nome;
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

	public int getClasse() {
		return classe;
	}
	
	
	
}
