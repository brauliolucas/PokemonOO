package pokemonrandombattle;

import java.io.Serializable;


//1-Normal; 2-Fight; 3-Voador; 4-Veneno; 5-Terrestre; 6-Rocha; 7-Inseto; 8-Fantasma;
//9-AÃ§o; 10-Fogo; 11-Ã�gua; 12-Grama; 13-Eletrico; 14-Psiquico; 15-Gelo; 16-Dragao; 
//17-Noturno; 18-Fada

public class Tipo implements Serializable{
	
	
            protected double fraquezas[];
	    String nome;
	    private int id;

	    public Tipo(int id) {
	        
	        this.id = id;
	        switch(id){
	            case 0:
	                nome = "-----";
	                fraquezas = new double[] {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
	                break;
	            case 1:
	                nome = "Normal";
	                fraquezas = new double[] {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1};
	                break;
	            case 2:
	                nome = "Fogo";
	                fraquezas = new double[] {1,1,0.5,1,2,1,0.5,1,1,2,1,2,0.5,0.5,1,1,1,0.5,0.5};
	                break;
	            case 3:
	                nome = "Lutador";
	                fraquezas = new double[] {1,1,1,1,1,2,1,1,1,1,2,0.5,1,0.5,1,1,0.5,1,2};
	                break;
	            case 4:
	                nome = "Agua";
	                fraquezas = new double[] {1,1,0.5,1,0.5,1,2,1,2,1,1,1,0.5,1,1,1,1,2,1};
	                break;
	            case 5:
	                nome = "Voador";
	                fraquezas = new double[] {1,1,1,0.5,1,1,0.5,1,2,0,1,2,2,0.5,1,1,1,1,1};
	                break;
	            case 6:
	                nome = "Grama";
	                fraquezas = new double[] {1,1,2,1,0.5,2,0.5,2,0.5,0.5,1,1,2,2,1,1,1,1,1};
	                break;
	            case 7:
	                nome = "Veneno";
	                fraquezas = new double[] {1,1,1,0.5,1,1,0.5,0.5,1,2,2,1,1,0.5,1,1,1,1,0.5};
	                break;
	            case 8:
	                nome = "Eletrico";
	                fraquezas = new double[] {1,1,1,1,1,0.5,1,1,0.5,2,1,1,1,1,1,1,1,0.5,1};
	                break;
	            case 9:
	                nome = "Terrestre";
	                fraquezas = new double[] {1,1,1,3,2,1,2,0.5,0,1,1,0.5,2,1,1,1,1,1,1};
	                break;
	            case 10:
	                nome = "Psiquico";
	                fraquezas = new double[] {1,1,1,0.5,1,1,1,1,1,1,0.5,1,1,2,1,2,2,1,1};
	                break;
	            case 11:
	                nome = "Rocha";
	                fraquezas = new double[] {1,0,5,0,5,2,2,0,5,2,0,5,1,2,1,1,1,1,1,1,1,2,1};
	                break;
	            case 12:
	                nome = "Gelo";
	                fraquezas = new double[] {1,1,2,2,1,1,1,1,1,1,1,2,0.5,1,1,1,1,2,1};
	                break;
	            case 13:
	                nome = "Inseto";
	                fraquezas = new double[] {1,1,2,0.5,1,2,0.5,1,1,0.5,1,2,1,1,1,1,1,1,1};
	                break;
	            case 14:
	                nome = "Dragao";
	                fraquezas = new double[] {1,1,0.5,1,0.5,1,0.5,1,0.5,1,1,1,2,1,2,1,1,1,2};
	                break;
	            case 15:
	                nome = "Fantasma";
	                fraquezas = new double[] {1,0,1,0,1,1,1,0.5,1,1,1,1,11,0.5,1,2,2,1,1};
	                break;
	            case 16:
	                nome = "Noturno";
	                fraquezas = new double[] {1,1,1,2,1,1,1,1,1,1,0,1,1,2,1,0.5,0.5,1,1};
	                break;
	            case 17:
	                nome = "Aco";
	                fraquezas = new double[] {1,0.5,2,2,1,0.5,0.5,0,1,2,0.5,0.5,0.5,0.5,0.5,1,1,0.5,0.5};
	                break;
	            case 18:
	                nome = "Fada";
	                fraquezas = new double[] {1,1,1,0.5,1,1,1,2,1,1,1,1,1,0.5,0,1,0.5,2,1};
	                break;            
	        }
	    }	

    public int getId() {
        return id;
    }
            
}
