package uniandes.dpoo.taller4.view;

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
	
	PArriba(){
		this.setLayout(new GridBagLayout());
		
		JLabel tamanio = new JLabel("Tamanio: ");
		
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
		tamaniocuadricula.addItemListener(this);
		
		
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
