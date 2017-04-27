package GUI;

import java.awt.Color;
import java.awt.Graphics;

import model.Figure;

public class FigureGUI extends Figure{
	

	public FigureGUI(Figure figure) {
		super(figure.getX(), figure.getY(), figure.getSize(), figure.getDirection(), figure.getSpeed());
	}
	
	public void init(){
		this.setMoving(true);
		new Thread(this).start();
	}
	
	public void draw(Graphics graphics){
		graphics.setColor(Color.RED);
		graphics.fillOval((int)this.getX(),(int)this.getY(),this.getSize(), this.getSize());
	}
	
}
