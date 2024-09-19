package edu_test;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Student {
	
    String id ; 
    private static final Logger logger = Logger.getLogger("mylogger");
	 String  name ;
	 String password; 
	 String email;
   String  classdegree;
	String  phone ; 
	String address ; 
	center ee ;
	boolean loginstate;


	public Student() {
		this.ee =new center();
		
	}


	 public Student(String id ,String  name ,String password , String email , String classdegree , String phone,String address ) {
		 this.id=id;
	     this.name = name ; 
	     this.password = password; 
	     this.email = email ; 
	     this.classdegree = classdegree ; 
	     this.address = address ;
	     this.phone = phone ; 
	     this.loginstate = false; 
	 }
	 
	 public String Login_s(String id , String password) {
			for(int i=0;i<ee.students.size();i++) {
				if((id.equals(ee.students.get(i).id)) && (password.equals(ee.students.get(i).password ))) {
					ee.students.get(i).loginstate = true;
			    return "Welcome "+ee.students.get(i).name;
				}
				else if((id.equals(ee.students.get(i).id)) && !(password.equals(ee.students.get(i).password )))
					ee.students.get(i).loginstate = false;
					return "incorrect password !!";
			}
			
			return "Error User doesn't exist plz check your id";
		 }
	 
Course returnACourse(String id) {
	for(int i=0 ;i<ee.courses.size();i++ ) {
		if(id.equals(ee.courses.get(i).id)) {
			return ee.courses.get(i) ; }
		
	}
return null;
}
	 
//========================================Book_apointment================================



}
