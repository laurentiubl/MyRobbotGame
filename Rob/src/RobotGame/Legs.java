package RobotGame;

import java.util.Random;

public class Legs implements Componente {

	private int power;
	private int robusteza;
	
	@Override
	public void createComponent() {
		Random random = new Random();
		int high = 10;
		int low = -10;
		int robusteza = random.nextInt(high-low) + low;;
		this.robusteza= robusteza;
		int power =  random.nextInt(100);
		this.power = power;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getRobusteza() {
		return robusteza;
	}

	public void setRobusteza(int robusteza) {
		this.robusteza = robusteza;
	}

}
