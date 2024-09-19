package edu_test;

import static org.junit.Assert.assertEquals;

import edu_test.Reservation;
import edu_test.center;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class visited {
    String R_ID;
    String S_ID;
    Reservation R;
    center c=new center();
    boolean res1;
	//Book_Appointment_Test R=new Book_Appointment_Test();
	
	boolean v;
	
	@Given("reservation_ID is {string}")
	public void reservationIDIs(String string) {
	    // Write code here that turns the phrase above into concrete actions
		R_ID=string;
	}
	@Given("Student_ID is {string}")
	public void studentIDIs(String string) {
	    // Write code here that turns the phrase above into concrete actions
		S_ID=string;
	}
	@Given("visited is {string}")
	public void visitedIs(String string) {
	    // Write code here that turns the phrase above into concrete actions
		v=true;
		
	}
	@Then("student add note to reservation_ID equals {string}")
	public void studentAddNoteToReservationIDEquals(String string) {
	    // Write code here that turns the phrase above into concrete actions
		res1=R.checkR(S_ID ,R_ID,v);
		if(res1==true) 
			R.addNote(R_ID, string);
		
		assertEquals(res1,true);
			
	}



/*
	@Given("reservation_ID is {string}")
	public void reservationIDIs(String string) {
//	    // Write code here that turns the phrase above into concrete actions
///	    throw new io.cucumber.java.PendingException();
		R_ID=string;
			
	}
	@Given("Student_ID is {string}")	public void studentIDIs(String string) {
//	    // Write code here that turns the phrase above into concrete actions
////	    throw new io.cucumber.java.PendingException();
		S_ID=string;
		
	}
	@Given("visited is {string}")
	public void visitedIs(String string) {
	    // Write code here that turns the phrase above into concrete actions
      v=true;
		
	}
	@Then("student add note to reservation_ID equals {string}")
	public void studentAddNoteToReservationIDEquals(String string) {
	    // Write code here that turns the phrase above into concrete actions
	res1=R.checkR(S_ID ,R_ID,v);
	if(res1==true) 
		R.addNote(R_ID, string);
	
	assertEquals(res1,true);
		
	}
//
//
	@Then("student can't add note")
	public void studentCanTAddNote() {
//	    // Write code here that turns the phrase above into concrete actions

		res1=R.checkR(S_ID ,R_ID,v);
if(res1==false) 
		
		assertEquals(res1,false);
//			
	}

*/

	
}
