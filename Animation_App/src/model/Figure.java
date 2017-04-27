package model;

public class Figure extends  Coordenate implements Runnable{
	
	private int size;
	private double direction;
	private double speed;
	private boolean moving;
	private Area area;
	
	public Figure(double x, double y, int size, double direction, double speed) {
		super(x, y);
		this.size = size;
		this.direction = direction;
		this.speed = speed;
		this.moving = false;
	}
	
	
	public Area getArea() {
		return area;
	}


	public void setArea(Area area) {
		this.area = area;
	}


	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public double getDirection() {
		return direction;
	}

	public void setDirection(double direction) {
		this.direction = direction;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public void run() {
		
		
		while (moving) {
			try {
				Thread.sleep((long) ((1/speed)*100));//esperar de acuerdo ala velocidad
				System.out.println("moviwndose");
				if (this.isArea(new Area(20,20,1800,1500))) {
					this.move(this.direction, 1);// desplazar direccion--> cambiar coordenadas
				}else{
					this.setDirection(this.direction+Math.toRadians(360));
					this.move(this.direction, 1);
				}
			} catch (InterruptedException e) {
			}
		}
	}

	public boolean isMoving() {
		return moving;
	}

	public void setMoving(boolean moving) {
		this.moving = moving;
	}

	

	
	
	


}
