package main;

public class Leon extends Animales {
	private String colorLeon; 
	
	public Leon(String reino, int numeroPatas, String tipoComida,String colorLeon) {
		super(reino,numeroPatas,tipoComida);
		this.colorLeon = colorLeon;
	}

	@Override
	public void comer() {
		correr();
		System.out.println("Estoy comiendo");
		
	}

}
