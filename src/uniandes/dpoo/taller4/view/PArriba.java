package uniandes.dpoo.taller4.view;

import java.awt.GridBagLayout;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PArriba extends JPanel{
	
	private String[] listamatriculas = {"5x5", "6x6", "7x7", "8x8", "9x9", "10x10"};
	private ButtonGroup grupoBotones;
	
	PArriba(){
		this.setLayout(new GridBagLayout());
		
		JLabel tamanio = new JLabel("Tamanio: ");
		
		JComboBox tamaniocuadricula = new JComboBox<>(listamatriculas);
		
		JLabel dificultad = new JLabel("Dificultad");
		
		JRadioButton facil = new JRadioButton("Fácil");
		
		JRadioButton medio = new JRadioButton("Medio");
		
		JRadioButton dificil = new JRadioButton("Dificil");
		
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
		

		
		
		
		
		
		
	}

}
