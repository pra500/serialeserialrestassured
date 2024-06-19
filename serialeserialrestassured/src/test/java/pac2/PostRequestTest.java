package pac2;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PostRequestTest {
	
	

	/*	
	{
	    "id": 1,
	    "email": "george.bluth@reqres.in",
	    "first_name": "George",
	    "last_name": "Bluth",
	    "avatar": "https://reqres.in/img/faces/1-image.jpg"
	}
	*/
	
  @Test
  public void postreqTest() throws JsonProcessingException {
	  
	  
	  //serialization:
	  
	  Users us=new Users(1, "george.bluth@reqres.in", "George", "Bluth", "https://reqres.in/img/faces/1-image.jpg");
	  
	  ObjectMapper om=new ObjectMapper();
	  String request=om.writerWithDefaultPrettyPrinter().writeValueAsString(us);
	  
	  System.out.println(request);
	  
	  	  
	  //o/p:
	  /*
	  {
		  "id" : 1,
		  "email" : "george.bluth@reqres.in",
		  "first_name" : "George",
		  "last_name" : "Bluth",
		  "avatar" : "https://reqres.in/img/faces/1-image.jpg"
		}
		*/
	  
	  
	  
	  
	    
	  //deserialization:	  
	  
	  
	  Users us1=om.readValue(request, Users.class);
	  
	  System.out.println(us1.getId());	  
	  System.out.println(us1.getEmail());
	  System.out.println(us1.getFirst_name());  	  
	  System.out.println(us1.getLast_name());	  
	  System.out.println(us1.getAvatar());
	  
	  
	  
	  
	  
	  //o/p:
	  /*
	  {
		  "id" : 1,
		  "email" : "george.bluth@reqres.in",
		  "first_name" : "George",
		  "last_name" : "Bluth",
		  "avatar" : "https://reqres.in/img/faces/1-image.jpg"
		}
		1
		george.bluth@reqres.in
		George
		Bluth
		https://reqres.in/img/faces/1-image.jpg
	  */
	  
	  
	  
	  
  }
  
  
  
}
