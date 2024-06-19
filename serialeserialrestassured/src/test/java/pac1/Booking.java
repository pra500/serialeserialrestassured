package pac1;

public class Booking {
	
	
	//we are creating pojo class; this is pojo class
	
	
	//java class into json object - serialization
	//json object into java class  - deserialization
	
	
	/*
	curl -X POST \
	  https://restful-booker.herokuapp.com/booking \
	  -H 'Content-Type: application/json' \
	  -d '{
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
	

	//variable names must be exactly same as given in the request
	
	
	//https://restful-booker.herokuapp.com/apidoc/index.html  - post call it is 
	
	
	//https://www.youtube.com/watch?v=1YCPzoTcmqM&ab_channel=TestersTalk
	
	
	//"2018-01-01"  -  String it is 	
	
	//class name can be anything
	
	
	
		
		
	private String firstname;
	private String lastname;
	private int totalprice;	
	private boolean depositpaid;	
	private BookingDates bookingdates;
	private String additionalneeds;		
	
	
	

	public Booking()
	{
		
	}
	

	public Booking(String fname, String lname, int tp, boolean dp, BookingDates bd, String an)
	{
		
		
		setFirstname(fname);
		setLastname(lname);
		setTotalprice(tp);
		setDepositpaid(dp);
		setBookingdates(bd);
		setAdditionalneeds(an);
		
	}
	
	
		
	public BookingDates getBookingdates() {
		return bookingdates;
	}


	public void setBookingdates(BookingDates bookingdates) {
		this.bookingdates = bookingdates;
	}


	public String getAdditionalneeds() {
		return additionalneeds;
	}


	public void setAdditionalneeds(String additionalneeds) {
		this.additionalneeds = additionalneeds;
	}



	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public int getTotalprice() {
		return totalprice;
	}
	
	

	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}


	public boolean isDepositpaid() {
		return depositpaid;
	}


	public void setDepositpaid(boolean depositpaid) {
		this.depositpaid = depositpaid;
	}


	
	

}
	