package uniandes.dpoo.taller4.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PBotones extends JPanel {
	GridBagConstraints constraints = new GridBagConstraints();
	Color lightblue = new Color(51,136,255);

	PBotones(){
		this.setLayout(new GridBagLayout());
		
		JButton buttonNuevo = new JButton("Nuevo");
		addButton(buttonNuevo, 1, 0, buttonNuevo);
		
		JButton buttonReiniciar = new JButton("Reiniciar");
		addButton(buttonReiniciar , 1,  1, buttonReiniciar);
		
		JButton buttonTop = new JButton("TOP - 10");
		addButton(buttonTop, 1, 2,buttonTop);
		
		JButton buttonCambiarJugador = new JButton("Cambiar Jugador");
		addButton(buttonCambiarJugador, 1, 3, buttonCambiarJugador);
		
		buttonTop.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				puntuacion j = new puntuacion();
				j.setVisible(true);
			}
		});
	}
	
	void addButton(Component component, int x, int y,JButton button) {
        constraints.gridx = x;
        constraints.gridy = y;
        constraints.insets = new Insets(5, 0, 5, 0);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        button.setAlignmentX(this.CENTER_ALIGNMENT);
        button.setBackground(lightblue);
        button.setForeground(Color.white);
        
        add(component, constraints);
      }

	

	
}
