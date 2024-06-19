package pac1;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PostApiRequestUsingPojosTest {
	
	
	//request content i need to gv in Booking class
		
	
	//testng  org.testng.annotations.Test, not junit
	
	
	
  @Test()
  public void PostApiRequestTest() throws JsonProcessingException {
	  
	//serialization:	
	  
	  BookingDates bdd=new  BookingDates("2018-01-01", "2019-01-01");
	  
	  Booking boo=new Booking("Jim", "Brown", 111, true, bdd, "Breakfast"); 
	  
     ObjectMapper om=new ObjectMapper();
     
  	String request= om.writerWithDefaultPrettyPrinter().writeValueAsString(boo);  //ll store the result in request body
  	
  	System.out.println(request);
  	  	
  	
  	
  	
  	//o/p:
  	/*
  	{
  	  "firstname" : "Jim",
  	  "lastname" : "Brown",
  	  "totalprice" : 111,
  	  "depositpaid" : true,
  	  "bookingdates" : {
  	    "checkin" : "2018-01-01",
  	    "checkout" : "2019-01-01"
  	  },
  	  "additionalneeds" : "Breakfast"
  	}  	
  */	
  	
  	
  	
  	
  	//deserialization:
  	
  	Booking bookingdetails=om.readValue(request, Booking.class);
  	
  	System.out.println(bookingdetails.getFirstname());
  	
	System.out.println(bookingdetails.getLastname());
  
		
    System.out.println(bookingdetails.getBookingdates().getCheckin());  
  
	System.out.println(bookingdetails.getBookingdates().getCheckout());
		
	
	
	System.out.println(bookingdetails.getTotalprice());
	
	System.out.println(bookingdetails.getAdditionalneeds());
	
	System.out.println(bookingdetails.isDepositpaid());
	
	
		
	
	
	/*
	o/p:
	{
		  "firstname" : "Jim",
		  "lastname" : "Brown",
		  "totalprice" : 111,
		  "depositpaid" : true,
		  "bookingdates" : {
		    "checkin" : "2018-01-01",
		    "checkout" : "2019-01-01"
		  },
		  "additionalneeds" : "Breakfast"
		}
		Jim
		Brown
  	
  	*/
  	
	
	
	
	
	
	 	
  	/*	
	{
		  "firstname" : "Jim",
		  "lastname" : "Brown",
		  "totalprice" : 111,
		  "depositpaid" : true,
		  "bookingdates" : {
		    "checkin" : "2018-01-01",
		    "checkout" : "2019-01-01"
		  },
		  "additionalneeds" : "Breakfast"
		}
		Jim
		Brown
		2018-01-01
		2019-01-01
		111
		Breakfast
		true
*/
	
	
	
	
	
		
	
  	
  	
	  
	  
	  
  }
}
