package unbosque.edu.co.model;

public class Jugador {
	private int puntos;
	
	public Jugador(){
		puntos = 0;
	}
	
	public void sumpuntos(int pun) {
		this.puntos += pun;
	}
	
	public void respuntos(int pun) {
		this.puntos -= pun;
	}
	
}	
