package uniandes.dpoo.taller4.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PTablero extends JPanel  implements MouseListener, Observer {
	

	private int numeroCasillas;
	private BufferedImage luz;

	private void cargarImg() {
		try {
			luz = ImageIO.read(getClass().getResourceAsStream("/luz.png"));
		} catch (Exception e) {

		}
	}
	

	
	public void paint (Graphics g) { 
		cargarImg();

		g.setColor(new Color (255,255,255));
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.setColor(new Color (0,0,0));
		this.numeroCasillas = 5;
		
		for (int i =1 ; i<numeroCasillas; i++) {
			g.drawLine(0, i*this.getHeight()/numeroCasillas, this.getWidth(), this.getHeight()*i/numeroCasillas);
			g.drawLine(i*this.getWidth()/numeroCasillas, 0, i*this.getWidth()/numeroCasillas, this.getHeight());
		}
		
		for(int x = 0; x<numeroCasillas; x++) {
			for (int y = 0; y <numeroCasillas; y++) {
				g.setColor(new Color (0,0,0));
				g.fillRect((this.getWidth()/numeroCasillas*x)+6, (this.getHeight()/numeroCasillas * y)+6, (this.getWidth()/numeroCasillas)-9, (this.getHeight()/numeroCasillas)-9);
				g.drawImage(luz,(x)*this.getWidth()/numeroCasillas,y * this.getHeight()/numeroCasillas, this.getWidth()/numeroCasillas, this.getHeight()/numeroCasillas, null);
			}	
		}


	
		
	}

	public void setNumeroCasillas(int numeroCasillas) {
		this.numeroCasillas = numeroCasillas;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Observable o, Object arg) {
		this.repaint();
		
	}
}
