package unbosque.edu.co.controller;
import unbosque.edu.co.model.mazo;
import unbosque.edu.co.view.VentanaInicio;
import unbosque.edu.co.view.VentanaInstrucciones;
import unbosque.edu.co.view.VentanaJuego;
import unbosque.edu.co.model.Jugador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.Timer;

import unbosque.edu.co.model.Carta;
public class controlador implements ActionListener{
	private VentanaInicio vi; 
	private VentanaJuego vj;
	private VentanaInstrucciones vis;

	Jugador pengi = new Jugador();//el parametro cambia segun lo que me den en la vista
	GanarPartida gn = new GanarPartida();  //metodos para gestionar cuando se gana la partida
	int ronda = 0; //me dice en que ronda estoy
	mazo mazos = new mazo(); //crea el mazo con el que se va a jugar
	logicaPartida lg = new logicaPartida();
	ArrayList cartas = new ArrayList();
	private List<JButton> cardButtons;
	private Random random;
	
	
	
	public controlador() {
		mazos.Inicializar();
	    mazos.shuffle();
	    pengi.inicializar(mazos);
	    pengi.llenarmano();
		vi = new VentanaInicio();
		vj = new VentanaJuego(pengi.getMano());
		vis = new VentanaInstrucciones();
		agregarLectores();
		cardButtons = new ArrayList<>();
	}
	
	public void ejecutar2() {

		vi.setVisible(true);
		
		
		
		
		
	}
	
	public void empezar(Carta carta,Carta sense) {
		
			cartas = lg.cartas(carta,sense);
			
			//error se soluciona al pasara cartas	
			if (cartas.get(1) == "jugador") {
				System.out.println("jugado");
				mazos.setmazoganador(ronda, (Carta) (cartas.get(0))); //aqui llamo a un metodo de otro archivo donde se esta gestionando que carta gana en cada ronda
			}else {
				if (cartas.get(1) == "sense") {
					System.out.println("sense");
					mazos.setmazoganadorsen(ronda,(Carta) (cartas.get(0))); //aqui llamo a un metodo de otro archivo donde se esta gestionando que carta gana en cada ronda
				}else {
					
				}
			}		
			
			
		
			
			
			if (gn.Ganar(mazos.getmazoganador())) {
				System.out.println("gana jugador");
				pengi.aumentarScore(5);
				
			}else {
				if(gn.Ganar(mazos.getmazosense())) {
					System.out.println("gana sense");
					pengi.quitarScore(2);
				
				}else {
				
				}
			}
			
			
			
		}
	
	private void agregarLectores() {
		
		vi.getBotonJugar().addActionListener(this);
		vi.getBotonJugar().setActionCommand("btnJugarClick");	
		
		vi.getBotonInstru().addActionListener(this);
		vi.getBotonInstru().setActionCommand("btnInstrucClick");
		
		vis.getVolver1().addActionListener(this);
		vis.getVolver1().setActionCommand("btnVolverClick");
		
		vj.getCarta1().addActionListener(this);
		vj.getCarta1().setActionCommand("btncarta1clik");
		
		vj.getCarta2().addActionListener(this);
		vj.getCarta2().setActionCommand("btncarta2clik");
		
		vj.getCarta3().addActionListener(this);
		vj.getCarta3().setActionCommand("btncarta3clik");
		
		vj.getCarta4().addActionListener(this);
		vj.getCarta4().setActionCommand("btncarta4clik");
		
		vj.getCarta5().addActionListener(this);
		vj.getCarta5().setActionCommand("btncarta5clik");
		
		}
	
	
	
	
			
		

			
		
		
		 public void actionPerformed(ActionEvent e) {
			    
			 switch (e.getActionCommand()) {
			 
			 case "btnJugarClick": {
	             abrirVentanaJugar();
	             break;
			 }
			 case "btnInstrucClick": {

				 abrirVentanaInstrucciones();
				 
				 break;
			 }
			 case "btnVolverClick": {
				 volverVentanaInstrucciones();
				 break;
			 }
			 case "btncarta1clik": {
				 empezar(pengi.getMano().get(0), null);
				 break;
			 }
			 case "btncarta2clik": {
				 break;
			 }
			 case "btncarta3clik": {
				 break;
			 }
			 case "btncarta4clik": {
				 break;
			 }
			 case "btncarta5clik": {
				 break;
			 }
			 default:
			 }
		 }

		private void abrirVentanaJugar() {
			
			vj.setVisible(true);
			vi.setVisible(false);
			
        	Timer timer = new Timer(1500, e -> {
        		vj.gifLabel1.setVisible(false);
        		vj.gifLabel2.setVisible(false);
        	});
        
        
        	
        
        timer.setRepeats(false);
			
		}
	private void abrirVentanaInstrucciones() {
			
			vis.setVisible(true);
			vi.setVisible(false);
			
			
			
			
		}

	private void volverVentanaInstrucciones() {
		
		vis.setVisible(false);
		vi.setVisible(true);
	}
		
	


	
}
