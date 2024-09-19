package edu_test;

import edu_test.ExtraService;
import edu_test.center;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Billstudent {
	  String S_ID;
	  center c=new center();
		 ExtraService s;
		 
		 
	@Given("student is loggedin with id={string}")
	public void studentIsLoggedinWithId(String string) {
	 S_ID=string;
			
	}
	
	@Given("services id={string}")
	public void servicesId(String string) {
		
	s.id=string;
		
	}
	
	@Then("should pay {string}")
	public void shouldPay(String string) {
	
	
	}
	
	@Then("should See message {string}")
	public void shouldSeeMessage(String string) {
	
	
	}
	



}
