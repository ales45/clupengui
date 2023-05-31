package unbosque.edu.co.controller;
import unbosque.edu.co.model.mazo;

import java.util.ArrayList;

import unbosque.edu.co.model.Carta;

public class GanarPartida {
	
	public Boolean Ganar(Carta[] mazoganador) {
		int Colore = 0;
		ArrayList cartaF = new ArrayList<Carta>();
		ArrayList cartaA = new ArrayList<Carta>();
		ArrayList cartaH = new ArrayList<Carta>();
		
		
		for (int i = 0;i<mazoganador.length;i++) {
			if (mazoganador[i].getelemento() == "fuego") {
				cartaF.add(mazoganador[i]);
			}else {
				if (mazoganador[i].getelemento() == "agua") {
					cartaA.add(mazoganador[i]);
				}else {
					if (mazoganador[i].getelemento() == "hielo") {
						cartaH.add(mazoganador[i]);
				    }
		         }
		    }
	    }
		if(ganarxColor(cartaF) == true) {
			return true;
			}else {
				if(ganarxColor(cartaA) == true) {
					return true;
				}else {
					if(ganarxColor(cartaH) == true) {
						return true;
					}else {
						if (ganarXdiferente(cartaF, cartaA, cartaH)) {
							return true;
						}else {
							return false;
						}
					}
				}
			}
	
  }
	
	public Boolean ganarxColor(ArrayList<Carta> cartas) {
		int Diferente = 0;
		for (int i = 0; i<cartas.size();i++) {
			for(int t = 0; t<cartas.size();i++) {
				if (i==t) {
					continue;
				}
				if (cartas.get(i).getcolor() != cartas.get(t).getcolor()) {
					Diferente += 1;
				}
			}
			if (Diferente == 2) {
				break;
			}
			Diferente = 0;
		}
		
		
		if (Diferente == 2) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public Boolean ganarXdiferente(ArrayList<Carta> cartasf,ArrayList<Carta> cartasa,ArrayList<Carta> cartash) {
		for(int i = 0;i<cartasf.size();i++) {
			for(int t = 0;i<cartasa.size();i++) {
				if(cartasf.get(i).getcolor() != cartasa.get(t).getcolor()) {
					for (int p = 0;p<cartash.size();p++) {
						if(cartasa.get(t).getcolor() != cartash.get(p).getcolor()) {
							return true;
						}
						
					}
				}
			}
		}
		return false;
	}
}

