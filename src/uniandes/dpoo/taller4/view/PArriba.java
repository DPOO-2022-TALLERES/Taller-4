package uniandes.dpoo.taller4.view;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PArriba extends JPanel implements ItemListener{
	
	private String[] listamatriculas = {"5 x 5", "6 x 6", "7 x 7", "8 x 8", "9 x 9", "10 x 10"};
	private ButtonGroup grupoBotones;
	private String selection;
	private JComboBox<String> tamaniocuadricula = new JComboBox<>(listamatriculas);
	Color lightblue = new Color(51,136,255);
	
	PArriba(){
		this.setLayout(new GridBagLayout());
		
		JLabel tamanio = new JLabel("Tamanio: ");
		tamanio.setForeground(Color.white);
		
		JLabel dificultad = new JLabel("Dificultad");
		dificultad.setForeground(Color.white);
		
		JRadioButton facil = new JRadioButton("Facil");
		facil.setForeground(Color.white);
		facil.setBackground(lightblue);
		
		JRadioButton medio = new JRadioButton("Medio");
		medio.setForeground(Color.white);
		medio.setBackground(lightblue);
		
		JRadioButton dificil = new JRadioButton("Dificil");
		dificil.setForeground(Color.white);
		dificil.setBackground(lightblue);
		
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
		tamaniocuadricula.addItemListener(this);
		
		setBackground(lightblue);
		
		
	}
	
	public int getTamanio(){
		int tamanio = Integer.parseInt(selection.substring(0, 2).strip());
		return tamanio;
	}

	public void getDificultad(){
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		if (e.getSource() == tamaniocuadricula) {
			selection = tamaniocuadricula.getSelectedItem().toString();

		}
	}
	
	
}
