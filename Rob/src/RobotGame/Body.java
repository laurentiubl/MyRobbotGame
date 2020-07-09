package RobotGame;

import java.util.Random;

public class Body implements Componente{

	private int power;
	private int speed;
	
	
	@Override
	public void createComponent() {
		Random random = new Random();
		int high = 10;
		int low = -10;
		int speed = random.nextInt(high-low) + low;;
		this.speed= speed;
		int power =  random.nextInt(100);
		this.power = power;
		
	}


	public int getPower() {
		return power;
	}


	public void setPower(int power) {
		this.power = power;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
