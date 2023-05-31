package unbosque.edu.co.controller;
import unbosque.edu.co.model.Carta;
import unbosque.edu.co.model.Jugador;
import java.util.*;

public class logicaPartida {
	public ArrayList cartas(Carta cartaJ,Carta cartaS){
		
		ArrayList a = new ArrayList();   

		
		Scanner sc = new Scanner(System.in);
		Carta[] cartas = new Carta[2]; //lista para poder guardar las dos cartas que estan en juego
				
		cartas[0] = cartaJ;
		cartas[1] = cartaS;
		
		
		a.add(condivito(cartas));
		//las posiciones se gestionan segun la carta que se retorne, si esta en x posicion esta varia
		if(condivito(cartas).getelemento() == cartas[0].getelemento()) {
			a.add("jugador"); //aqui lo que hago es retornar una list cpn un string y un objeto
		}else {
			if (condivito(cartas).getelemento() == cartas[1].getelemento()) {
				a.add("sense");
			}else {
				return null;
			}
		}
		//si gana el sense se retorna sense y la carta que se va a guardar en la lista del sensei y viseversa si gana el jugador
		cartas[0] = condivito(cartas);
		return a;
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

