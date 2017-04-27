package test;

import model.Figure;

public class TestFigure {
	
	public static void main(String[] args) {
		Figure figure = new Figure(100.0, 100.0, 10, Math.toRadians(45), 10.0);
		System.out.println(figure.getX()+" , "+ figure.getY());
		new Thread(figure).start();
		figure.setMoving(true);
		for (int i = 0; i < 100; i++) {
			System.out.println(figure.getX()+" , "+ figure.getY());
		} 
		figure.setMoving(false);
	}

}
