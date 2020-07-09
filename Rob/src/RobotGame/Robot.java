package RobotGame;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Robot {
	
	private String RobotCreatedBy;
	
	

	public String getNameRobot() {
		
		
		 List<String> list = new ArrayList<>(); 
		 list.addAll(Arrays.asList("Astrale", "Super", "Indistruttibile", "Magnifico","Transformabile"));
		 String n;
		 Random rand = new Random(); 
		 n = list.get(rand.nextInt(list.size())); 
		 String nome = " Robot ";
		 int low = 1;
		 int high = 100;
		 int numeroCasuale = rand.nextInt(high-low) + low;
		 String numero = Integer.toString(numeroCasuale); 

		 List<String> list2 = new ArrayList<>(); 
		 list2.addAll(Arrays.asList(" astro infuocato", " uragano di luce", " tenebra profonda", " muro impenetrabile"," onda dirompente"));
		 String postfisso;
		 postfisso = list2.get(rand.nextInt(list.size())); 
		 
		 return n +" "+ nome + numero + " "+ postfisso;
		
	}
	
	public void buildHead(Componente comp) {
		comp.createComponent();
	}
	
	public void buildBody(Componente comp) {
		comp.createComponent();
	}
	
	public void buildLegs(Componente comp) {
		comp.createComponent();
	}

	
	public String getRobotCreatedBy() {
		return RobotCreatedBy;
	}
	
	public void setRobotCreatedBy(String RobotCreatedBy) {
		this.RobotCreatedBy = RobotCreatedBy;
	}
	
	
}
