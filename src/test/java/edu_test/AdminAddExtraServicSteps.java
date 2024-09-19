package edu_test;
/*
package Edu_Test;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminAddExtraServicSteps {
	
	 Admin a=new Admin();
	 ExtraService s,s2;
	 String res;
	 boolean f;
	 String x1,x2,x3;
	 

@Given("that admin is loged in")
public void that_admin_is_loged_in() {
    
}

@Given("these Servic are registered in the Edu-center")
public void these_servic_are_registered_in_the_edu_center(io.cucumber.datatable.DataTable dataTable) {
	for(int i=0; i<dataTable.height();i++) {
		  s = new ExtraService(dataTable.cell(i,0),dataTable.cell(i,1), dataTable.cell(i,2));
		  a.c.service.add(s);
}
	}

@Given("Admin need to add extra servic in the System")
public void admin_need_to_add_extra_servic_in_the_system() {
 
}

@Given("there is a Servic with ID {string}  , name {string} ,  price {string}")
public void there_is_a_servic_with_id_name_price(String string, String string2, String string3) {
	x1=string; x2=string2;  x3=string3;
	  res = a.searchService(string);
}

@Then("massage that will be display {string}")
public void massage_that_will_be_display(String string) {
	assertEquals(string,res);
	  s = new ExtraService(x1,x2,x3);
	  a.c.service.add(s);
	  System.out.print(string+"-------"+res);
}

@When("he press")
public void hePress() {
}



@Then("Errormassage that will be display {string}")
public void errormassage_that_will_be_display(String string) {
	assertEquals(string,res);
	  System.out.print(string+"-------"+res);
}

	 
	 
	 
	 



@Given("there is a Servic with ID {string}  , name {string} ,  price {string}")
public void there_is_a_servic_with_id_name_price(String string, String string2, String string3) {
	x1=string; x2=string2;  x3=string3;
  res = a.searchService(string);
  if(res.equals("ADDED SUCSSECFULLY")) {f=true;}
  else f=false;
}

@Then("massage that will be display {string}")
public void massage_that_will_be_display(String string) {
	if(f) { assertEquals(string,res);
	s2 = new ExtraService(x1,x2,x3);
	  a.e.service.add(s2) ;}
	else  assertEquals(string,res);
}


}



*/
