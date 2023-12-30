import java.util.*;
public class LinkedListExample {
	
	//Linked List is a sequence of links which contains items. Each link contains a connection to another link. 
	public static void main(String[] args) {
		
		LinkedList<String> al = new LinkedList<String>();
		al.add("Jenith");
		al.add("Rahul");
		al.add("Mohit");
		
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	
	
	
	
}
