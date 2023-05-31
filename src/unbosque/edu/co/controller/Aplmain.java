package unbosque.edu.co.controller;

import unbosque.edu.co.view.Audio;

public class Aplmain {

	public static void main(String[] args) {
	
		controlador con = new controlador();
		con.ejecutar2();
		
		Audio au = new Audio();
		au.reproducir("src/unbosque/edu/co/view/musicaGamer.wav");
		
		
	}

}
