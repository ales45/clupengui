package unbosque.edu.co.view;

import java.awt.BorderLayout;
import java.awt.Image;


import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class VentanaJuego extends JFrame {


	private JButton carta1;
	private JButton carta2;
	private JButton carta3;
	private JButton carta4;
	private JButton carta5;
	public JLabel gifLabel1;
    public JLabel gifLabel2;
	
	public VentanaJuego() {
		setBounds(0, 0, 960, 640);
		setResizable(false);
		setTitle("CardJistsu");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		

		ImageIcon imagenIcon = new ImageIcon("src/unbosque/edu/co/imagenes/fondo_para_menu_-_copia.png");
        Image imagen = imagenIcon.getImage();
        Image imagenRedimensionada = imagen.getScaledInstance(960, 640, Image.SCALE_SMOOTH);
        ImageIcon imagenFondo = new ImageIcon(imagenRedimensionada);
        
        JLabel background = new JLabel(imagenFondo);
        add(background);
        background.setLayout(null);
		
		carta1 = new JButton("carta1");
		carta1.setBounds(20, 430, 100, 150);
		carta1.setBackground(Color.BLACK);
		carta1.setForeground(Color.WHITE);
		
		carta2 = new JButton("carta2");
		carta2.setBounds(120, 430, 100, 150);
		carta2.setBackground(Color.BLACK);
		carta2.setForeground(Color.WHITE);
		
		carta3 = new JButton("carta3");
		carta3.setBounds(220, 430, 100, 150);
		carta3.setBackground(Color.BLACK);
		carta3.setForeground(Color.WHITE);
		
		carta4 = new JButton("carta4");
		carta4.setBounds(320, 430, 100, 150);
		carta4.setBackground(Color.BLACK);
		carta4.setForeground(Color.WHITE);
		
		carta5 = new JButton("carta5");
		carta5.setBounds(420, 430, 100, 150);
		carta5.setBackground(Color.BLACK);
		carta5.setForeground(Color.WHITE);
		
		ImageIcon gif1 = new ImageIcon("src/unbosque/edu/co/imagenes/Saludo(rojo).gif");
        ImageIcon gif2 = new ImageIcon("src/unbosque/edu/co/imagenes/Saludo(cafe).gif");

        
        Image resizedGif1 = gif1.getImage().getScaledInstance(280, 270, Image.SCALE_DEFAULT);
        Image resizedGif2 = gif2.getImage().getScaledInstance(280, 270, Image.SCALE_DEFAULT);
        
       
        gifLabel1 = new JLabel(new ImageIcon(resizedGif1));
        gifLabel2 = new JLabel(new ImageIcon(resizedGif2));
        
       
        gifLabel1.setBounds(0, 0, 480, 640); // GIF izquierdo
        gifLabel2.setBounds(480, 0, 480, 640); // GIF derecho



        
        
          
	
        this.add(background);
        background.add(carta1);
        background.add(carta2);
        background.add(carta3);
        background.add(carta4);
        background.add(carta5);
        background.add(gifLabel1);
        background.add(gifLabel2);
		
		

	}
	
	


	public JButton getCarta1() {
		return carta1;
	}


	public void setCarta1(JButton carta1) {
		this.carta1 = carta1;
	}


	public JButton getCarta2() {
		return carta2;
	}


	public void setCarta2(JButton carta2) {
		this.carta2 = carta2;
	}


	public JButton getCarta3() {
		return carta3;
	}


	public void setCarta3(JButton carta3) {
		this.carta3 = carta3;
	}


	public JButton getCarta4() {
		return carta4;
	}


	public void setCarta4(JButton carta4) {
		this.carta4 = carta4;
	}


	public JButton getCarta5() {
		return carta5;
	}


	public void setCarta5(JButton carta5) {
		this.carta5 = carta5;
	}
}