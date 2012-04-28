public class Contact {
	private String firstName;
	private String lastName;
	private String email;
	private long userid;

	public String getEmail() {
		return email;
	}

	
	public String getFirstName() {
		return firstName;
	}

	
	public String getLastName() {
		return lastName;
	}

	public void setEmail(String string) {
		email = string;
	}

	
	public void setFirstName(String string) {
		firstName = string;
	}

	public void setLastName(String string) {
		lastName = string;
	}

	public long getUserid() {
		return userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

}
