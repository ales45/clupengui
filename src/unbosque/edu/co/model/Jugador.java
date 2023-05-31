package unbosque.edu.co.model;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private String nombre;
    private List<Carta> mazo;
    private List<Carta> mano;
    private int score;

    public Jugador() {
        this.nombre = nombre;
        mazo = new ArrayList<>();
        mano = new ArrayList<>();
        score = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void inicializar(mazo mazodejuego) {
        // Obtener 30 cartas del mazo y agregarlas al mazo del jugador
        for (int i = 0; i < 30; i++) {
            Carta carta = mazodejuego.extraerCarta(i);
            mazo.add(carta);
        }
    }

    public void extraerCartaDelMazo() {
        if (mazo.isEmpty()) {
            throw new IllegalStateException("El mazo del jugador está vacío");
        }

        if (mano.size() >= 5) {
            throw new IllegalStateException("La mano del jugador está llena");
        }

        Carta carta = mazo.remove(0);
        mano.add(carta);
    }
    
    public void llenarmano() {
    	for(int i = 0;i<5;i++) {
    		Carta carta = this.mazo.get(i);
    		mano.add(carta);
    	}
    	
    }
    
    public List<Carta> getMano() {
        return mano;
    }

    public Carta JugarCarta(int i) {
        if (i < 0 || i >= mano.size()) {
            throw new IllegalArgumentException("Índice de carta inválido");
        }
        
        return mano.remove(i);
    }

    public int getScore() {
        return score;
    }

    public void aumentarScore(int points) {
        score += points;
    }
    
    public void quitarScore(int point) {
    	score -= point;
    }
}

