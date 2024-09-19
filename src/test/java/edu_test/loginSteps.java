package edu_test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import edu_test.Admin;
import edu_test.center;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
	
	
public class loginSteps { 
	 Admin A;

	center c=new center();
	//public List<List<String>> adminList ;
	
	
		 String pass;
		 boolean intable; 
		 boolean truepass;
String n;
String p;
		
		String res1;
		String res2;
		
		
		
		@Given("that this is admin table")
		public void thatThisIsAdminTable(io.cucumber.datatable.DataTable dataTable) {
			
			 String password;
			 String name;
			 String ID;
			 String Gmail;
			
			  for(int i=0; i<dataTable.height();i++) {
					name=dataTable.cell(i,0);
					password=dataTable.cell(i, 1);
					Gmail=dataTable.cell(i, 2);
				    ID=	dataTable.cell(i, 3);
					 A=new Admin(name,password,Gmail,ID);
					 c.adminlisttable.add(A);
				  
				  } 
	}
		@Given("Admin name is {string}")
		public void adminNameIs(String string) {
		   n=string;
		   }
		@Given("password is {string}")
		public void passwordIs(String string) {
	
			   p=string;
//				 
		}
		@Then("the Admin login succeeds")
		public void theAdminLoginSucceeds() {
              res1=  A.login(n, p);  
			 
		}
		@Then("admin see message {string}")
		public void adminSeeMessage(String string) {
		 assertEquals(string,res1);
			   
		}

		

		@Then("the Admin login fails")
		public void theAdminLoginFails() {
		 res2=  A.login(n, p);  
			// assertEquals("login fails",res);
				
		}
		@Then("admin see error message {string}")
		public void adminSeeErrorMessage(String string) {
		   assertEquals(string,res2);
			   
		}

}