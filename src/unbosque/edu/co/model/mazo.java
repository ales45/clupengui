package unbosque.edu.co.model;


public class mazo {
	Carta[] mazo = new Carta[30];
	Carta[] mazoganador = new Carta[30];
	Carta[] mazoganadorsen = new Carta[30];

	Carta[] mazopinguino = new Carta[5];
	
	public mazo() {
		
	}
	
	public void setmazo(int i,Carta carta) {
		this.mazo[i] = carta; 
	}
	public Carta getmazo(int i) {
		return this.mazo[i];
	}
	
	public void setmazoganador(int i,Carta carta) {
		this.mazoganador[i] = carta; 
	}
	public Carta getmazoganador(int i) {
		return this.mazoganador[i];
	}
	
	public void setmazoganadorsen(int i,Carta carta) {
		this.mazoganador[i] = carta; 
	}
	public Carta getmazoganadorsen(int i) {
		return this.mazoganador[i];
	}
	
	
	
	public void setmazopingino(int i,Carta carta) {
		this.mazopinguino[i] = carta; 
	}
	public Carta getmazopingino(int i) {
		return this.mazopinguino[i];
	}
	/*public Carta[] getmazoganador() {
		return mazoganador;
	}*/

	
	
}
