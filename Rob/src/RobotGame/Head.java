package RobotGame;

import java.util.Random;

public class Head implements Componente{

	private int power;



	public Head() {
		// TODO Auto-generated constructor stub
	}


	private int intelligence;
	
	
	
	@Override
	public void createComponent() {
		Random random = new Random();
		int high = 10;
		int low = -10;
		int intelligence = random.nextInt(high-low) + low;;
		this.intelligence= intelligence;
		int power =  random.nextInt(100);
		this.power = power;
	}


	public int getPower() {
		return power;
	}


	public void setPower(int power) {
		this.power = power;
	}


	public int getIntelligence() {
		return intelligence;
	}


	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}


}
