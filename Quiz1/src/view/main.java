package view;


import processing.core.PApplet;

public class main extends PApplet {
	
	Figura figuras;
	String[] textOne;
	int posX;
	int posY;
	int tam;
	String tipo;
int dir;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("view.main");
	}
	public void settings() {
		size(500,500);
	}
	
	
	public void setup() {
		textOne= loadStrings("../txt/textOne.txt");
	    //figuras= new Figura (posX,posY,tam,tipo,this);
	    
	    for(String InfoEncon: textOne){
		String[] palabraEncontrada= InfoEncon.split(" ");
	    figuras= new Figura (palabraEncontrada[2],palabraEncontrada[3],palabraEncontrada[1],palabraEncontrada[0], palabraEncontrada[4],this);
		System.out.println(palabraEncontrada[1]);		
	    }
	}
	
	
	public void draw() {
		background(0);
		
		fill(255);
		figuras.pintar();
		figuras.mover();
		}
	
	
		
		
	
	
	

}
