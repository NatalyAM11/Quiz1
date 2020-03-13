package main;

public abstract class Figura {
	
	
	protected int posx;
	protected int posy;
	protected int color;
	protected int velX;
	protected int velY;
	
	
	

	



public Figura (int posx,int posy) {
	this.posx=posx;
	this.posy=posy;
	this.velX=4;
	this.velY=3;
	
		
}


public abstract void pintar();
public abstract void mover();


public int getPosx() {
	return posx;
}


public int getPosy() {
	return posy;
}


public int getColor() {
	return color;
}


public int getVelX() {
	return velX;
}


public int getVelY() {
	return velY;
}



}