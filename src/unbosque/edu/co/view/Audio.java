package unbosque.edu.co.view;


import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Audio {

	
	    private Clip clip;
	    public Audio() {
			// TODO Auto-generated constructor stub
		}
	    
	    public void reproducir(String rutaArchivo) {
	        try {
	            File file = new File(rutaArchivo);
	            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
	            clip = AudioSystem.getClip();
	            
	            clip.open(audioStream);
	            clip.loop(Clip.LOOP_CONTINUOUSLY);
	            //clip.start();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    
	    public void detener() {
	        if (clip != null && clip.isRunning()) {
	            clip.stop();
	        }
	    }
	}
