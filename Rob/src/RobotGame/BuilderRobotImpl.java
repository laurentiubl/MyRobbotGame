package RobotGame;

public class BuilderRobotImpl extends Builder {

	/**
	*  
	* Ho trovato efficace usare Builder Pattern per creare un oggetto complesso 
	* usando oggetti semplici.
	Mi sembra abbastanza elegante creare gradualmente un oggetto grande da un oggetto piccolo.
	Con questo pattern mi permette di cambiare la rappresentazione interna del prodotto finale.

	*/
	
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
