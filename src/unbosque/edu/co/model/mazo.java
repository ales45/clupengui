package unbosque.edu.co.model;

public class mazo {
	String[] mazo = new String[30];
	String[] mazoganador = new String[30];
	String[] mazopinguino = new String[5];
	
	public mazo() {
		
	}
	
	public void setmazo(int i,String carta) {
		this.mazo[i] = carta; 
	}
	public String getmazo(int i) {
		return this.mazo[i];
	}
	
	public void setmazoganador(int i,String carta) {
		this.mazo[i] = carta; 
	}
	public String getmazoganador(int i) {
		return this.mazoganador[i];
	}
	
	public void setmazopingino(int i,String carta) {
		this.mazoganador[i] = carta; 
	}
	public String getmazopingino(int i) {
		return this.mazopinguino[i];
	}
	
	
}
