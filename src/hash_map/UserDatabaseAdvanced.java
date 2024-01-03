package hash_map;

import java.util.HashMap;
import java.util.Map;

public class UserDatabaseAdvanced {

	public static void main(String[] args) {
		
		Map<String,UserInfo> userMap =new HashMap<>();
		
		userMap.put("jenu", new UserInfo("jenith","jenith@gmail.com"));
		userMap.put("nishu", new UserInfo("nishant","nishant@gmail.com"));
		userMap.put("jeshu", new UserInfo("jessicca","jesika@gmail.com"));
	
		
		//Displaying the user map with detailed user information  for hashmap
		//In the loop, we use entrySet() to obtain a set of map entries.
		for(Map.Entry<String, UserInfo> entry: userMap.entrySet()) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
		
	}
	
	

}
