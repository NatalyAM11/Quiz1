package main;

import java.util.ArrayList;

import processing.core.PApplet;


public class Main extends PApplet {
	
	private Leon leon1;
	private ArrayList <Leon> leonsitos;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}
	
	
	public void settings() {
		
	}
	
	public void setup () {
		leon1= new Leon ("Felino",4,"carnivoro","000");
		leonsitos= new ArrayList <Leon>();
		
	}
	
	public void draw() {
		//System.out.println(leon1.getNumeroPatas());
		leon1.comer();
		
		for (int i=0; i<leonsitos.size();i++) {
			System.out.println(leonsitos.get(i).getNumeroPatas());
		}
	}
	
	public void mousePressed () {
		
		
	}

}
