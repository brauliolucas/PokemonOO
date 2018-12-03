package pokemonrandombattle;

import InterfacesGraficas.TelaTitulo;
import javax.swing.JOptionPane;

public class PokeDex {
	
	
	
	/**
	 * imprime as informações do pokemon e movimentos
	 * @param1 pokemon
	 * 
	 *
	 */
	public static void showPoke(Pokemon poke) {
		
		if(poke.getID()!=132){
		JOptionPane.showMessageDialog(null, "Nome :" + poke.getNome() + "\n" + "HP : " + poke.getHp() + "\n " + "Atk : " + poke.getAtk()+ "\n " +"spAtk : " + poke.getSpAtk()+ "\n " +"Def : " + poke.getDef()
		+"\n " +"spDef : " + poke.getSpDef()+"\n " +"Vel : " + poke.getVel()	+"\n " +"Tipo 1 : " + poke.tipo1.nome+"\n " +"Tipo 2 : " + poke.tipo2.nome + 
		"\n " +"Movimentos :" + "\n" + '\n'+  "	Nome : " + poke.moves[0].getNome() + '\n'+"	Dano Base : " + poke.moves[0].getDanoBase() + '\n'+"	Tipo : " + poke.moves[0].getTipo() +
		'\n'+  "	Nome : " + poke.moves[1].getNome() + '\n'+"	Dano Base : " + poke.moves[1].getDanoBase() + '\n'+"	Tipo : " + poke.moves[1].getTipo() +
		'\n'+  "	Nome : " + poke.moves[2].getNome() + '\n'+"	Dano Base : " + poke.moves[2].getDanoBase() + '\n'+"	Tipo : " + poke.moves[2].getTipo() +
		'\n'+  "	Nome : " + poke.moves[3].getNome() + '\n'+"	Dano Base : " + poke.moves[3].getDanoBase() + '\n'+"	Tipo : " + poke.moves[3].getTipo() );
		/*System.out.println("Nome : " + poke.getNome());
		System.out.println("HP : " + poke.getHp());
		System.out.println(+ "\n " + "Atk : " + poke.getAtk());
		System.out.println(+ "\n " +"spAtk : " + poke.getSpAtk());
		System.out.println(+ "\n " +"Def : " + poke.getDef());
		System.out.println(+"\n " +"spDef : " + poke.getSpDef());
		System.out.println(+"\n " +"Vel : " + poke.getVel());
		System.out.println(+"\n " +"Tipo 1 : " + poke.tipo1.nome);
		System.out.println(+"\n " +"Tipo 2 : " + poke.tipo2.nome);
		System.out.println("\n " +"Movimentos ");
		for(int i=0;i<4;i++) {
			if(poke.moves[i]!= null) {
				System.out.println(+ '\n'+  "	Nome : " + poke.moves[i].getNome());
				System.out.println(+ '\n'+"	Dano Base : " + poke.moves[i].getDanoBase());
				System.out.println(+ '\n'+"	Tipo : " + poke.moves[i].getTipo());
				System.out.println("");
			}
		}
                */
                }else{
                    JOptionPane.showMessageDialog(null, "Ditto nao disponivel nessa versao. Desculpe!","Erro!",JOptionPane.INFORMATION_MESSAGE);

                }			
		
	}
	
	
	


}

