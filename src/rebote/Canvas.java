package rebote;

import rebote.BouncyCirculo;
import rebote.Circulo;



import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Canvas extends JPanel{

	private static final long serialVersionUID = 1L;
	Circulo circulo = new Circulo();
	BouncyCirculo bouncy= new BouncyCirculo();
	
	public Canvas()
	{
		
	}

 	public void paint(Graphics g) {
  		update(g);	
  		g.setColor(Color.black);
		 g.fillRect(0,0, getSize().width, getSize().height);	
		 circulo.Draw(g);
		 bouncy.Draw(g);
		 repaint();
 	}
	
 	public void update (Graphics g){	
		 circulo.Update();
		 bouncy.Update();
	 }

}