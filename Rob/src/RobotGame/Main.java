package RobotGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {

	private static Scanner sc;


	public static void main(String[] args) {
		
		boolean div2 = true;
		int RobotsAndFabrics =0;
	
		while(div2) {
			sc = new Scanner(System.in);
			System.out.println("How many robots do you want?");
			System.out.println("Please enter number div 2");
			RobotsAndFabrics = sc.nextInt();
			if(RobotsAndFabrics %2 ==0) {
				div2= false;
			}
		}
		
		Fabric generalFabric = getGeneralFabric(RobotsAndFabrics);
		List<Robot> robots = new ArrayList<>();
		generalFabric.createRobots(robots);
		
		for (Robot robot : robots) {
			System.out.println(robot.getRobotCreatedBy());
			System.out.println(robot.getNameRobot());
		}
	}
	/**
	*  
	* Ho trovato efficace utilizzare il modello della catena di responsabilità per salvare
	   una catena di fabbriche. E per ogni factory abbiamo un riferimento salvato (setNextFabric)
	   con il factory successivo.
      Quindi quando arriviamo a creareRobot dalla nostra classe di fabbrica, 
       e la fabbrica che ha chiamato il metodo (createRobot) esplode,
       arriva in  nostro controllo  if(nextFabric.createRobots(our list of robots)
       e qui è il nostro punto di forza perché abbiamo già impostato nextFabric all'inizio 
       quindi  possiamo chiamare nuovamente il metodo createRobots (dal nostro elenco) 
       e creare robot con la nostra nuova fabbrica inesplosa.

	*/
	
	
	private static Fabric getGeneralFabric(int fabricNr) {
		List<Fabric> fabricList = new ArrayList<>();
		for (int i = 0; i < fabricNr; i++) {
			
			Fabric fabric = new Fabric();
			fabric.setName(String.valueOf(i));
			System.out.println("I have created fabric nr: " + i);
			
			if (fabricList.size() > 0 && fabricList.size() <= fabricNr - 1) {
				Fabric previousFabric = fabricList.get(i - 1);
				previousFabric.setNextFabric(fabric);
				previousFabric.setNumberOfContendenti(fabricNr);
				System.out.println("I add nextFabric " + i + " at Fabric " + (i-1));
			}
			fabricList.add(fabric);
		}
		return fabricList.get(0);
	}

}
