package clupenguin;

public class inventario {
	String skin = new String();
	String cinturon = new String();
	String[] mazo = new String[30];
	String fondo = new String();
	
	public inventario() {
		this.skin = null;
		this.cinturon = "";
		this.fondo = null;
	}
	
	public void setcinturon(String conturon) {
		this.cinturon = conturon;
  }
	public String getcinturon() {
		return this.cinturon;
	}
	
	
	public void persomazo(String Carta,int posicion) {
		this.mazo[posicion] = Carta;
	}
	
	
	public String getmazo(int i) {
		return mazo[i];
	}
	
	public void cambiarfondo(String fondo) {
		this.fondo = fondo;
	}
	
}