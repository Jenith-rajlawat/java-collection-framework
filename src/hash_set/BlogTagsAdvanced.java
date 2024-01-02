package hash_set;

import java.util.HashSet;

public class BlogTagsAdvanced {

	public static void main(String[] args) {
		
		HashSet<Tag> tagsSet =new HashSet<>();
		
		tagsSet.add(new Tag("Java"));
		tagsSet.add(new Tag("C Programming"));
		tagsSet.add(new Tag("Java")); //HashSet is mainly used for this, to remove the duplicate values
		//which saves the memory
		tagsSet.add(new Tag("Web Based Books"));
		
		//Displaying the items
		for(Tag tag: tagsSet) {
			System.out.println(tag); //it would not print two java
		}
		
		/*Behavior in HashSet:

When adding a new Tag to the HashSet, the HashSet checks for equality using the equals method.
If the equals method returns true, indicating that the new Tag is equal to an existing one, it won't be added (as in the case of adding "Java" twice).
The hashCode method is used to quickly identify potential matches before performing a more detailed equality check. */
		
		/* Why did we override the equals method ?
		 * 
By default, the equals method in Java compares object references, not
 the content of the objects. When you create a custom class, if you want to define
  equality based on the content of the objects, you need to override the equals method.
		 *
		 * so public class Tag {
    private String name;

    public Tag(String name) {
        this.name = name;
    }

    // Other methods and fields...

    public static void main(String[] args) {
        Tag tag1 = new Tag("Java");
        Tag tag2 = new Tag("Java");

        // Without overriding equals
        System.out.println(tag1.equals(tag2));  // Output: false
    }
}In the absence of an overridden equals method, the equals method inherited from the
 Object class compares references, and in the example above, tag1 and tag2 are distinct
  objects, so the result is false.
		 * 
		 * */
		
	}

}
