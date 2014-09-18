package rebote;

import java.awt.Color;
import java.awt.Graphics;


public class BouncyCirculo extends Circulo{
	
	Color color;
	public BouncyCirculo(){
		
		tama�o = 100;
		Pared = 0.75f;
		color = Color.YELLOW;
	}

	@Override
	public void DetectarPared()
	{
		if(posicionX+tama�o > 800)
			{
				Rebotar();
				CambiarColor();
			}
	}
	
	public void Rebotar(){
		velocidadX = 5f;
	}
	
	public void CambiarColor()
	{
		color = Color.blue;
	}
	
	@Override
 	public void Draw (Graphics g){		 
		 g.setColor(color);
		 g.fillOval(posicionX,posicionY,tama�o,tama�o);
	}

}
