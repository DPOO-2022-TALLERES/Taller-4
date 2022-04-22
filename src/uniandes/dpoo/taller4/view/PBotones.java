package uniandes.dpoo.taller4.view;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PBotones extends JPanel{

	PBotones(){
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS ));
		
		JButton buttonNuevo = new JButton("Nuevo");
		buttonNuevo.setAlignmentX(this.CENTER_ALIGNMENT);
		add(buttonNuevo);
		
		JButton buttonReiniciar = new JButton("Reiniciar");
		buttonReiniciar.setAlignmentX(this.CENTER_ALIGNMENT);
		add(buttonReiniciar);
		
		JButton buttonTop = new JButton("TOP - 10");
		buttonTop.setAlignmentX(this.CENTER_ALIGNMENT);
		add(buttonTop);
		
		JButton buttonCambiarJugador = new JButton("Cambiar Jugador");
		buttonCambiarJugador.setAlignmentX(this.CENTER_ALIGNMENT);
		add(buttonCambiarJugador);
		
		
		
		
		
		
	}
}
