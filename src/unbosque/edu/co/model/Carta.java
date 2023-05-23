package unbosque.edu.co.model;

public class Carta {
	private String nombre;
	private int id;
	private String color;
	private String elemento;
	private int numero;
	
	
	public Carta(int numero,String color,String elemento,String nombre) {
		this.nombre = nombre;
		this.color = color;
		this.elemento = elemento;
		this.numero = numero;
	}
	
	public void CrearCarta() {
		
	}
	
	public String getnombre() {
		return this.nombre;
	}
	
	public int getid() {
		return this.id;
	}
	
	public String getcolor() {
		return this.color;
	}
	
	public String getelemento() {
		return this.elemento;
	}
	
	public int getnumero() {
		return this.numero;
	}
	
	
}
