import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	/* HashMap is an implementation of the Map 
	 * interface in Java. It stores key-value pairs
	 *  and provides constant-time performance for basic 
	 *  operations like get, put, and remove. It does not 
	 *  guarantee the order of elements.*/
	
	
/*	Real-World Application:
		Consider a scenario where you want to
		 maintain a mapping between usernames and 
		 their corresponding email addresses in a
		  user database.
*/

	public static void main(String[] args) {
		
		Map<String,String> userMap=new HashMap<>();
		
		userMap.put("jenith", "jenithrajlawat@gmail.com"); //key value pair
		userMap.put("nishant", "nishanttimilsina@gmail.com");
		
		System.out.println("User Database :"+ userMap);
		
		
		String usernameToFind= "jenith";
		String email=userMap.get(usernameToFind); //return value of the key
		System.out.println("Email address for "+usernameToFind+": "+email);
		
		String userToRemove ="nishant";
		userMap.remove(userToRemove);
		
		System.out.println("Updated User Database: "+userMap);
		
	}
	
	
}
