package pac2;

import groovyjarjarantlr4.v4.parse.BlockSetTransformer.setAlt_return;

public class Users {
	
	
	/*	
	{
	    "id": 1,
	    "email": "george.bluth@reqres.in",
	    "first_name": "George",
	    "last_name": "Bluth",
	    "avatar": "https://reqres.in/img/faces/1-image.jpg"
	}
	*/
	
	
	//https://reqres.in/api/users  - post call
	
	
	
	
	private int id;
	private String email;
	private String first_name;
	private String last_name;
	private String avatar;
	
	
	
	
	public Users()
	{
		
	}
	
	
	public Users(int idd, String eml, String fn, String ln, String avat)
	{
		
		setId(idd);
		setEmail(eml);
		setFirst_name(fn);
		setLast_name(ln);
		setAvatar(avat);
		
	}
	
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public String getAvatar() {
		return avatar;
	}


	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	
}