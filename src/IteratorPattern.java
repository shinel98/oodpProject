import java.util.ArrayList;
import java.util.Iterator; 
import java.util.List;

	
public class IteratorPattern implements Iterable<String> { 
	
		 private List<String> list = new ArrayList<String>(); 
		 
		 public void add(String menu) { 
			 
	
			 list.add(menu); 
			 } 
		 
		 public Iterator<String> iterator() { 
			 
			 return list.iterator(); 
			 } 
}
