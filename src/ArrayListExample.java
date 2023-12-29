import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArrayListExample {

	public static void main(String[] args) {
		List<String> al=new ArrayList<String>();//Constructs an empty list with an initial capacity of ten.
		
		al.add("Jenith");
		al.add("Jesika");
		
		Iterator itr=al.iterator(); //Returns an iterator over the elements in this list in proper sequence.
			while(itr.hasNext()) {
				System.out.println(itr.next()); //Returns the next element in the iteration.
			}
		//Returns true if the iteration has more elements.(In other words, returns true if next wouldreturn an element rather than throwing an exception.)
		
	}
	
}
