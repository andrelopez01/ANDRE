package GUI;

import java.awt.Graphics;

import javax.swing.JPanel;

import model.Figure;

public class JPanelGameArea extends JPanel implements Runnable{
	
	private FigureGUI figureGUI;
	
	public JPanelGameArea(FigureGUI figureGUI) {
		super();
		this.figureGUI = figureGUI;
	}
	
	public void init(){
		new Thread(this).start();
		this.figureGUI.init();
	}
	
	@Override
	public void paint(Graphics graphics){
		super.paint(graphics);
		this.figureGUI.draw(graphics);
	}

	@Override
	public void run() {
		while (true) {
			repaint();
		}
	}

}
