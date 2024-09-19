package edu_test;

import static org.junit.Assert.assertEquals;

import edu_test.Admin;
import io.cucumber.java.en.*;

public class AdminRegester_step {
	 String v;
	 Admin adm = new Admin() ;

	@Given("that admin is not logged in")
	public void that_admin_is_not_logged_in() {
		adm.logstate = false ;  
	}

	@Given("these Admin  are registered in the Edu-center")
	public void these_admin_are_registered_in_the_edu_center(io.cucumber.datatable.DataTable dataTable) {
		String Id , name ,  password , Email   , phone , address ;
		for(int i=0; i<dataTable.height();i++) {
			
			  Id=dataTable.cell(i,0);
			 name=dataTable.cell(i,1);
			 password=dataTable.cell(i,2);
			Email=dataTable.cell(i,3);
			  phone =dataTable.cell(i,4);
			address= dataTable.cell(i,5) ;
//		Id , name ,password ,Email ,  Class_degree , phone,address 
			
			adm = new Admin (name , password ,Email ,Id );
			adm.c.adminlisttable.add(adm);
			
	}
	
	}

	
	
	
	
	
	
	
	
	///sen1-------------------------------------------------------------
	
	
	@Given("that admin is already registered")
	public void that_admin_is_already_registered() {
	   adm.logstate=false;
	}

	@Given("there is a admin with ID {string}  , name {string} ,  password {string} , email {string} ")
	public void there_is_a_admin_with_id_name_password_email_phone_and_adress(String string, String string2, String string3, String string4, String string5, String string6) {
	adm = new Admin (string, string2 ,string3 ,string4 );
	} 

	@When("admin tries to register  himself as new admin")
	public void admin_tries_to_register_himself_as_new_admin() {
	 v=adm.search(adm) ;
	 System.out.print(v);
	}

	@Then("an error massage {string} should display")
	public void an_error_massage_should_display(String string) {
	 assertEquals(string,v);
		 
	}
	
	
	
	
//sen2--------------------------------------------------------------------------------------------------------------------
	@Given("that admin is not registered")
	public void that_admin_is_not_registered() {
		 adm.logstate=true;
	    
	}

	@Given("there is a admin with ID {string} , name {string} ,password {string}, email {string} ")
	public void there_is_a_admin_with_id_name_password_email_phone_city(String string, String string2, String string3, String string4, String string5, String string6) {
		adm = new Admin (string, string2 ,string3 ,string4 );
		adm.c.adminlisttable.add(adm);
	}

	@Then("an information message {string} should displayed")
	public void an_information_message_should_displayed(String string) {
		 assert(true);
	}


	
}
