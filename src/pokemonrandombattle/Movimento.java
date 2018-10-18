//classe caracterização movimentos


package pokemonrandombattle;

public class Movimento {
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
	
	



	public Movimento(int precisao, int danoBase, String nome, int tipo, boolean moveFisico) {
        this.precisao = precisao;
        this.danoBase = danoBase;
        this.nome = nome;
        this.tipo = tipo;
        this.moveFisico = moveFisico;
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
	
	
	
	
	
}
