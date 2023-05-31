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

public class VentanaInstrucciones extends JFrame {

	public JLabel jlabel1;
	public JButton volver1;
	
	
	public VentanaInstrucciones() {
		setBounds(0, 0, 960, 680);
		setResizable(false);
		setTitle("CardJistsu");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		

		ImageIcon imagenIcon = new ImageIcon("src/unbosque/edu/co/imagenes/fondoInstrucciones.png");
        Image imagen = imagenIcon.getImage();
        Image imagenRedimensionada = imagen.getScaledInstance(960, 640, Image.SCALE_SMOOTH);
        ImageIcon imagenFondo = new ImageIcon(imagenRedimensionada);
        
        JLabel background = new JLabel(imagenFondo);
        add(background);
        background.setLayout(null);
		
        

		jlabel1 = new JLabel();
		
		jlabel1.setBounds(300,10,100,150);
        getContentPane().add(jlabel1, BorderLayout.CENTER);
		
        
        volver1 = new JButton("volver");
		volver1.setBounds(20,100, 100, 150);
		volver1.setBackground(Color.BLACK);
		volver1.setForeground(Color.WHITE);

        this.add(background);
        background.add(volver1);
        background.add(jlabel1);
		

	}
	
	public JLabel getJlabel1() {
		return jlabel1;
	}


	public void setJlabel1(JLabel jlabel1) {
		this.jlabel1 = jlabel1;
	}


	public JButton getVolver1() {
		return volver1;
	}


	public void setVolver1(JButton volver1) {
		this.volver1 = volver1;
	}

}