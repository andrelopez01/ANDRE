package test;

import java.awt.Toolkit;

import javax.swing.JFrame;

import model.Area;
import model.Figure;
import GUI.FigureGUI;
import GUI.JPanelGameArea;

public class TestJPanelGameArea {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("TestArea");
		jFrame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		Figure figure = new Figure(100.0, 100.0, 10, Math.toRadians(45), 10.0);
		JPanelGameArea jPanelGameArea = new JPanelGameArea(new FigureGUI(figure));
		figure.setArea(new Area(20,20,800,600));
		jFrame.add(jPanelGameArea);
		jPanelGameArea.init();
		jFrame.setVisible(true);
	}
}
