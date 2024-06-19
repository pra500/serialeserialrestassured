package pac4;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pac4.Login11;

public class PostRequest111Test {
	
	/*
	{
	    "email": "eve.holt@reqres.in",
	    "password": "cityslicka"
	}
	*/
	
	
	
  @Test
  public void postreq11111Test() throws JsonProcessingException {
	  
	  
	  //serialization:
	  
	  Login11 lo=new Login11("eve.holt@reqres.in", "cityslicka");
	  
	  ObjectMapper om=new ObjectMapper();
	  
	  String request=  om.writerWithDefaultPrettyPrinter().writeValueAsString(lo);	  
	  
	  System.out.println(request);
	  
	  
	  
	  /*
	  //o/p:
	  {
		  "email" : "eve.holt@reqres.in",
		  "password" : "cityslicka"
		}
	  */
	  
	  
	  
	  
	 //deserialization:
	  
	Login11 loo=om.readValue(request, Login11.class);
	
	System.out.println(loo.getEmail());
	
	System.out.println(loo.getPassword());
	
	
	 //o/p:
	/*
	{
		  "email" : "eve.holt@reqres.in",
		  "password" : "cityslicka"
		}
		eve.holt@reqres.in
		cityslicka
	  
	  */
	  
	  
	  
	  
	  
	  
  
}
  
  
  
  
  
}
