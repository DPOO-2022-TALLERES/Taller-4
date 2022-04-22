package uniandes.dpoo.taller4.view;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PArriba extends JPanel implements ItemListener, ActionListener{
	
	private String[] listamatriculas = {"5 x 5", "6 x 6", "7 x 7", "8 x 8", "9 x 9", "10 x 10"};
	private ButtonGroup grupoBotones;
	private JRadioButton facil, medio, dificil ;
	private int difSelection;
	private String selection;
	private JComboBox<String> tamaniocuadricula = new JComboBox<>(listamatriculas);
	private JButton changeDif;
	Color lightblue = new Color(51,136,255);
	
	
	PArriba(){
		this.setLayout(new GridBagLayout());
		
		JLabel tamanio = new JLabel("Tamanio: ");
		tamanio.setForeground(Color.white);
		
		JLabel dificultad = new JLabel("Dificultad");
		dificultad.setForeground(Color.white);
		
		facil = new JRadioButton("Facil");
		facil.setForeground(Color.white);
		facil.setBackground(lightblue);
		
		medio = new JRadioButton("Medio");
		medio.setForeground(Color.white);
		medio.setBackground(lightblue);
		
		dificil = new JRadioButton("Dificil");
		dificil.setForeground(Color.white);
		dificil.setBackground(lightblue);
		
		changeDif = new JButton();
		changeDif.setText("Cambiar");
		
		
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
		this.add(changeDif);
		grupoBotones.getSelection();
		setBackground(lightblue);
		
		tamaniocuadricula.addItemListener(this);
		changeDif.addActionListener(this);
		
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		if (e.getSource() == tamaniocuadricula) {
			selection = tamaniocuadricula.getSelectedItem().toString();

		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == changeDif ) {
			changeDificulty();
		}
		
	
	}
	protected void changeDificulty() {
		if (facil.isSelected()) {
			difSelection = 5;
		}
		else if (medio.isSelected()) {
			difSelection = 10;
		}
		else if (dificil.isSelected()) {
			difSelection = 20;
		}
	}
	
	public int getTamanio(){
		int tamanio = Integer.parseInt(selection.substring(0, 2).strip());
		return tamanio;
	}

	public int getDificultad(){
		String d = Integer.toString(difSelection);
		JOptionPane.showMessageDialog(null, d);
		return difSelection;
	}
	
}
