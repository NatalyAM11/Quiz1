package view;

import processing.core.PApplet;

public class FiguraTres extends Figura {
	
	public FiguraTres (int posX, int posY, int tam,String tipo,int dir,PApplet app) {
		super(posX,posY,tam,tipo,dir,app);
	}
	
	
	public void pintar(PApplet app) {
		app.fill(0,255,0);
		app.ellipse(posX,posY,tam,tam);
	}
	
	public void mover () {
		posY+=dir;
		
		if(posY>=500) {
			dir=dir;
		}
	}

}