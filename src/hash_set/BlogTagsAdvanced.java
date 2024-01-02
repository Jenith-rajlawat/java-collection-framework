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
		
		
	}

}
