package uniandes.dpoo.taller4.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;



public class Principal extends JFrame{

	public Principal() {
		this.setSize(1080, 720);
		this.setTitle("Light Out");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		PEstado pEstado = new PEstado();
		this.add(pEstado, BorderLayout.SOUTH);
		
		PBotones pBotones = new PBotones();
		this.add(pBotones, BorderLayout.EAST);
		
		PArriba pArriba = new PArriba();
		this.add(pArriba, BorderLayout.NORTH);
		
		}
	
	public static void main(String[] args) {
		Principal fPrincipal = new Principal();
		fPrincipal.setVisible(true);
		
		
	}
}
