package view;
import processing.core.PApplet;

public class Figura {
	
	protected int posX;
	protected int posY;
	protected int tam;
	protected int dir;
	protected int tipo;
	PApplet app;
	
 public Figura (int posX, int posY, int tam,String tipo,int dir,PApplet app) {
	 this.posX=posX;
	 this.posY=posY;
	 this.tam=tam;
	 this.dir=5;
	 this.app=app;
 }
 

public Figura(String string, String string2, String string3, String tipo2, String string4, main app2) {
	// TODO Auto-generated constructor stub
}

public int getPosX() {
	return posX;
}

public void setPosX(int posX) {
	this.posX = posX;
}

public int getPosY() {
	return posY;
}

public void setPosY(int posY) {
	this.posY = posY;
}

public int getTam() {
	return tam;
}

public void setTam(int tam) {
	this.tam = tam;
}

public int getDir() {
	return dir;
}

public void setDir (int dir) {
	this.dir = dir;
}

public int getTipo() {
	return tipo;
}

public void setTipo(int tipo) {
	this.tipo = tipo;
}

public PApplet getApp() {
	return app;
}

public void setApp(PApplet app) {
	this.app = app;
}

public void pintar() {
	 
 }
 public void mover() {
	 
 }

public Figura get(int i) {
	// TODO Auto-generated method stub
	return null;
}
}