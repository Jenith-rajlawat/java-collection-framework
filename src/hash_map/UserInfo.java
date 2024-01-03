package hash_map;

public class UserInfo {

	private String username;
	private String email;
	
	public UserInfo(String username, String email) {
		this.username=username;
		this.email=email;
	}
	
	
	public String getUsername() {
		return this.username;
	}
	
	public String getemail() {
		return this.email;
	}
	
	public void setUsername(String username) {
		this.username=username;
	}
	
	public void setemail(String email) {
		this.email=email;
	}


	@Override
	public String toString() {
		return "UserInfo [username=" + username + ", email=" + email + "]";
	}
	
	
}

