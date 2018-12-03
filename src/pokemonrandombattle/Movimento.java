//classe caracterização movimentos


package pokemonrandombattle;

import java.io.Serializable;

public class Movimento implements Serializable{
	private String nome;
	private int ID;
	private int danoBase;
	private int tipo;
	private int classe;
	
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
                if(dano==0){
                dano=1;
                }
                if(move.classe==1){
                    if(defr.tipo1.fraquezas[move.getTipo()]==0 || defr.tipo2.fraquezas[move.getTipo()]==0){
                        dano=0;
                        Game.logDeBatalha = Game.logDeBatalha + defr.getNome()+" é imune ao golpe "+move.getNome()+"!\n";
                    }
                    if(defr.tipo1.fraquezas[move.getTipo()] * defr.tipo2.fraquezas[move.getTipo()]==2) 
                       {
                        Game.logDeBatalha = Game.logDeBatalha + "Golpe super efetivo!\n";
                    }
                    if(defr.tipo1.fraquezas[move.getTipo()] * defr.tipo2.fraquezas[move.getTipo()]==0.5) {
                        Game.logDeBatalha = Game.logDeBatalha + "O ataque não foi muito efetivo...\n";
                    }
                }
                
		return dano;
	}

	public int getClasse() {
		return classe;
	}
	
	
	
}
