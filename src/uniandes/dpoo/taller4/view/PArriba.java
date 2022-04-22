package uniandes.dpoo.taller4.view;

import java.awt.Color;
import java.awt.GridBagLayout;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PArriba extends JPanel{
	
	private String[] listamatriculas = {"5x5", "6x6", "7x7", "8x8", "9x9", "10x10"};
	private ButtonGroup grupoBotones;
	Color lightblue = new Color(51,136,255);
	
	
	PArriba(){
		this.setLayout(new GridBagLayout());
		
		JLabel tamanio = new JLabel("Tamanio: ");
		tamanio.setForeground(Color.white);
		
		JComboBox tamaniocuadricula = new JComboBox<>(listamatriculas);
		
		JLabel dificultad = new JLabel("Dificultad");
		dificultad.setForeground(Color.white);
		
		JRadioButton facil = new JRadioButton("Fácil");
		
		facil.setBackground(lightblue);
		facil.setForeground(Color.white);
		
		JRadioButton medio = new JRadioButton("Medio");
		medio.setBackground(lightblue);
		medio.setForeground(Color.white);
		
		JRadioButton dificil = new JRadioButton("Dificil");
		dificil.setBackground(lightblue);
		dificil.setForeground(Color.white);
		
		this.grupoBotones = new ButtonGroup();
		grupoBotones.add(facil);
		grupoBotones.add(medio);
		grupoBotones.add(dificil);
		
		this.add(tamanio);
		this.add(tamaniocuadricula);
		this.add(dificultad);
		this.add(facil);
		this.add(medio);
		this.add(dificil);
		
		
		setBackground(lightblue);
		
		
		
	}
	
	

}
