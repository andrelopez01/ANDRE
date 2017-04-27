package test;

import model.Area;
import model.Coordenate;

public class TestCoordenate {

	public static void main(String[] args) {
		Coordenate coordenate = new Coordenate(10, 10);
		System.out.println(coordenate.getX()+"," + coordenate.getY());
		coordenate.move(Math.toRadians(5), 10);
		System.out.println(coordenate.getX()+"," + coordenate.getY());
		coordenate.move(Math.toRadians(5), 10);
		System.out.println(coordenate.getX()+"," + coordenate.getY());
	
	}
}
