package edu_test;

import static org.junit.Assert.assertEquals;

import edu_test.Admin;
import edu_test.Teacher;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminlooktoAllTeacherSteps {
 Teacher t ;
 Admin a=new Admin();
 StringBuilder str;
 @Given("that admin is loged in")
 public void thatAdminIsLogedIn() {
   
 }
 @Given("these Teachers are registered in the Edu-center")
 public void theseTeachersAreRegisteredInTheEduCenter(io.cucumber.datatable.DataTable dataTable) {
	 for(int i=0; i<dataTable.height();i++) {
		  t = new Teacher(dataTable.cell(i,0),dataTable.cell(i,1), dataTable.cell(i,2) ,dataTable.cell(i,3) ,dataTable.cell(i,4) );
		  a.c.teachers.add(t) ;
		  }
 }
 @Given("Admin need to look to the info for all Teacher in the System")
 public void adminNeedToLookToTheInfoForAllTeacherInTheSystem() {
	 str= a.showTeacher();
 }


 @Then("massage thwt will be display {string} and another message {string} and the last message {string}")
 public void massageThwtWillBeDisplayAndAnotherMessageAndTheLastMessage(String string, String string2, String string3) {
		String data = string+"-"+string2+"-"+string3+"-";
//		a.equalData(string,string2,string3);
		System.out.println("data ="+data);
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(data,str);
 }



}
