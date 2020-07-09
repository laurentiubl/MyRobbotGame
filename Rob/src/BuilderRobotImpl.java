
public class BuilderRobotImpl extends Builder {

	
	public BuilderRobotImpl () {
		robot = new Robot();
	}
	
	@Override
	public Robot buildRobot() {
		
		Componente head = new Head();
		robot.buildHead(head);
		
		Componente body = new Body();
		robot.buildBody(body);
		
		Componente legs = new Legs();
		robot.buildLegs(legs);
		
		robot.getNameRobot();
		return robot;
	}

	
}
