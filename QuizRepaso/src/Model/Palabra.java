package Model;

public class Palabra {
 protected int posX;
 protected int posY;
 protected String Text;
 
 public Palabra(String Text,int posX, int posY){
	 this.posX=posX;
	 this.posX=posY;
	 this.Text=Text;
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

public String getText() {
	return Text;
}

public void setText(String text) {
	Text = text;
}
 

}


