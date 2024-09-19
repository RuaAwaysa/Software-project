//package edu_test;
//import static org.junit.Assert.assertEquals;
//
//import java.util.ArrayList;
//
////import edu_Test.Admin;
//
//import io.cucumber.*;
//	import io.cucumber.datatable.DataTable;
//	import io.cucumber.java.en.Given;
//	import io.cucumber.java.en.Then;
//	import io.cucumber.java.en.When;
//public class add_course {
//
//
//	Course c  ; 
// int ExnumOfU  ;
// int  ActNumOfU ; 
//	String res ;
//	@Given("these courses are registered in the Edu-center")
//	public void theseCoursesAreRegisteredInTheEduCenter(io.cucumber.datatable.DataTable dataTable) {
//	  
//		String Id ; 
//		String name ; 
//		String Teacher_id ; 
//	   int numOfStudent; 
//     
//
//	    String date ; 
//	    int max_numOfStudent ;
//	    int price;
//		
//		for(int i=0; i<dataTable.height();i++) {
//		
//			  Id=dataTable.cell(i,0);
//			 name=dataTable.cell(i,1);
//			 Teacher_id =dataTable.cell(i,2);
//			 numOfStudent = Integer.parseInt(dataTable.cell(i,3));
//			 date =dataTable.cell(i,4);
//			 max_numOfStudent =Integer.parseInt(dataTable.cell(i,5));
//			 price = Integer.parseInt(dataTable.cell(i,6)) ;
//c= new Course (Id , name , Teacher_id,  date);
// testtt.e.Courses.add(c); 
//			
//		}
//		
//		ExnumOfU =  center.Students.size(); 
//}
//	
//	
//
//	@Given("there is a course with ID {string}  , name {string} ,Teacher_id {string},date {string}")
//	public void thereIsACourseWithIDNameTeacherIdDate(String string, String string2, String string3, String string4) {
//	    // Write code here that turns the phrase above into concrete actions
//	 c= new Course (string , string2 , string3 , string4); 
//	}
//
//
//	@When("admin try to add new course")
//	public void adminTryToAddNewCourse() {
//	    // Write code here that turns the phrase above into concrete actions
//		res = testtt.admin.add_Course(c); 
//		 ActNumOfU = center.Courses.size();
//	}
//	@Then("an error massage {string} should appear")
//	public void anErrorMassageShouldAppear(String string) {
//	    // Write code here that turns the phrase above into concrete actions
////		 assertEquals(string,res);
////	     assertEquals(ActNumOfU, ExnumOfU);
//	 
//	}
//
//
//
//}
//	
//
//
//
//
//}