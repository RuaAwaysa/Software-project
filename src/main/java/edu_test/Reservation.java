package edu_test;

public class Reservation {
	String studentid ; 
	String courseid ; 
	String notes ;
	String rid;
	boolean visited ; 
	center c=new center();
	


public Reservation (String reservationid , String studentid ,String courseid ){

	this.rid = reservationid ;
	this.studentid = studentid;
	this.courseid = courseid ; 
	this.notes = null ;
	this.visited = false ;
}


		
public boolean checkR(String S_id ,String Res_id,boolean v) {
	boolean res=false;
	for (int i=0 ;i <c.reservations.size() ;i++) {
		if(c.reservations.get(i).rid==Res_id &&c.reservations.get(i).studentid==S_id 
		  && c.reservations.get(i).visited ==v) 
			res=true;
		else res=false;
			
}
	return res;
	
}
public void addNote (String R_id , String note) {
	for (int i=0 ;i <c.reservations.size() ;i++) {
		if(c.reservations.get(i).rid==R_id)
			c.reservations.get(i).notes=note;
	}

	}
}

