package unbosque.edu.co.model;

public class Carta {
	
	private String color;
	private String elemento;
	private int numero;
	public String rutaCarta;
	
	
	public Carta(int numero,String color,String elemento,String rutaCarta) {
		this.color = color;
		this.elemento = elemento;
		this.numero = numero;
		this.rutaCarta=rutaCarta;
	}
	public String getcolor() {
        return color;
    }

    public String getelemento() {
        return elemento;

    }
    public int getnumero() {
        return numero;
    }
	public String getRutaCarta() {
		return rutaCarta;
	}
	public String getRutaCarta(String rutaCarta) {
		return this.rutaCarta;
	}

    
}
