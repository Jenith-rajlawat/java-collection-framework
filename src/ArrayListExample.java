import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArrayListExample {

	public static void main(String[] args) {
		List<String> al=new ArrayList<String>();
		
		al.add("Jenith");
		al.add("Jesika");
		
		Iterator itr=al.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		
		
	}
	
}
