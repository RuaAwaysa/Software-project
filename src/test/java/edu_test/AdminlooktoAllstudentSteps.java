package edu_test;

import static org.junit.Assert.assertEquals;

import edu_test.Admin;
import edu_test.Student;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminlooktoAllstudentSteps {
     Admin a=new Admin();
     Student s;
     String str;
/*
@Given("that admin is logged in")
public void that_admin_is_logged_in() {
    // Write code here that turns the phrase above into concrete actions

}

@Given("these Student are registered in the Edu-center")
public void these_student_are_registered_in_the_edu_center(io.cucumber.datatable.DataTable dataTable) {
	for(int i=0; i<dataTable.height();i++) {
		  s = new Student(dataTable.cell(i,0),dataTable.cell(i,1), dataTable.cell(i,2) ,dataTable.cell(i,3) ,dataTable.cell(i,4), dataTable.cell(i,5) , dataTable.cell(i,6) );
		  a.c.Students.add(s) ;
		  }
}

@When("he press")
public void hePress() {
    
}



@Given("Admin need to look to the info for all student in the System")
public void admin_need_to_look_to_the_info_for_all_student_in_the_system() {
	 str= a.showstudent();
}

/*@Then("massage {string} should display")
public void massage_should_display(String string) {
	assertEquals(string,str);
}

*/
/*
@Then("massage {string} and another message {string} and the last message {string}")
public void massage_and_another_message_and_the_last_message(String string, String string2, String string3)
{
	String data = string+"-"+string2+"-"+string3+"-";
//	a.equalData(string,string2,string3);
	System.out.println("data ="+data);
    // Write code here that turns the phrase above into concrete actions
	assertEquals(data,str);
}


*/
}
