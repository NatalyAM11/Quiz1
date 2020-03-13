package view;

import processing.core.PApplet;

public class FiguraUno extends Figura {
	
	public FiguraUno (int posX, int posY, int tam,String tipo,int dir,PApplet app) {
		super(posX,posY,tam,tipo,dir,app);
	}
	
	public void pintar(PApplet app) {
		app.fill(255,0,0);
		app.ellipse(posX,posY,tam,tam);
	}
	
	public void mover () {
		posX+=dir;
		
		if(posX>=500) {
			dir=dir;
		}
	}

}
