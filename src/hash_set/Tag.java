package hash_set;

public class Tag {

	private String name;
	
	public Tag(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/* The equals() method in Java is a built-in
	 *  function used to compare two strings. It 
	 *  checks whether two strings are equal 
	 *  character-by-character and returns a 
	 *  boolean value – true if they are equal and
	 *   false if not.
	 *   if you don't want to be more case sensitive then
	 *   use equalsIgnoreCase()
	 *   */
	
	/*While the equals() method is a powerful 
	 * tool for string comparison in Java, it’s 
	 * important to note that it can throw a 
	 * NullPointerException if you try to use
	 *  it on a null reference. */
	
	@Override
	public boolean equals(Object o) {
		if(this==o) return true;
		if(o==null || getClass()!=o.getClass()) return false; //checking for the con of using equals which is it returns null pointer exception if object is null
		//Note that getClass() returns a Class object, 
		//and o.getClass() returns the Class object representing 
		//the class of the object o. The comparison getClass() != o.getClass() 
		//checks if they are not the same class.
		Tag tag = (Tag) o; //if not ClassCastException is thrown
		return name.equals(tag.name);
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	
	
}
