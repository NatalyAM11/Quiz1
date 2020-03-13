package main;

public abstract class Animales {
	
	protected String reino;
	protected int numeroPatas;
	protected String tipoComida;

	public Animales(String reino, int numeroPatas, String tipoComida) {
		this.reino=reino;
		this.numeroPatas=numeroPatas;
		this.tipoComida=tipoComida;
		
	}
	
	public abstract void comer ();
	
	public void correr () {
		System.out.println("estoy corriendo");
	}

	public String getReino() {
		return reino;
	}

	public void setReino(String reino) {
		this.reino = reino;
	}

	public int getNumeroPatas() {
		return numeroPatas;
	}

	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}

	public String getTipoComida() {
		return tipoComida;
	}

	public void setTipoComida(String tipoComida) {
		this.tipoComida = tipoComida;
	}

}
