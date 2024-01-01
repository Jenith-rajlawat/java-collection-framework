import java.util.HashSet;

public class HashSetExample {

	/*HashSet is an implementation of the Set interface in Java. 
	 * It does not allow duplicate elements and does not guarantee 
	 * the order of elements.*/
	
	/*Real-World Application:
Consider a scenario where you need to maintain a list 
of unique tags associated with blog posts. You want to
 ensure that each tag is unique, and the order of tags
  doesn't matter.*/
	
	public static void main(String[] args) {
	
		//--Implementation
		HashSet<String> tagsSet = new HashSet<>();
		
		
		//--Adding Tags to the set
		
	    tagsSet.add("Java");
	    tagsSet.add("Programming");
	    tagsSet.add("Java");  // Duplicate, won't be added
	    tagsSet.add("Web Development");

	 // Displaying the set of tags
        System.out.println("Blog Tags: " + tagsSet);
        
        
        // Checking if a tag exists
        String tagToCheck = "Java";
        if (tagsSet.contains(tagToCheck)) {
            System.out.println(tagToCheck + " is in the set.");
        } else {
            System.out.println(tagToCheck + " is not in the set.");}
            
            
         // Removing a tag
            String tagToRemove = "Web Development";
            tagsSet.remove(tagToRemove);
            
            
            // Displaying the updated set of tags
            System.out.println("Updated Blog Tags: " + tagsSet);
            
        }
		
	
	
	
	
	
}
