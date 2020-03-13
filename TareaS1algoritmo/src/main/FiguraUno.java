package main;


import processing.core.PApplet; 

public class FiguraUno extends Figura{
		
		private PApplet app; 
		

		public FiguraUno(int posx, int posy, PApplet app) {
			super(posx, posx);
			this.app=app;
		}
		

		public void pintar() {
			
			app.ellipse(posx, posy, 50, 50);
			
		}
		
		public void mover() {
			posy+=velY;
			if(posy>475 || posy< 0) {
				velY*=-1;
			}
		}
		
		

	}