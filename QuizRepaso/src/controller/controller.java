package controller;
import Model.Logic;
import processing.core.PApplet;

public class controller {
 PApplet app;
 Logic logica;
 
 public controller(PApplet app) {
	 this.app=app;
	 this.logica= new Logic(app);
 }
 
 
 public void cargar() {
	 logica.cargarTxT();
 }
 public void pintarPalabra() {
	 logica.pintar();
	 
 }
}
