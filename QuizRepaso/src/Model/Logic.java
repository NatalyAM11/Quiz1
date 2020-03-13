package Model;
import java.lang.reflect.Array;
import java.util.ArrayList;

import processing.core.PApplet;

public class Logic {
	String[] TextOne;
	String [] TextTwo;
	PApplet app;
    ArrayList <Palabra> palabras;
    int velocidad;

 public Logic(PApplet app) {
	 this.app=app;
 }
 
 public void cargarTxT() {
	 
	 TextOne=app.loadStrings("../txt/TextOne.txt");
	 TextTwo= app.loadStrings("../txt/TextTwo.txt");
	 velocidad=4;
	 
	 palabras= new ArrayList<>(); 
	
	 for(String InfoEncon: TextTwo){
		 if(InfoEncon.contains("Camilo")) {
			 String[] palabraEncontrada= InfoEncon.split(" ");
			 
		 }
		/* for( int i=0; i< TextOne.length;i++) {
			 if(TextOne[i].contains(palabraEncontrada[0])) {
				 app.text(TextOne[0], 15,15);
			 }
		 }*/
		 
	 }
	 
 }
 
 public void pintar() {
	 
	 
	/* for(int i=0; i<TextTwo.length;i++) {
		 if(TextTwo[i].contains("Leon")) {
			 String[] listainicial=TextTwo[i].split(" ");
			 System.out.println(listainicial[i]);
		 }
	 }*/
	 
	 for(int i=0; i<TextTwo.length;i++) {
		 palabras.add(new Palabra(TextOne[i],15,15));
		 app.text (TextTwo[i],80,88);
	 }
	 }
	 
	/* for(String Buscar: TextTwo) {
	 
	 
		 if (Buscar.contains("Leon")) {
			 String[] palabras= Buscar.split(" ");
			 
			 for (int i=0; i<TextOne.length;i++) {
				if(TextOne[i].contains(palabras[0])) {
					System.out.println(TextOne[i]);
					//app.text(TextOne[i],15,15);
				}
			 }
			 }
		 }*/
		 
	 
	 
	

 
private int random(int i, int j) {
	// TODO Auto-generated method stub
	return 0;
}
}