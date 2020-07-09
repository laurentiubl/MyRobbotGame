import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Robot {

	public String getNameRobot() {
		
		
		 final List<String> list = new ArrayList<>(); 
		 list.addAll(Arrays.asList("Astrale", "Super", "Indistruttibile", "Magnifico","Transformabile"));
		 String n;
		 Random rand = new Random(); 
		 n = list.get(rand.nextInt(list.size())); 
		 System.out.println(n);
		 return n;
		
	}
	
	public void buildHead(Componente comp) {
		comp.getType();
	}
	
	public void buildBody(Componente comp) {
		comp.getType();
	}
	
	public void buildLegs(Componente comp) {
		comp.getType();
	}
}
