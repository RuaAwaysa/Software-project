package edu_test;


public class Teacher {
	String id ; 
	 String  name ;
	 String password; 
	 String email;
	 String phone ; 
	 

public Teacher () {}
	public boolean logedin;

	public Teacher(String Id ,String  name ,String password , String Email , String phone ) {

			 this.id=Id;
		     this.name = name ; 
		     this.password = password; 
		     this.email = Email ; 
		    this.phone =phone ; 
		 }

	public boolean checkpass(String user, String pass) {
		// TODO Auto-generated method stub
		return true;
	}


}