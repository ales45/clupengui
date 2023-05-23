package unbosque.edu.co.controller;
import unbosque.edu.co.model.mazo;
import unbosque.edu.co.model.Carta;
public class controlador {
	public void ejecutar() {
		int ronda = 0;
		mazo mazos = new mazo();
		logicaPartida lg = new logicaPartida();
		
		
		while (true) { //while lo uso para poder gestionar la partida, se van a ejecutar n rondas hasta que uno gane
			
			mazos.setmazoganador(ronda, lg.cartas()); //aqui llamo a un metodo de otro archivo donde se esta gestionando que carta gana en cada ronda
			ronda+=1;
			
			for (int i = 0;i<ronda;i++) {
				System.out.println("--------------------"); //for para comprobar que si se este llenando mazoganador
				System.out.println(mazos.getmazoganador(i).getcolor());
			}
			
			
			if (ronda == 3) { //condicional para decidir cuando se acaba la partida, se va a ejecutar despues cuado un metodo devuelva true
				break;
			}
			
		}
	}
}
