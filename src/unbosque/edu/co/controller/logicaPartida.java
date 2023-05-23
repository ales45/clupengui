package unbosque.edu.co.controller;
import unbosque.edu.co.model.Carta;
import unbosque.edu.co.model.Jugador;
import java.util.*;

public class logicaPartida {
	public Carta cartas(){
		Jugador ales = new Jugador();
		ArrayList a = new ArrayList();   

		
		Scanner sc = new Scanner(System.in);
		Carta[] cartas = new Carta[2]; //lista para poder guardar las dos cartas que estan en juego
		
		Carta fuego = new Carta(10,"rojo","fuego","sexo");
		Carta agua = new Carta(10, "azul", "agua","sexo2");
		Carta hielo = new Carta(10, "blanco", "hielo","sexo3");
		
		
		System.out.println("dame la carta #1");
		char c1 = sc.next().charAt(0); 
		
		System.out.println("dame la carta #2");
		char c2 = sc.next().charAt(0);
		// variables para seleccionar cartas
		if(c1 == 'f') { //
			cartas[0] = fuego;
		}else {
			if(c1 == 'a') {
				cartas[0] = agua;
			}else {
				if(c1=='h') {
					cartas[0] = hielo;
				}
			}
		}
		
		if(c2 == 'f') {
			cartas[1] = fuego;
		}else {
			if(c2 == 'a') {
				cartas[1] = agua;
			}else {
				if(c2=='h') {
					cartas[1] = hielo;
				}
			}
		}
		a.add(condivito(cartas));
		if(condivito(cartas).getelemento() == cartas[0].getelemento()) {
			a.add("jugador");
		}else {
			if (condivito(cartas).getelemento() == cartas[1].getelemento());

		}
		
		cartas[0] = condivito(cartas);
		System.out.println(cartas[0].getelemento());
		return cartas[0];
	}
	
	

	
	
	
		//metodo donde voy a destionar cada partida para ver que carta va a ganar
	
		public Carta condivito(Carta[] cartas) {
			int inde = 0;
			String retu = "nada"; //variable donde voy a guardar lo que voy a retornar
			//cuando un jugador gana esta carta se va a guardar en la lista mazo ganador(de la clase mazo)
			
			
			//logica de quien gana o empata o pierde 
			//la estructurura va a variar segun el tipo de la carta
			
			
			//condicional para fuego
			if (cartas[0].getelemento() == "fuego" && cartas[1].getelemento() == "fuego") {//primer if para gestionar de que tipo son las cartas
				if (cartas[0].getnumero() == cartas[1].getnumero()) {	//condicional para el caso de que se eligan cartas iguales				 
					retu = "es un empate";
					inde += 2;
				}else {
					if (cartas[0].getnumero() > cartas[1].getnumero()) {
						retu =  "ganas";
					}else {
						if (cartas[0].getnumero() < cartas[1].getnumero()) {
							retu = "pierdes";
							inde += 1;
						}
					}
				}
				
			}
			else {
				//condicional para cuando sea fuego y agua -pierdes
				if (cartas[0].getelemento() == "fuego" && cartas[1].getelemento() == "agua") {
					retu = "pierdes";
					inde += 1;
				}
				else {
					//condicional para cuando sea fuego y hielo -ganas
					if (cartas[0].getelemento() == "fuego" && cartas[1].getelemento() == "hielo") {
						retu = "ganas";
					}
				}
			}
			
			
			//condicional para el caso de que sea agua
			if (cartas[0].getelemento() == "agua" && cartas[1].getelemento() == "agua") {//primer if para gestionar de que tipo son las cartas
				if (cartas[0].getnumero() == cartas[1].getnumero()) {	//condicional para el caso de que se eligan cartas iguales				 
					retu = "es un empate";
					inde += 2;
				}else {
					if (cartas[0].getnumero() > cartas[1].getnumero()) {
						retu = "ganas";
					}else {
						if (cartas[0].getnumero() < cartas[1].getnumero()) {
							retu = "pierdes";
							inde += 1;
						}
					}
				}
				
			}
			else {
				//condicional para cuando sea agua y fuego -ganas
				if (cartas[0].getelemento() == "agua" && cartas[1].getelemento() == "fuego") {
					retu = "ganas";
				}
				else {
					//condicional para cuando sea agua y hielo -pierdes
					if (cartas[0].getelemento() == "agua" && cartas[1].getelemento() == "hielo") {
						retu = "pierdes";
						inde += 1;
					}
				}
			}
			
			
		
			//condicional para el hielo
			if (cartas[0].getelemento() == "hielo" && cartas[1].getelemento() == "hielo") {//primer if para gestionar de que tipo son las cartas
				if (cartas[0].getnumero() == cartas[1].getnumero()) {	//condicional para el caso de que se eligan cartas iguales				 
					retu = "es un empate";
					inde += 2;
				}else {
					if (cartas[0].getnumero() > cartas[1].getnumero()) {
						retu = "ganas";
					}else {
						if (cartas[0].getnumero() < cartas[1].getnumero()) {
							retu = "pierdes";
							inde += 1;
						}
					}
				}
				
			}
			else {
				//condicional para cuando sea hielo y fuego -pierdes
				if (cartas[0].getelemento() == "hielo" && cartas[1].getelemento() == "fuego") {
					retu = "pierdes";
					inde += 1;
				}
				else {
					//condicional para cuando sea hielo y agua  -ganas
					if (cartas[0].getelemento() == "hielo" && cartas[1].getelemento() == "agua") {
						retu = "ganas";
					}
				}
			}
			if (inde==2) {
				return null;
			}else {
			return cartas[inde];
			}
		  
	}
	
}

