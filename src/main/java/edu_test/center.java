package edu_test;



import java.util.ArrayList;

public class center {

	
public ArrayList<Admin> adminlisttable =new ArrayList<Admin>();
public ArrayList<Student> students=new ArrayList<Student>() ;
public ArrayList<Teacher> teachers=new ArrayList<Teacher>()  ;
public	  ArrayList<Course> courses= new  ArrayList<Course>();
public	  ArrayList<Reservation> reservations= new  ArrayList<Reservation>();
public	  ArrayList<Reservation> appointments= new ArrayList<Reservation>();
public	  ArrayList<ExtraService> service =new ArrayList<ExtraService>();
	
	  public center() {
		
	}
	

	
	Course returnACourse(String id) {
		for(int i=0 ;i<courses.size();i++ ) {
			if(id.equals(courses.get(i).id)) {
				return courses.get(i) ; }
			
		
		}
	return null;
	}
	
 String Booking(String Course_id , String sid ) {
	 		Course c = returnACourse(Course_id) ;
	 		//Student ss = returnAStudent(sid);
	 		 boolean dne = true ;
	 		 int in = 0;
	 			
	 				for(int j =0 ;j<appointments.size();j++) {	
	 					if(!appointments.get(j).studentid.equals(sid)) {
	 						dne = true ;
	 					}
	 					else dne = false ;
	 					in = j ;
	 					break;
	 				}
	 				
	 			if(c.numofstudent != c.numofstudent && dne) {
	 				return c.name+" Succesfully booked ";
	 			}
	 			
	 			else if(!dne && appointments.get(in).courseid!= Course_id) {
	 				return c.name+" Succesfully booked ";
	 				
	 			
	 			}
	 	
	 	
	 			return "hi"; 
	 	 }

	
	
}
