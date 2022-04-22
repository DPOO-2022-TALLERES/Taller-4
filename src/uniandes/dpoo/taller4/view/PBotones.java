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
		ButtonPosition(buttonNuevo);
		addButton(buttonNuevo, x = 1, y = 0);
		
		JButton buttonReiniciar = new JButton("Reiniciar");
		ButtonPosition(buttonReiniciar);
		addButton(buttonReiniciar , x = 1, y = 1);
		
		JButton buttonTop = new JButton("TOP - 10");
		ButtonPosition(buttonTop);
		addButton(buttonTop, x = 1, y = 2);
		
		JButton buttonCambiarJugador = new JButton("Cambiar Jugador");
		ButtonPosition(buttonCambiarJugador);
		addButton(buttonCambiarJugador, x = 1, y = 3);
		
	}
	
	void addButton(Component component, int x, int y) {
        constraints.gridx = x;
        constraints.gridy = y;
        constraints.insets = new Insets(5, 0, 5, 0);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        add(component, constraints);
      }
	
	void ButtonPosition(JButton button) {
		button.setAlignmentX(this.CENTER_ALIGNMENT);
	}
	
}
