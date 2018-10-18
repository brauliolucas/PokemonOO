package pokemonrandombattle;

public class PokeDex {
	
	
	
	
	public void showPoke(Pokemon poke) {
		System.out.println("Nome : " + poke.getNome());
		System.out.println("HP : " + poke.getHp());
		System.out.println("Atk : " + poke.getAtk());
		System.out.println("spAtk : " + poke.getSpAtk());
		System.out.println("Def : " + poke.getDef());
		System.out.println("spDef : " + poke.getSpDef());
		System.out.println("Vel : " + poke.getVel());
		System.out.println("Precisao : " + poke.getPrecisao());
		System.out.println("Tipo 1 : " + nomeTipo(poke.tipo1));
		System.out.println("Tipo 2 : " + nomeTipo(poke.tipo2));
		System.out.println("Movimentos ");
		for(int i=0;i<4;i++) {
			if(poke.moves[i]!= null) {
				System.out.println("	Nome : " + poke.moves[i].getNome());
				System.out.println("	Dano Base : " + poke.moves[i].getDanoBase());
				System.out.println("	Tipo : " + nomeTipo(poke.moves[i].getTipo()));
				System.out.println("	Precisão : " + poke.moves[i].getPrecisao());
			}
		}
		
	}
	
	
	
	
	
	
	public String nomeTipo(int x) {
		String Nome;
		switch (x) {
		case 1 :
			Nome = "Normal";
			return Nome;
			
		case 2 :
			Nome = "Fight";
			return Nome;
		
		case 3 : 
			Nome = "Voador";
			return Nome;
		
		case 4 : 
			Nome = "Veneno";
			return Nome;
		
		case 5 : 
			Nome  = "Terrestre";
			return Nome;
		
		case 6 : 
			Nome = "Rocha";
			return Nome;
			
		case 7 :
			Nome = "Inseto";
			return Nome;
			
		case 8 : 
			Nome = "Fantasma";
			return Nome;
		
		case 9 :
			Nome = "Aço";
			return Nome;
		
		case 10 :
			Nome = "Fogo";
			return Nome;
			
		case 11 :
			Nome = "Água";
			return Nome;
		
		case 12 : 
			Nome = "Grama";
			return Nome;
			
		case 13 : 
			Nome = "Eletrico";
			return Nome;
			
		case 14 : 
			Nome = "Psiquico";
			return Nome;
			
		case 15 : 
			Nome = "Gelo";
			return Nome;
			
		case 16 : 
			Nome = "Dragão";
			return Nome;
		
		case 17 : 
			Nome = "Noturno";
			return Nome;
			
		case 18 : 
			Nome = "Fada";
			return Nome;
			
		default :
			return "Normal";
			
		}
			
	}

}
