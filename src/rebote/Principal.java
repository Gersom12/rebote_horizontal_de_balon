package rebote;

import javax.swing.JFrame; 

import rebote.Canvas;

public class Principal {

	public Principal(){
		
	}
	
	public static void main(String args[]){

		JFrame jframe=new JFrame();
		jframe.setSize(800, 600);

		Canvas can = new Canvas();
		
		jframe.add(can);
		jframe.setVisible(true);
	}
	
}

