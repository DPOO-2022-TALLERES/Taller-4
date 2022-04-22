package uniandes.dpoo.taller4.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PEstado extends JPanel{
	private JLabel lblJugadas;
	private JLabel lblJugador;
	private JLabel lblJugadasD;
	private JLabel lblJugadorD;
	public PEstado() {
		
		this.setLayout(new GridLayout(1,4));
		
		this.lblJugadas = new JLabel("Jugadas: ");
		this.lblJugador = new JLabel ("Jugador: ");
		this.lblJugadasD = new JLabel ("");
		this.lblJugadorD = new JLabel ("");

		this.add(lblJugadas);
		this.add(lblJugadasD);
		this.add(lblJugador);
		this.add(lblJugadorD);
		
	}

}
