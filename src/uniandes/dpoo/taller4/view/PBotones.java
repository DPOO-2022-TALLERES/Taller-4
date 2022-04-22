package uniandes.dpoo.taller4.view;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PBotones extends JPanel{
	GridBagConstraints constraints = new GridBagConstraints();

	PBotones(){
		this.setLayout(new GridBagLayout());
		
		int x,y;
		
		JButton buttonNuevo = new JButton("Nuevo");
		addButton(buttonNuevo, x = 1, y = 0, buttonNuevo);
		
		JButton buttonReiniciar = new JButton("Reiniciar");
		addButton(buttonReiniciar , x = 1, y = 1, buttonReiniciar);
		
		JButton buttonTop = new JButton("TOP - 10");
		addButton(buttonTop, x = 1, y = 2,buttonTop);
		
		JButton buttonCambiarJugador = new JButton("Cambiar Jugador");
		addButton(buttonCambiarJugador, x = 1, y = 3, buttonCambiarJugador);
		
	}
	
	void addButton(Component component, int x, int y,JButton button) {
        constraints.gridx = x;
        constraints.gridy = y;
        constraints.insets = new Insets(5, 0, 5, 0);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        button.setAlignmentX(this.CENTER_ALIGNMENT);
        add(component, constraints);
      }
	

	
}
