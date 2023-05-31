package unbosque.edu.co.model;
import unbosque.edu.co.model.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class mazo {
	//Carta[] mazo = new Carta[30];
	Carta[] mazoganador = new Carta[30];
	Carta[] mazoganadorsen = new Carta[30];
	private List<Carta> cartas;
	//Carta[] mazopinguino = new Carta[5];
	


	
	
	public void setmazoganador(int i,Carta carta) {
		this.mazoganador[i] = carta; 
	}
	public Carta getmazoganador(int i) {
		return this.mazoganador[i];
	}
	public Carta[] getmazoganador() {
		return this.mazoganador;
	}
	
	
	public void setmazoganadorsen(int i,Carta carta) {
		this.mazoganador[i] = carta; 
	}
	public Carta getmazoganadorsen(int i) {
		return this.mazoganador[i];
	}
	public Carta[] getmazosense() {
		return this.mazoganadorsen;
	}
	
	
	/*public Carta[] getmazoganador() {
		return mazoganador;
	}*/
	
	public void Inicializar() {
        cartas.clear();
      
        cartas.add(new Carta(2, "amarillo","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaAmarillos/agua2ama.png"));
        cartas.add(new Carta(3, "amarillo","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaAmarillos/agua3ama.png"));
        cartas.add(new Carta(4, "amarillo","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaAmarillos/agua4ama.png"));
        cartas.add(new Carta(5, "amarillo","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaAmarillos/agua5ama.png"));
        cartas.add(new Carta(6, "amarillo","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaAmarillos/agua6ama.png"));
        cartas.add(new Carta(7, "amarillo","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaAmarillos/agua7ama.png"));
        cartas.add(new Carta(8, "amarillo","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaAmarillos/agua8ama.png"));
        cartas.add(new Carta(9, "amarillo","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaAmarillos/agua9ama.png"));
        cartas.add(new Carta(10, "amarillo","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaAmarillos/agua10ama.png"));
        cartas.add(new Carta(11, "amarillo","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaAmarillos/agua11ama.png"));
        cartas.add(new Carta(12, "amarillo","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaAmarillos/agua12ama.png"));
        cartas.add(new Carta(13, "amarillo","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaAmarillos/agua13ama.png"));
        cartas.add(new Carta(14, "amarillo","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaAmarillos/agua14ama.png"));
        cartas.add(new Carta(15, "amarillo","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaAmarillos/agua15ama.png"));
        
        cartas.add(new Carta(2, "rojo","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaRojo/agua2roj.png"));
        cartas.add(new Carta(3, "rojo","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaRojo/agua3roj.png"));
        cartas.add(new Carta(4, "rojo","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaRojo/agua4roj.png"));
        cartas.add(new Carta(5, "rojo","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaRojo/agua5roj.png"));
        cartas.add(new Carta(6, "rojo","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaRojo/agua6roj.png"));
        cartas.add(new Carta(7, "rojo","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaRojo/agua7roj.png"));
        cartas.add(new Carta(8, "rojo","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaRojo/agua8roj.png"));
        cartas.add(new Carta(9, "rojo","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaRojo/agua9roj.png"));
        cartas.add(new Carta(10, "rojo","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaRojo/agua10roj.png"));
        cartas.add(new Carta(11, "rojo","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaRojo/agua11roj.png"));
        cartas.add(new Carta(12, "rojo","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaRojo/agua12roj.png"));
        cartas.add(new Carta(13, "rojo","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaRojo/agua13roj.png"));
        cartas.add(new Carta(14, "rojo","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaRojo/agua14roj.png"));
        cartas.add(new Carta(15, "rojo","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaRojo/agua15roj.png"));
        
        cartas.add(new Carta(2, "morado","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaMorados/agua2mor.png"));
        cartas.add(new Carta(3, "morado","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaMorados/agua3mor.png"));
        cartas.add(new Carta(4, "morado","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaMorados/agua4mor.png"));
        cartas.add(new Carta(5, "morado","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaMorados/agua5mor.png"));
        cartas.add(new Carta(6, "morado","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaMorados/agua6mor.png"));
        cartas.add(new Carta(7, "morado","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaMorados/agua7mor.png"));
        cartas.add(new Carta(8, "morado","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaMorados/agua8mor.png"));
        cartas.add(new Carta(9, "morado","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaMorados/agua9mor.png"));
        cartas.add(new Carta(10, "morado","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaMorados/agua10mor.png"));
        cartas.add(new Carta(11, "morado","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaMorados/agua11mor.png"));
        cartas.add(new Carta(12, "morado","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaMorados/agua12mor.png"));
        cartas.add(new Carta(13, "morado","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaMorados/agua13mor.png"));
        cartas.add(new Carta(14, "morado","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaMorados/agua14mor.png"));
        cartas.add(new Carta(15, "morado","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaMorados/agua15mor.png"));
        
        cartas.add(new Carta(2, "azul","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaAzul/agua2.png"));
        cartas.add(new Carta(3, "azul","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaAzul/agua3.png"));
        cartas.add(new Carta(4, "azul","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaAzul/agua4.png"));
        cartas.add(new Carta(5, "azul","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaAzul/agua5.png"));
        cartas.add(new Carta(6, "azul","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaAzul/agua6.png"));
        cartas.add(new Carta(7, "azul","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaAzul/agua7.png"));
        cartas.add(new Carta(8, "azul","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaAzul/agua8.png"));
        cartas.add(new Carta(9, "azul","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaAzul/agua9.png"));
        cartas.add(new Carta(10, "azul","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaAzul/agua10.png"));
        cartas.add(new Carta(11, "azul","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaAzul/agua11.png"));
        cartas.add(new Carta(12, "azul","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaAzul/agua12.png"));
        cartas.add(new Carta(13, "azul","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaAzul/agua13.png"));
        cartas.add(new Carta(14, "azul","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaAzul/agua14.png"));
        cartas.add(new Carta(15, "azul","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaAzul/agua15.png"));
        
        cartas.add(new Carta(2, "verde","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaVerde/agua2ver.png"));
        cartas.add(new Carta(3, "verde","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaVerde/agua3ver.png"));
        cartas.add(new Carta(4, "verde","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaVerde/agua4ver.png"));
        cartas.add(new Carta(5, "verde","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaVerde/agua5ver.png"));
        cartas.add(new Carta(6, "verde","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaVerde/agua6ver.png"));
        cartas.add(new Carta(7, "verde","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaVerde/agua7ver.png"));
        cartas.add(new Carta(8, "verde","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaVerde/agua8ver.png"));
        cartas.add(new Carta(9, "verde","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaVerde/agua9ver.png"));
        cartas.add(new Carta(10, "verde","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaVerde/agua10ver.png"));
        cartas.add(new Carta(11, "verde","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaVerde/agua11ver.png"));
        cartas.add(new Carta(12, "verde","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaVerde/agua12ver.png"));
        cartas.add(new Carta(13, "verde","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaVerde/agua13ver.png"));
        cartas.add(new Carta(14, "verde","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaVerde/agua14ver.png"));
        cartas.add(new Carta(15, "verde","agua","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaVerde/agua15ver.png"));
        
        cartas.add(new Carta(2, "amarillo","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoAmarillo/fuego2ama.png"));
        cartas.add(new Carta(3, "amarillo","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoAmarillo/fuego3ama.png"));;
        cartas.add(new Carta(4, "amarillo","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoAmarillo/fuego4ama.png"));;
        cartas.add(new Carta(5, "amarillo","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoAmarillo/fuego5ama.png"));;
        cartas.add(new Carta(6, "amarillo","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoAmarillo/fuego6ama.png"));
        cartas.add(new Carta(7, "amarillo","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoAmarillo/fuego7ama.png"));
        cartas.add(new Carta(8, "amarillo","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoAmarillo/fuego8ama.png"));
        cartas.add(new Carta(9, "amarillo","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoAmarillo/fuego9ama.png"));
        cartas.add(new Carta(10, "amarillo","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoAmarillo/fuego10ama.png"));
        cartas.add(new Carta(11, "amarillo","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoAmarillo/fuego11ama.png"));
        cartas.add(new Carta(12, "amarillo","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoAmarillo/fuego12ama.png"));
        cartas.add(new Carta(13, "amarillo","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoAmarillo/fuego13ama.png"));
        cartas.add(new Carta(14, "amarillo","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoAmarillo/fuego14ama.png"));
        cartas.add(new Carta(15, "amarillo","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoAmarillo/fuego15ama.png"));
        
        cartas.add(new Carta(2, "rojo","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoRojo/fuego2roj.png"));
        cartas.add(new Carta(3, "rojo","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoRojo/fuego3roj.png"));
        cartas.add(new Carta(4, "rojo","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoRojo/fuego4roj.png"));
        cartas.add(new Carta(5, "rojo","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoRojo/fuego5roj.png"));
        cartas.add(new Carta(6, "rojo","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoRojo/fuego6roj.png"));
        cartas.add(new Carta(7, "rojo","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoRojo/fuego7roj.png"));
        cartas.add(new Carta(8, "rojo","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoRojo/fuego8roj.png"));
        cartas.add(new Carta(9, "rojo","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoRojo/fuego9roj.png"));
        cartas.add(new Carta(10, "rojo","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoRojo/fuego10roj.png"));
        cartas.add(new Carta(11, "rojo","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoRojo/fuego11roj.png"));
        cartas.add(new Carta(12, "rojo","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoRojo/fuego12roj.png"));
        cartas.add(new Carta(13, "rojo","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoRojo/fuego13roj.png"));
        cartas.add(new Carta(14, "rojo","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoRojo/fuego14roj.png"));
        cartas.add(new Carta(15, "rojo","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoRojo/fuego15roj.png"));
        
        cartas.add(new Carta(2, "morado","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoMorado/fuego2mor.png"));
        cartas.add(new Carta(3, "morado","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoMorado/fuego3mor.png"));
        cartas.add(new Carta(4, "morado","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoMorado/fuego4mor.png"));
        cartas.add(new Carta(5, "morado","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoMorado/fuego5mor.png"));
        cartas.add(new Carta(6, "morado","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoMorado/fuego6mor.png"));
        cartas.add(new Carta(7, "morado","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoMorado/fuego7mor.png"));
        cartas.add(new Carta(8, "morado","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoMorado/fuego8mor.png"));
        cartas.add(new Carta(9, "morado","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoMorado/fuego9mor.png"));
        cartas.add(new Carta(10, "morado","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoMorado/fuego10mor.png"));
        cartas.add(new Carta(11, "morado","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoMorado/fuego11mor.png"));
        cartas.add(new Carta(12, "morado","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoMorado/fuego12mor.png"));
        cartas.add(new Carta(13, "morado","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoMorado/fuego13mor.png"));
        cartas.add(new Carta(14, "morado","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoMorado/fuego14mor.png"));
        cartas.add(new Carta(15, "morado","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoMorado/fuego15mor.png"));
        
        cartas.add(new Carta(2, "azul","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoAzul/fuego2.png"));
        cartas.add(new Carta(3, "azul","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoAzul/fuego3.png"));
        cartas.add(new Carta(4, "azul","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoAzul/fuego4.png"));
        cartas.add(new Carta(5, "azul","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoAzul/fuego5.png"));
        cartas.add(new Carta(6, "azul","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoAzul/fuego6.png"));
        cartas.add(new Carta(7, "azul","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoAzul/fuego7.png"));
        cartas.add(new Carta(8, "azul","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoAzul/fuego8.png"));
        cartas.add(new Carta(9, "azul","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoAzul/fuego9.png"));
        cartas.add(new Carta(10, "azul","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoAzul/fuego10.png"));
        cartas.add(new Carta(11, "azul","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoAzul/fuego11.png"));
        cartas.add(new Carta(12, "azul","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoAzul/fuego12.png"));
        cartas.add(new Carta(13, "azul","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoAzul/fuego13.png"));
        cartas.add(new Carta(14, "azul","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoAzul/fuego14.png"));
        cartas.add(new Carta(15, "azul","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeFuegoAzul/fuego15.png"));
        
        cartas.add(new Carta(2, "verde","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaVerde/agua2ver.png"));
        cartas.add(new Carta(3, "verde","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaVerde/agua3ver.png"));
        cartas.add(new Carta(4, "verde","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaVerde/agua4ver.png"));
        cartas.add(new Carta(5, "verde","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaVerde/agua5ver.png"));
        cartas.add(new Carta(6, "verde","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaVerde/agua6ver.png"));
        cartas.add(new Carta(7, "verde","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaVerde/agua7ver.png"));
        cartas.add(new Carta(8, "verde","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaVerde/agua8ver.png"));
        cartas.add(new Carta(9, "verde","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaVerde/agua9ver.png"));
        cartas.add(new Carta(10, "verde","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaVerde/agua10ver.png"));
        cartas.add(new Carta(11, "verde","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaVerde/agua11ver.png"));
        cartas.add(new Carta(12, "verde","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaVerde/agua12ver.png"));
        cartas.add(new Carta(13, "verde","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaVerde/agua13ver.png"));
        cartas.add(new Carta(14, "verde","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaVerde/agua14ver.png"));
        cartas.add(new Carta(15, "verde","fuego","src/unbosque/edu/co/imagenes/Cartas/CartasDeAguaVerde/agua15ver.png"));
        
        cartas.add(new Carta(2, "amarillo","hielo","src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloAmarillo/hielo3ama.png"));
        cartas.add(new Carta(3, "amarillo","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloAmarillo/hielo3ama.png"));
        cartas.add(new Carta(4, "amarillo","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloAmarillo/hielo4ama.png"));
        cartas.add(new Carta(5, "amarillo","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloAmarillo/hielo5ama.png"));
        cartas.add(new Carta(6, "amarillo","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloAmarillo/hielo6ama.png"));
        cartas.add(new Carta(7, "amarillo","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloAmarillo/hielo7ama.png"));
        cartas.add(new Carta(8, "amarillo","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloAmarillo/hielo8ama.png"));
        cartas.add(new Carta(9, "amarillo","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloAmarillo/hielo9ama.png"));
        cartas.add(new Carta(10, "amarillo","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloAmarillo/hielo10ama.png"));
        cartas.add(new Carta(11, "amarillo","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloAmarillo/hielo11ama.png"));
        cartas.add(new Carta(12, "amarillo","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloAmarillo/hielo12ama.png"));
        cartas.add(new Carta(13, "amarillo","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloAmarillo/hielo13ama.png"));
        cartas.add(new Carta(14, "amarillo","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloAmarillo/hielo14ama.png"));
        cartas.add(new Carta(15, "amarillo","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloAmarillo/hielo15ama.png"));
        
        cartas.add(new Carta(2, "rojo","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloRojo/hielo2roj.png"));
        cartas.add(new Carta(3, "rojo","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloRojo/hielo3roj.png"));
        cartas.add(new Carta(4, "rojo","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloRojo/hielo4roj.png"));
        cartas.add(new Carta(5, "rojo","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloRojo/hielo5roj.png"));
        cartas.add(new Carta(6, "rojo","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloRojo/hielo6roj.png"));
        cartas.add(new Carta(7, "rojo","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloRojo/hielo7roj.png"));
        cartas.add(new Carta(8, "rojo","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloRojo/hielo8roj.png"));
        cartas.add(new Carta(9, "rojo","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloRojo/hielo9roj.png"));
        cartas.add(new Carta(10, "rojo","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloRojo/hielo10roj.png"));
        cartas.add(new Carta(11, "rojo","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloRojo/hielo11roj.png"));
        cartas.add(new Carta(12, "rojo","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloRojo/hielo12roj.png"));
        cartas.add(new Carta(13, "rojo","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloRojo/hielo13roj.png"));
        cartas.add(new Carta(14, "rojo","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloRojo/hielo14roj.png"));
        cartas.add(new Carta(15, "rojo","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloRojo/hielo15roj.png"));
        
        cartas.add(new Carta(2, "morado","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloMorado/hielo2mor.png"));
        cartas.add(new Carta(3, "morado","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloMorado/hielo3mor.png"));
        cartas.add(new Carta(4, "morado","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloMorado/hielo4mor.png"));
        cartas.add(new Carta(5, "morado","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloMorado/hielo5mor.png"));
        cartas.add(new Carta(6, "morado","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloMorado/hielo6mor.png"));
        cartas.add(new Carta(7, "morado","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloMorado/hielo7mor.png"));
        cartas.add(new Carta(8, "morado","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloMorado/hielo8mor.png"));
        cartas.add(new Carta(9, "morado","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloMorado/hielo9mor.png"));
        cartas.add(new Carta(10, "morado","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloMorado/hielo10mor.png"));
        cartas.add(new Carta(11, "morado","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloMorado/hielo11mor.png"));
        cartas.add(new Carta(12, "morado","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloMorado/hielo12mor.png"));
        cartas.add(new Carta(13, "morado","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloMorado/hielo13mor.png"));
        cartas.add(new Carta(14, "morado","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloMorado/hielo14mor.png"));
        cartas.add(new Carta(15, "morado","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloMorado/hielo15mor.png"));
        
        cartas.add(new Carta(2, "azul","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloAzul/hielo2.png"));
        cartas.add(new Carta(3, "azul","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloAzul/hielo3.png"));
        cartas.add(new Carta(4, "azul","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloAzul/hielo4.png"));
        cartas.add(new Carta(5, "azul","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloAzul/hielo5.png"));
        cartas.add(new Carta(6, "azul","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloAzul/hielo6.png"));
        cartas.add(new Carta(7, "azul","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloAzul/hielo7.png"));
        cartas.add(new Carta(8, "azul","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloAzul/hielo8.png"));
        cartas.add(new Carta(9, "azul","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloAzul/hielo9.png"));
        cartas.add(new Carta(10, "azul","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloAzul/hielo10.png"));
        cartas.add(new Carta(11, "azul","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloAzul/hielo11.png"));
        cartas.add(new Carta(12, "azul","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloAzul/hielo12.png"));
        cartas.add(new Carta(13, "azul","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloAzul/hielo13.png"));
        cartas.add(new Carta(14, "azul","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloAzul/hielo14.png"));
        cartas.add(new Carta(15, "azul","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloAzul/hielo15.png"));
        
        cartas.add(new Carta(2, "verde","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloVerde/hielo2ver.png"));
        cartas.add(new Carta(3, "verde","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloVerde/hielo3ver.png"));
        cartas.add(new Carta(4, "verde","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloVerde/hielo4ver.png"));
        cartas.add(new Carta(5, "verde","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloVerde/hielo5ver.png"));
        cartas.add(new Carta(6, "verde","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloVerde/hielo6ver.png"));
        cartas.add(new Carta(7, "verde","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloVerde/hielo7ver.png"));
        cartas.add(new Carta(8, "verde","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloVerde/hielo8ver.png"));
        cartas.add(new Carta(9, "verde","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloVerde/hielo9ver.png"));
        cartas.add(new Carta(10, "verde","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloVerde/hielo10ver.png"));
        cartas.add(new Carta(11, "verde","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloVerde/hielo11ver.png"));
        cartas.add(new Carta(12, "verde","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloVerde/hielo12ver.png"));
        cartas.add(new Carta(13, "verde","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloVerde/hielo13ver.png"));
        cartas.add(new Carta(14, "verde","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloVerde/hielo14ver.png"));
        cartas.add(new Carta(15, "verde","hielo", "src/unbosque/edu/co/imagenes/Cartas/CartasDeHieloVerde/hielo15ver.png"));
        
        
        
        shuffle();
    }
    
	public void shuffle() {
        Collections.shuffle(cartas);
    }

    public Carta extraerCarta(int i) {
        if (cartas.isEmpty()) {
            throw new IllegalStateException("El mazo está vacío");
        }
        
        return cartas.remove(i);
    }
    
    public void agregarCarta(Carta card) {
        cartas.add(card);
    }

    public int getSize() {
        return cartas.size();
    }
	public List<Carta> getCartas() {
		return cartas;
	}
	public void setCartas(List<Carta> cartas) {
		this.cartas = cartas;
	}
	

	
	
}
