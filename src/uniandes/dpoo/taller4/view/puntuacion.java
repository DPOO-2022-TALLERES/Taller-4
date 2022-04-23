package uniandes.dpoo.taller4.view;

import java.awt.BorderLayout;
import java.util.PriorityQueue;
import javax.swing.JFrame;
import javax.swing.JList;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import uniandes.dpoo.taller4.modelo.RegistroTop10;

public class puntuacion extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JList<String> puntuaciones;
	
	public puntuacion(Collection<RegistroTop10> registros){
		setSize(250,500);
		this.setTitle("Puntuaciones");		
		this.setResizable(false);
		this.setLayout(new BorderLayout());
		puntuaciones = new JList<String>();
		Iterator<RegistroTop10> it = registros.iterator();
		
		while (it.hasNext()) {
			RegistroTop10 temp = it.next();
			temp.toString();
		}
		
		
		puntuaciones.setVisible(true);
		add(puntuaciones, BorderLayout.NORTH);
	}
}
