package RobotGame;

import java.util.List;
import java.util.Random;

public class Fabric {
	
	private String name;
	private Fabric nextFabric;
	private int numberOfContendenti;
	private static int numberOfContendentiMETHODintern;

	public void setNumberOfContendenti(int numberOfContendenti) {
		this.numberOfContendenti = numberOfContendenti;
	}

	public void setNextFabric(Fabric nextFabric) {
		this.nextFabric = nextFabric;
	}
	
	
	public void createRobots(List<Robot> robotsCreatedFromPreviousFabric) {
		int robotsCreated = 0;
		boolean FabricExploded = false;
		while (!FabricExploded) {
			BuilderRobotImpl rob = new BuilderRobotImpl();
			Robot robot = rob.buildRobot();
			robot.setRobotCreatedBy("Created by Fabric" + name);
			robotsCreatedFromPreviousFabric.add(robot);
			robotsCreated++;
			numberOfContendentiMETHODintern++;
			if (robotsCreated % 2 == 0) {
				FabricExploded = robotExploded();
			}	
			if(numberOfContendentiMETHODintern>=numberOfContendenti ) {
				FabricExploded = true;
			}
		}
		if(nextFabric != null && numberOfContendentiMETHODintern<numberOfContendenti) {
			nextFabric.createRobots(robotsCreatedFromPreviousFabric);
		}
	}
	
	private static boolean robotExploded() {
		Random random = new Random();
		int exploded = random.nextInt(2);
		return exploded == 1;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
