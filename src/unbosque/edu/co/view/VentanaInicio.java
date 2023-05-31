package unbosque.edu.co.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaInicio extends JFrame {

	 private JButton botonJugar;
	 private JButton botonInstru;
	 private JLabel label1;

	public VentanaInicio() {
		
		
		setBounds(0, 0, 960, 640);
	    setTitle("CardJitsu");          
		setResizable(false);                    

		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
			ImageIcon imagenIcon1 = new ImageIcon("src/unbosque/edu/co/imagenes/cardjitsu.png");
			Image imagen1 = imagenIcon1.getImage();
	        Image imagenRedimensionada1 = imagen1.getScaledInstance(960, 640, Image.SCALE_SMOOTH);
	        ImageIcon imagenFondo1 = new ImageIcon(imagenRedimensionada1);
		
			ImageIcon imagenIcon = new ImageIcon("src/unbosque/edu/co/imagenes/fondo_para_menu.png");
	        Image imagen = imagenIcon.getImage();
	        Image imagenRedimensionada = imagen.getScaledInstance(960, 640, Image.SCALE_SMOOTH);
	        ImageIcon imagenFondo = new ImageIcon(imagenRedimensionada);
	        
	        JLabel background = new JLabel(imagenFondo);
	        add(background);
	        background.setLayout(null);
	        
	        label1 = new JLabel("logo");
	        label1.setName("logo");
	        label1.setBounds(0, 0, 960, 640);
	        label1.setIcon(imagenFondo1);
	        
	      
	        
	        botonJugar = new JButton("Jugar");
	        botonJugar.setName("botonJugar");
	        botonJugar.setBounds(380, 250, 250, 45);
	        botonJugar.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
	        botonJugar.setForeground(Color.BLACK);
	        botonJugar.setBackground(new Color(219, 151, 83));

	        botonInstru = new JButton("Instrucciones");
	        botonInstru.setName("botonInstru");
	        botonInstru.setBounds(357, 350, 300, 45);
	        botonInstru.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
	        botonInstru.setForeground(Color.BLACK);
	        botonInstru.setBackground(new Color(219, 151, 83));

	        

	        this.add(background);
	        background.add(botonJugar);
	        background.add(botonInstru);
	        background.add(label1);
	       

		
		
	}


	public JButton getBotonJugar() {
		return botonJugar;
	}

	public void setBotonJugar(JButton botonJugar) {
		this.botonJugar = botonJugar;
	}

	public JButton getBotonInstru() {
		return botonInstru;
	}

	public void setBotonInstru(JButton botonInstru) {
		this.botonInstru = botonInstru;
	}

	
	
	
	
	}
