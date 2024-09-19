package edu_test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import edu_test.Admin;

import io.cucumber.*;
	import io.cucumber.datatable.DataTable;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
public class Book_Appointment_Test {
	
	center cen = new center () ;
	Course c;
	Student s ;
int ExnumOfU ;
 Reservation rr ;
 String sid ;
 String cid ;
String res  ;
	@Given("This is reservation table for student")
	public void thisIsReservationTableForStudent(io.cucumber.datatable.DataTable dataTable) {
		// |ID|student_id | course_id | visited | notes |
		// | 1| 1234567 |9578|yes|good|
		String Reservation_id ; 	
		String Student_id ; 
		String  Course_id ; 
		String Notes ;
		boolean visited ; 
	//	String Reservation_id , String Student_id ,Course Course_id
		for(int i=0; i<dataTable.height();i++) {
		
			Reservation_id =dataTable.cell(i,0);
			 Student_id=dataTable.cell(i,1);
			 Course_id=dataTable.cell(i,2);
			 visited	=Boolean.parseBoolean(dataTable.cell(i,3));
			 Notes =dataTable.cell(i,4);
			
		//	testtt.e.Students.add(s);
			 rr  =new Reservation(Reservation_id ,Student_id , Course_id );
		//center.Appointments.add(rr) ;
			cen.appointments.add(rr);
	}
		ExnumOfU =  cen.appointments.size(); 
		
		
	    
	}
	
	
	@Given("these Student registered in the Center")
	public void theseStudentRegisteredInTheCenter(io.cucumber.datatable.DataTable dataTable) {
		
String Id , name ,  password , Email  , Class_degree , phone , address ;
		
		for(int i=0; i<dataTable.height();i++) {
		
			  Id=dataTable.cell(i,0);
			 name=dataTable.cell(i,1);
			 password=dataTable.cell(i,2);
			Email=dataTable.cell(i,3);
			 Class_degree =dataTable.cell(i,4);
			  phone =dataTable.cell(i,5);
			address= dataTable.cell(i,6) ;
//		Id , name ,password ,Email ,  Class_degree , phone,address 
			
			s = new Student(Id ,name , password ,Email ,Class_degree, address , phone );
			s.loginstate = true ;
			cen.students.add(s);
	    
	}
	}
	@Given("these courses avilable  to regesterd")
	public void theseCoursesAvilableToRegesterd(io.cucumber.datatable.DataTable dataTable) {
		
String Id , name ,  password , Email  , Class_degree , phone , address ;
		

	String Id1 ; 
	String name1 ; 
	String Teacher_id ; 
 int numOfStudent; 


  String date ; 
  int max_numOfStudent ;
  int price;
	
	for(int i=0; i<dataTable.height();i++) {
	
		  Id1=dataTable.cell(i,0);
		 name1=dataTable.cell(i,1);
		 Teacher_id =dataTable.cell(i,2);
		 numOfStudent = Integer.parseInt(dataTable.cell(i,3));
		 date =dataTable.cell(i,4);
		 max_numOfStudent =Integer.parseInt(dataTable.cell(i,5));
		 price = Integer.parseInt(dataTable.cell(i,6)) ;
c= new Course (Id1 , name1 , Teacher_id,  date);
cen.courses.add(c); 
		
	}
	
	}



	
	
	
	@Given("that the student is logged in and his id {string}")
	public void thatTheStudentIsLoggedInAndHisId(String string) {
		sid = string ;
		for(int i=0 ;i<cen.students.size();i++ ) {
			if((cen.students.get(i).id == string)) {
				
				cen.students.get(i).loginstate =true ;
				}
			
		}
	}

	@Given("Try to reserve course with id {string}")
	public void tryToReserveCourseWithId(String string) {
	   cid = string ;
		res = cen.Booking(cid , sid);
	}
@Given("Should see message {string}")
	public void shouldSeeMessage(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   
		  assertEquals(string,res);
		 // assertEquals(ActNumOfU, ExnumOfU);
	}	
}




