package view;

import Model.Logic;
import controller.controller;
import processing.core.PApplet;

public class main extends PApplet {
	
	Logic palabra;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("view.main");

	}
	
	
	
	public void settings() {
		size(500,600);
	}
	
	
	public void setup() {
		palabra= new Logic(this);
		palabra.cargarTxT();
	}

	
	
	public void draw() {
		background(255);
		palabra.pintar();
		
	
	}
	}
