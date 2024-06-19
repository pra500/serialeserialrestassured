package pac4;

public class Login11 {
	
	
	//post call: https://reqres.in/api/login  
	
		/*
		{
		    "email": "eve.holt@reqres.in",
		    "password": "cityslicka"
		}
		*/
	

	
	private String email;
    private String password;
    
    public Login11()
    {
    	
    }
    
    
    public Login11(String em, String pa)
    {
    	setEmail(em);
    	setPassword(pa);
    }
    
    
    public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}






}
