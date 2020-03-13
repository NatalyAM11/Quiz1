package main;

import processing.core.PApplet; 

public class FiguraDos extends Figura{
	
	protected PApplet app;
	
	public FiguraDos (int posx, int posy, PApplet app) {
		
		super(posx,posy);
		this.app= app; 
		
	}
	
public void pintar() {
	
	app.rect( getPosx(), getPosy(),50, 50);
	
}

public void mover() {
	
		posx+=velX;
		if(posx>475 || posx< 0) {
			velX*=-1;
		}
	
	
	
	
	
}

}